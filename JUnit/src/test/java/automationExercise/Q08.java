package automationExercise;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class Q08 extends TestBase {

    @Test
    public void test01() throws InterruptedException {
     //  1. Launch browser
     //  2. Navigate to url 'http://automationexercise.com'
             driver.get("http://automationexercise.com");

     //  3. Verify that home page is visible successfully
             driver.findElement(By.xpath("/html[@lang='en']")).isDisplayed();

     //  4. Click on 'Products' button
        driver.findElement(By.xpath("//*[text()=' Products']")).click();

     //  5. Verify user is navigated to ALL PRODUCTS page successfully
        driver.findElement(By.xpath("//*[text()='All Products']")).isDisplayed();

     //  6. The products list is visible
        driver.findElement(By.xpath("//html[@lang='en']")).isDisplayed();

     //  7. Click on 'View Product' of first product
        driver.findElement(By.xpath("(//*[text()='View Product'])[1]")).click();
        Thread.sleep(3000);

     //  8. User is landed to product detail page
        driver.findElement(By.xpath("(//div[@class=\"row\"])[2]\n")).isDisplayed();

     //  9. Verify that detail detail is visible: product name, category, price, availability, condition, brand
        driver.findElement(By.xpath("//*[text()='Blue Top']")).isDisplayed();
        driver.findElement(By.xpath("//*[text()='Category: Women > Tops']")).isDisplayed();
        driver.findElement(By.xpath("//*[text()='Rs. 500']")).isDisplayed();
        driver.findElement(By.xpath("//*[text()='Availability:']")).isDisplayed();
        driver.findElement(By.xpath("//*[text()='Condition:']")).isDisplayed();
        driver.findElement(By.xpath("//*[text()='Brand:']")).isDisplayed();



    }
}
