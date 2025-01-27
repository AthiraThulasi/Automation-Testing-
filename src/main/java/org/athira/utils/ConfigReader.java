package org.athira.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

    public class ConfigReader {

        private final Properties properties; // instance variable

        public ConfigReader() {   // Constructor of the ConfigReader class
            properties = new Properties(); // Create a new Properties object
            try (FileInputStream inputStream = new FileInputStream("src/main/resources/config.properties")) {
                properties.load(inputStream); // Load the properties file
            } catch (IOException e) {
                e.printStackTrace(); // Handle the exception if file is not found or error occurs
            }
        }

        // Method to get value of a property by its key
        public String getProperty(String key) {
            return properties.getProperty(key);
        }
    }


