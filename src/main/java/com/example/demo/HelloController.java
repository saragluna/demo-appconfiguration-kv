package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final MessageProperties properties;

    @Value("${azure.cosmosdb.key:local}")
    private String cosmosDBkey;

    public HelloController(MessageProperties properties) {
        this.properties = properties;
    }

    @GetMapping
    public String getMessage() {
        return "Message: " + properties.getMessages() + " Cosmos key: " + cosmosDBkey;
    }

}
