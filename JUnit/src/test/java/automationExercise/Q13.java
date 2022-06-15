package automationExercise;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Q13 extends TestBase {
    @Test
    public void name() {
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

        // 3. Verify that home page is visible successfully
        driver.findElement(By.xpath("/html[@lang='en']")).isDisplayed();

        //4. Click 'View Product' for any product on home page
        driver.findElement(By.xpath("(//*[text()='View Product'])[4]")).click();

        //5. Verify product detail is opened
        driver.findElement(By.xpath("//div[@class='product-information']")).isDisplayed();

        //6. Increase quantity to 4
        WebElement urunSayisi=driver.findElement(By.xpath("//input[@id='quantity']"));
        urunSayisi.clear();

        // actions.click(driver.findElement(By.id("quantity"))).
        // sendKeys(Keys.ARROW_LEFT)
        //.sendKeys(Keys.DELETE).sendKeys("4").perform();
        urunSayisi.sendKeys("4");

        //7. Click 'Add to cart' button
        driver.findElement(By.xpath("//button[@type='button']")).click();

        //8. Click 'View Cart' button
        driver.findElement(By.xpath("//*[text()='View Cart']")).click();

        //9. Verify that product is displayed in cart page with exact quantity
        driver.findElement(By.xpath("//*[text()='4']")).isDisplayed();
    }

}
