package automationExercise;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Q22 extends TestBase {
    @Test
    public void name() {

        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

        // 3. Scroll to bottom of page
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.END).perform();


        //4. Verify 'RECOMMENDED ITEMS' are visible
        driver.findElement(By.xpath("//*[text()='recommended items']")).isDisplayed();


        //5. Click on 'Add To Cart' on Recommended product
        driver.findElement(By.xpath("(//a[@data-product-id='5'])[3]")).click();

        //6. Click on 'View Cart' button
        driver.findElement(By.xpath("//*[text()='View Cart']")).click();

        //7. Verify that product is displayed in cart page
        driver.findElement(By.xpath("//tr[@id='product-5']")).isDisplayed();

    }

}
