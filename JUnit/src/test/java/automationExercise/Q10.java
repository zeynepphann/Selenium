package automationExercise;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Q10 extends TestBase {
    @Test
            public void test01(){

        // 1. Launch browser
        // 2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

        // 3. Verify that home page is visible successfully
        driver.findElement(By.xpath("/html[@lang='en']")).isDisplayed();

        // 4. Scroll down to footer

        // 5. Verify text 'SUBSCRIPTION'
        driver.findElement(By.xpath("//*[text()='Subscription']")).isDisplayed();

        // 6. Enter email address in input and click arrow button
        driver.findElement(By.xpath("//input[@id='susbscribe_email']")).sendKeys("ssjjjd@gmai.com");
        // 7. Verify success message 'You have been successfully subscribed!' is visible
         driver.findElement(By.xpath("//button[@id='subscribe']")).click();
    }
   }
