package com.company;

public class Main {

    public static void main(String[] args) {
        EmailNotification newEmailNotification = new EmailNotification("Hi", "Email Notification", "person", "stmp Provider");

        newEmailNotification.transport();
        newEmailNotification.showStatus();
        newEmailNotification.protectedMethodTest();

        Object emailNotificationClone = null;
        try {
            emailNotificationClone = newEmailNotification.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        newEmailNotification.equals(emailNotificationClone);


        TextNotification newTextNotification = new TextNotification("Hi?", "Text Notification", "person2", "sms Provider2");

        newTextNotification.transport();
        newTextNotification.showStatus();
    }
}