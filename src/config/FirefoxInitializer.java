/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

/**
 *
 * @author eminda
 */
public class FirefoxInitializer {
    private  static FirefoxDriver driver;

    private FirefoxInitializer(){
        System.setProperty("webdriver.gecko.driver", "/var/lib/tomcat8/geckodriver");
        FirefoxOptions options = new FirefoxOptions();
        options.setHeadless(true);

        driver = new FirefoxDriver(options);
    }

    public static synchronized FirefoxDriver getDriver(){
        if(driver==null){
            new FirefoxInitializer();
        }
        return driver;
    }
    
    public static void refresh(){
        driver.navigate().refresh();
    }
}

