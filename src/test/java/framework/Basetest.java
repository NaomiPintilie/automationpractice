package framework;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Basetest {
    public WebDriver driver;

    //folosire @Before
    @Before
    public void setup(){
     //selectare driver Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Register.html");
        // browser mare(full screen)
        driver.manage().window().maximize();

        //declarare wait implicit
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
    //folosire@After
    /*@After
    public void end(){
        driver.quit();
    */
    }

