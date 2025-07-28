import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { DomSanitizer, SafeHtml } from '@angular/platform-browser';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
})
export class AppComponent implements OnInit {
  title = 'dynamic-website-frontend';
  dynamicHtmlContent: SafeHtml = '';

  constructor(private http: HttpClient, private sanitizer: DomSanitizer) {}

  ngOnInit(): void {
    this.fetchDynamicHtml();
  }

  fetchDynamicHtml(): void {
    // Note: Use 'backend' as the hostname because of Docker Compose service name
    this.http.get('http://backend:8080/api/dynamic-html', { responseType: 'text' })
      .subscribe(
        (htmlString) => {
          this.dynamicHtmlContent = this.sanitizer.bypassSecurityTrustHtml(htmlString);
        },
        (error) => {
          console.error('Error fetching dynamic HTML:', error);
          this.dynamicHtmlContent = this.sanitizer.bypassSecurityTrustHtml(
            '<h1>Error loading content. Please check the backend service.</h1>'
          );
        }
      );
  }
}
