package org.example.dekorator;

public class OutMail implements Service{
String text="Mail send";

    public String getText() {
        return text;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(text);
    }
}
