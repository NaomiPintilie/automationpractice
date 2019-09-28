package teste;

import framework.Basetest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.peer.ListPeer;
import java.util.List;

public class List_webElements_Test extends Basetest {
    @Test
    public void testbutoane() {
        List<WebElement> hobbiesweb = driver.findElements(By.xpath("//input[@type='checkbox']")); //heap - spatiu dinamic
        List<WebElement> hobbiesTextWeb = driver.findElements(By.xpath("//label[@class='checks']"));

        //validare butoane
        int expectedresult = 3;//stack -spatiu static
        int actualresult = hobbiesweb.size();
        Assert.assertEquals(expectedresult, actualresult);

        for (int i = 0;i <= hobbiesweb.size()-1; i++) {
            String expectedResult = "Movies";
            String actualResult = hobbiesTextWeb.get(i).getText();
            if (actualResult.equals(expectedResult)) {
                hobbiesTextWeb.get(i).click();
            }

        }

    }
}