package teste;

import framework.Basetest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Register_teste extends Basetest {
    public WebDriver driver;

    @Test
    //setare driver chrome

    public void test() {
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Register.html");
        // browser mare(full screen)
        driver.manage().window().maximize();

        //validare pagina de register
        //automatizarea
        //o pagina are web elemente cu care se poate interactiona de 1 sau mai multe ori
        //un web element are o adresa exacta data de un cod html, xpath
        //completare camp First Name
        WebElement firstnameWeb = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        String firstnameValue = "Naomi";
        firstnameWeb.sendKeys(firstnameValue);

        //click pe gen
        WebElement genderWeb = driver.findElement((By.xpath("//input[@value='Male']")));
        genderWeb.click();

        //click pe Hobby
        WebElement hobbyWeb = driver.findElement(By.id("checkbox1"));
        genderWeb.click();


        //selelctare skills
        WebElement skillsWeb = driver.findElement(By.id("Skills"));
        String skillsvalue = "C";
        Select skillsSelect = new Select(skillsWeb);
        skillsSelect.selectByVisibleText(skillsvalue);

        //selectare year
        WebElement yearWeb = driver.findElement(By.id("yearbox"));
        String yearvalue = "2000";
        Select yearSelect = new Select(yearWeb);
        yearSelect.selectByValue(yearvalue);

        //validare pagina de register
        String expectedRegistervalue = "Register";
        String actualRegsitervalue = driver.getTitle();
        Assert.assertEquals(expectedRegistervalue, actualRegsitervalue);
//selectare day
        WebElement dayWeb = driver.findElement(By.id("daybox"));
        String dayValue = "12";
        Select dayselect = new Select((dayWeb));
        dayselect.selectByValue(dayValue);
//selectare month
        WebElement monthweb = driver.findElement(By.xpath("//select[@placeholder='Month']"));
        String monthvalue = "November";
        Select monthselect = new Select(monthweb);
        monthselect.selectByValue(monthvalue);
        // validare mesaj Date of Birth
        WebElement dateofbirthWebmessage = driver.findElement(By.xpath("//label[contains(text(),'Birth')]"));
        String expectedMessage = "Date Of Birth";
        String actualMessage = dateofbirthWebmessage.getText();
        Assert.assertEquals("Valorile sunt diferite", expectedMessage, actualMessage);

        //hover Switch to
        WebElement switchtoWeb = driver.findElement(By.xpath("//a[contains(text(),'Switch')]"));
        Actions action4 = new Actions(driver);
        action4.moveToElement(switchtoWeb).build().perform();
        //aplicare de wait explicit
        WebElement windowsWeb=driver.findElement(By.xpath("//a[contains(text)(),'Windows')]"));
        new WebDriverWait(driver,2000).until(ExpectedConditions.visibilityOf(windowsWeb));
        windowsWeb.click();
        //validare pagina Windows
        String expectedeWindowsvalue="Frame & windows";
        String actualWindowsvalue=driver.getTitle();
        Assert.assertEquals(expectedeWindowsvalue,actualWindowsvalue);

        //inchiedere browser
        // driver.quit- inchide toate taburile driver.close - inchiede tab-ul curent
        //driver.quit();
    }

}

// buna ziua