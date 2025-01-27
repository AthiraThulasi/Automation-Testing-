package org.athira.app;

import org.athira.utils.ConfigReader;

public class Main {
    public static void main(String[] args) {
        // Instantiate ConfigReader
        ConfigReader configReader = new ConfigReader();

        // Fetch property values
        String username = configReader.getProperty("username");
        String password = configReader.getProperty("password");

        // Print the values to verify
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}
