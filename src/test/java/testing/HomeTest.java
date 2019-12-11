package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HomeTest {



    @Test
    public void setup(){


        System.setProperty("webdriver.chrome.driver", "/Users/papia/Desktop/TestNGProject/DriversForBrowser/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();





        driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("Iphone");
        driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).click();
        driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).clear();





    }



}
