package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "config")
public class MessageProperties {

    private String messages;

    public String getMessages() {
        return messages;
    }

    public void setMessages(String message) {
        this.messages = message;
    }

}
