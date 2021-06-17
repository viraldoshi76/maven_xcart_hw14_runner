package com.xcart.mobile.propertyreader;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyReader {

    /**
     * rules for implementing singleton design pattern
     * 1. make the constructor private
     * 2.create a static method to get the instance
     * 3. create a static member variable
     */

    //Declare the PropertyReader variable
    private static volatile PropertyReader propInstance;

    //Create Private constructor Because of prevent the Instantiation of class
    private PropertyReader() {

    }

    /**
     * This method will return instance of PropertyReader class
     * @return
     */
    public static synchronized PropertyReader getInstance(){
        if (propInstance == null){
            propInstance = new PropertyReader();// it will create object if propinstance is null
        }
        return propInstance;
    }

    /**
     * This method will read property from property file
     * @param propertyName
     * @return
     */
    public String getProperty(String propertyName){

        Properties prop = new Properties();
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(System.getProperty("user.dir")+"/src/test/java/resources/propertiesfile/config.properties");
            prop.load(inputStream);
            if (prop.getProperty(propertyName) != null){
                return prop.getProperty(propertyName);
            }
        } catch (Exception e) {
            System.out.println("Property not found");
        }
        return null;
    }

    /*public static void main(String[] args) {  // to check wether the path is right or not
        System.out.println(PropertyReader.getInstance().getProperty("browser"));
        System.out.println(PropertyReader.getInstance().getProperty("baseUrl"));
        System.out.println(PropertyReader.getInstance().getProperty("implicitlyWait"));
    }*/


}
