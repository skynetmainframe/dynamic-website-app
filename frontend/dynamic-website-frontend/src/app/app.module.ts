import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser'; // DomSanitizer is not needed here
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component'; // Still import the component

@NgModule({
  // declarations: [ // <--- REMOVE OR COMMENT OUT THE 'declarations' ARRAY ENTIRELY
  //   AppComponent
  // ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppComponent // <--- IMPORT THE STANDALONE COMPONENT HERE
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
