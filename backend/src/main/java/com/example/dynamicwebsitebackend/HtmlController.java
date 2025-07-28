package com.example.dynamicwebsitebackend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@CrossOrigin(origins = "*") // Allows requests from any origin for development
public class HtmlController {

    @GetMapping("/api/dynamic-html")
    public String getDynamicHtml() {
        // This HTML is served dynamically from the backend
        return "<!DOCTYPE html>\n" +
               "<html>\n" +
               "<head>\n" +
               "    <title>My Simple Dynamic Website</title>\n" +
               "    <style>\n" +
               "        body {\n" +
               "            font-family: Arial, sans-serif;\n" +
               "            text-align: center;\n" +
               "            margin-top: 50px;\n" +
               "            background-color: #f0f0f0;\n" +
               "            color: #333;\n" +
               "        }\n" +
               "        h1 {\n" +
               "            color: #007bff;\n" +
               "        }\n" +
               "    </style>\n" +
               "</head>\n" +
               "<body>\n" +
               "    <h1>Hello from my Dockerized Dynamic Website (Spring Boot Backend)!</h1>\n" +
               "    <p>This content was fetched dynamically.</p>\n" +
               "</body>\n" +
               "</html>";
    }
}
