package practice03;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBase;

import java.time.Duration;

public class Q08 extends TestBase {
    @Test
    public void test01(){


   //go to web site : https://www.jqueryscript.net/demo/bootstrap-alert-box/
   driver.get("https://www.jqueryscript.net/demo/bootstrap-alert-box/");
   //click on action dialog button
   driver.findElement(By.xpath("//button[@id='action']")).click();

   //if need use explicitly wait
   WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));

   wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class = 'modal-body']"))));
    //wait.until(ExpectedConditions.elementToBeClickable(By.id("dialog-mycodemyway-action"))).click(); bu da olur

    WebElement textmsj=driver.findElement(By.xpath("//div[@class = 'modal-body']"));

     Assert.assertTrue(textmsj.isDisplayed());

    //click on the ok button
        driver.findElement(By.xpath("//button[@id=\"dialog-mycodemyway-action\"]")).click();

    //accept the alert message
        driver.switchTo().alert().accept();

    }

}
