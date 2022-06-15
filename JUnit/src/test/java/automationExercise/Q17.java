package automationExercise;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.rmi.server.UnicastRemoteObject;

public class Q17 extends TestBase {
    @Test
    public void name() {

        //    1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

        // 3. Verify that home page is visible successfully
        driver.findElement(By.xpath("/html[@lang='en']")).isDisplayed();

        //4. Add products to cart
        driver.findElement(By.xpath("(//*[text()='Add to cart'])[1]")).click();
        driver.findElement(By.xpath("//*[text()='Continue Shopping']")).click();

        //5. Click 'Cart' button
        driver.findElement(By.xpath("//*[text()=' Cart']")).click();

        //6. Verify that cart page is displayed
        driver.findElement(By.xpath("//div[@class='table-responsive cart_info']")).isDisplayed();

        //7. Click 'X' button corresponding to particular product
        driver.findElement(By.xpath("//i[@class='fa fa-times']")).click();

        //8. Verify that product is removed from the cart
       driver.findElement(By.xpath("//*[text()='Cart is empty!']")).isDisplayed();


    }

}
