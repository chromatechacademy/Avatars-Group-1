package com.chromatech.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    /*
     * THIS IS A STANDARD CONFIG READER CLASS
     *  //this code read the file properties retrieves the value of the key from the file LocalTestSettings.properties
     */
    static Properties prop;

    // STEP 1 - READ THE FILE OF LocalTestSettings.properties from Config/resources
    //we read this method and need to pass the path file of LocalTestSettings.properties
    public static Properties readProperties(String filePath){
        try {
            FileInputStream fis = new FileInputStream(filePath);
            prop = new Properties();
            prop.load(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }

    // STEP 2: RETRIEVE VALUES FROM PROPERTIES FILE OF LocalTestSettings.properties from Config/resources - key is browser
    public static String getPropertyValue(String key){
        return prop.getProperty(key);
    }
    
}
