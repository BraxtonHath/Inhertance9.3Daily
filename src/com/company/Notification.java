package com.company;

import java.time.LocalDateTime;

public class Notification {
    private LocalDateTime createdAt;
    private String subject;
    private String body;
    protected String status = "All Good";

    public Notification(String subject, String body) {
        this.subject = subject;
        this.body = body;
        this.createdAt = LocalDateTime.now();
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public void transport() {
        try {
            throw new NoTransportException();
        } catch (NoTransportException e) {
            System.out.println("Throwing NoTransportException");
        }
    }

    public void showStatus() {
        System.out.println(this.status);
    }

    protected void protectedMethodTest () {
        System.out.println("protected method!");
    }
}
