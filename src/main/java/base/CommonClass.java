package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public  class CommonClass {
   // protected static WebDriver driver=null;

    public static WebDriver driver=null;

    public void setup(){


        System.setProperty("webdriver.chrome.driver", "/Users/papia/Desktop/TestNGProject/DriversForBrowser/chromedriver");

        driver  = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    public void close(){
        driver  = new ChromeDriver();

        driver.close();

    }








}