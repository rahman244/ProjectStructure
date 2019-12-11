package testing;

import WebElementsforHome.Home;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HomeTest {



    @Test
    public void searchBoxTest(){


        Home.searchBox();



    }



}
