package com.training.maven;

import org.apache.log4j.Logger;


public class App {
    private static Logger LOGGER = Logger.getLogger(App.class);

    public static void main(String[] args) {
        LOGGER.info("first maven log");

        System.out.println("Hello World!");
    }
}
