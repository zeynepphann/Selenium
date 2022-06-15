package automationExercise;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Q16 extends TestBase {
    @Test
    public void name() {
        //    1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

        // 3. Verify that home page is visible successfully
        driver.findElement(By.xpath("/html[@lang='en']")).isDisplayed();

        //4. Click 'Signup / Login' button
        driver.findElement(By.xpath("//*[text()=' Signup / Login']")).click();

        //5. Fill email, password and click 'Login' button

        WebElement girisKutusu=driver.findElement(By.xpath("(//input[@type='email'])[1]"));
        Actions actions=new Actions(driver);
        actions.click(girisKutusu)
                .sendKeys("ssieiesemeuh@gmail.com")
                .sendKeys(Keys.TAB)
                .sendKeys("12345")
                .perform();

        driver.findElement(By.xpath("//*[text()='Login']")).click();

        //6. Verify 'Logged in as username' at top
        driver.findElement(By.xpath("//*[text()=' Logged in as ']")).isDisplayed();

        //7. Add products to cart
        driver.findElement(By.xpath("(//*[text()='Add to cart'])[10]")).click();

        //8. Click 'Cart' button
        driver.findElement(By.xpath("//*[text()=' Cart']")).click();

        //9. Verify that cart page is displayed
        driver.findElement(By.xpath("(//div[@class='container'])[2]")).isDisplayed();

        //10. Click Proceed To Checkout
        driver.findElement(By.xpath("//*[text()='Proceed To Checkout']")).click();

        //11. Verify Address Details and Review Your Order
        driver.findElement(By.xpath("//div[@class = 'checkout-information']")).isDisplayed();
        driver.findElement(By.xpath("//div[@class = 'table-responsive cart_info']")).isDisplayed();


        //12. Enter description in comment text area and click 'Place Order'
        //13. Enter payment details: Name on Card, Card Number, CVC, Expiration date
        //14. Click 'Pay and Confirm Order' button
        //15. Verify success message 'Your order has been placed successfully!'
        //16. Click 'Delete Account' button
        //17. Verify 'ACCOUNT DELETED!' and click 'Continue' button
    }

}
