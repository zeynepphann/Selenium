package automationExercise;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class Q09 extends TestBase {
    @Test
    public void test01() throws InterruptedException {
        // 1. Launch browser
        // 2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

        // 3. Verify that home page is visible successfully
        driver.findElement(By.xpath("/html[@lang='en']")).isDisplayed();

        // 4. Click on 'Products' button
        driver.findElement(By.xpath("//*[text()=' Products']")).click();

        // 5. Verify user is navigated to ALL PRODUCTS page successfully
        driver.findElement(By.xpath("//*[text()='All Products']")).isDisplayed();

        // 6. Enter product name in search input and click search button
        driver.findElement(By.xpath("//input[@name='search']")).sendKeys("shirt");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@id='submit_search']")).click();

        // 7. Verify 'SEARCHED PRODUCTS' is visible
        driver.findElement(By.xpath("//*[text()='Searched Products']")).click();

        // 8. Verify all the products related to search are visible
        driver.findElement(By.xpath("//div[@class='features_items']")).isDisplayed();

    }

}
