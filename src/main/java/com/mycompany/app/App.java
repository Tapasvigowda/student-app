package com.mycompany.app;

public class App {

    private static final String MESSAGE = "Hello this is my World!";

    public static void main(String[] args) throws Exception {

        System.out.println(MESSAGE);

        while (true) {
            Thread.sleep(60000);
        }
    }
}
