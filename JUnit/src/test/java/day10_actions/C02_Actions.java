package day10_actions;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import javax.swing.*;
import java.lang.reflect.AccessibleObject;

public class C02_Actions extends TestBase {
    @Test
    public void test02() throws InterruptedException {
        // amazon ana sayfaya gidip
        // account menusunden create a list linkine tiklayalim

        driver.get("https://www.amazon.com");
        Actions actions=new Actions(driver);
        WebElement accountLinki=driver.findElement(By.xpath("//*[text()='Account & Lists']"));
        actions.moveToElement(accountLinki).perform();// perform olmali moveToElement yanas demek yani elementin  ustune gidiyor

        driver.findElement(By.xpath("//*[text()='Create a List']")).click();
        Thread.sleep(4000);
    }
}
