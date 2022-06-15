package automationExercise;

import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

import java.security.AccessControlContext;
import java.security.Key;

public class Q14 extends TestBase {
    @Test
    public void name() {

        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

        // 3. Verify that home page is visible successfully
        driver.findElement(By.xpath("/html[@lang='en']")).isDisplayed();

        //4. Add products to cart
        driver.findElement(By.xpath("(//a[@class='btn btn-default add-to-cart'])[1]")).click();

        //5. Click 'Cart' button
        driver.findElement(By.xpath("//*[text()='Continue Shopping']")).click();
        driver.findElement(By.xpath("//*[text()=' Cart']")).click();

        //6. Verify that cart page is displayed
        driver.findElement(By.xpath("(//div[@class='container'])[2]")).isDisplayed();

        //7. Click Proceed To Checkout
        driver.findElement(By.xpath("//*[text()='Proceed To Checkout']")).click();

        //8. Click 'Register / Login' button
        driver.findElement(By.xpath("//*[text()='Register / Login']")).click();

        //9. Fill all details in Signup and create account

        WebElement girisKutusu=driver.findElement(By.xpath("//input[@data-qa='signup-name']"));
        Actions actions=new Actions(driver);

        actions.click(girisKutusu)
                .sendKeys("zynp")
                .sendKeys(Keys.TAB)
                .sendKeys("ssieiesemeuh@gmail.com")
                .perform();


        driver.findElement(By.xpath("//*[text()='Signup']")).click();

        driver.findElement(By.xpath("//input[@id='id_gender2']")).click();

        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345");

        WebElement drapDown1=driver.findElement(By.xpath("//select[@id='days']"));
        Select select1=new Select(drapDown1);
        select1.selectByVisibleText("2");

        WebElement drapDown2=driver.findElement(By.xpath("//select[@id='months']"));
        Select select2=new Select(drapDown2);
        select2.selectByValue("5");

        WebElement drapDown3=driver.findElement(By.xpath("//select[@id='years']"));
        Select select3=new Select(drapDown3);
        select3.selectByValue("1999");
        driver.findElement(By.xpath("//input[@id='newsletter']")).click();
        driver.findElement(By.xpath("//input[@name='optin']")).click();

        driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("isim");
        driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("soyisim");
        driver.findElement(By.xpath("//input[@data-qa='address']")).sendKeys("Street address, P.O. Box, Company name");

        WebElement ulkeAdi=driver.findElement(By.xpath("//select[@id='country']"));
        Select select4=new Select(ulkeAdi);
        select4.selectByValue("Canada");
        driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Ontorio");
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Toronto");
        driver.findElement(By.xpath("//input[@data-qa='zipcode']")).sendKeys("66777");
        driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("+490555555554");
        driver.findElement(By.xpath("//*[text()='Create Account']")).click();

        //10. Verify 'ACCOUNT CREATED!' and click 'Continue' button
        driver.findElement(By.xpath("//*[text()='Account Created!']")).isDisplayed();
        driver.findElement(By.xpath("//*[text()='Continue']")).click();

        //11. Verify ' Logged in as username' at top
        driver.findElement(By.xpath("//div//li[9]")).isDisplayed();

        //12.Click 'Cart' button
        driver.findElement(By.xpath("//*[text()=' Cart']")).click();

        //13. Click 'Proceed To Checkout' button
        driver.findElement(By.xpath("//*[text()='Proceed To Checkout']")).click();

        //14. Verify Address Details and Review Your Order

        //15. Enter description in comment text area and click 'Place Order'
        driver.findElement(By.xpath("//textarea[@class='form-control']")).sendKeys("SIPARIS MESAJI ");
        driver.findElement(By.xpath("//*[text()='Place Order']")).click();

        //16. Enter payment details: Name on Card, Card Number, CVC, Expiration date

        WebElement isimKutusu=driver.findElement(By.xpath("//input[@name='name_on_card']"));
        Faker faker=new Faker();

        actions.click(isimKutusu)
                .sendKeys(faker.name().fullName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.business().creditCardNumber())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.business().creditCardExpiry())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.business().creditCardExpiry())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.business().creditCardExpiry())
                .perform();




        //17. Click 'Pay and Confirm Order' button
        driver.findElement(By.xpath("//*[text()='Pay and Confirm Order']")).click();

        //18. Verify success message 'Your order has been placed successfully!'
        //19. Click 'Delete Account' button
        //20. Verify 'ACCOUNT DELETED!' and click 'Continue' button
    }

}
