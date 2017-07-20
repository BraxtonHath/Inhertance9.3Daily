package com.company;

public class EmailNotification extends Notification{
    private String recipient;
    private String smtpProvider;
    protected String status;

    public EmailNotification(String subject, String body, String recipient, String smtpProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smtpProvider = smtpProvider;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSmtpProvider() {
        return smtpProvider;
    }

    @Override
    public void transport() {
        System.out.println("Recipient: " + this.recipient + ", smtp Provider: " + this.smtpProvider + ", Subject: " + getSubject() + ", Body: " + getBody() + ", Created At: " + getCreatedAt());
    }

    @Override
    public void protectedMethodTest() {
        super.protectedMethodTest();
        System.out.println("Message from EmailNotification class!");
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        EmailNotification clonedEmailNotification = new EmailNotification(this.getSubject(), this.getBody(), this.getRecipient(), this.smtpProvider);
        return clonedEmailNotification;
    }
}