package automationExercise;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

public class Q23 extends TestBase {
    @Test
    public void name() {

        //    1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

        // 3. Verify that home page is visible successfully
        driver.findElement(By.xpath("/html[@lang='en']")).isDisplayed();

        //4. Click 'Signup / Login' button
        driver.findElement(By.xpath("//*[text()=' Signup / Login']")).click();

        //5. Fill all details in Signup and create account

        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Zeynep");
        driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("blbla134@gmail.com");
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

        driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Zeynep");
        driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Hn");
        driver.findElement(By.xpath("//input[@data-qa='address']")).sendKeys("Street address, P.O. Box, Company name, etc.");

        WebElement ulkeAdi=driver.findElement(By.xpath("//select[@id='country']"));
        Select select4=new Select(ulkeAdi);
        select4.selectByValue("Canada");
        driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Ontorio");
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Toronto");
        driver.findElement(By.xpath("//input[@data-qa='zipcode']")).sendKeys("66777");
        driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("+490555555555");
        driver.findElement(By.xpath("//*[text()='Create Account']")).click();
        driver.findElement(By.xpath("//*[text()='Account Created!']")).isDisplayed();
        driver.findElement(By.xpath("//*[text()='Continue']")).click();

        //7. Verify ' Logged in as username' at top
        driver.findElement(By.xpath("//*[text()=' Logged in as ']")).isDisplayed();

        //8. Add products to cart
        driver.findElement(By.xpath("(//a[@class='btn btn-default add-to-cart'])[1]")).click();

        //9. Click 'Cart' button
        driver.findElement(By.xpath("//*[text()='Continue Shopping']")).click();
        driver.findElement(By.xpath("//*[text()=' Cart']")).click();

        //10. Verify that cart page is displayed
        driver.findElement(By.xpath("(//div[@class='container'])[2]")).isDisplayed();

        //11. Click Proceed To Checkout
        driver.findElement(By.xpath("//*[text()='Proceed To Checkout']")).click();

        //12. Verify that the delivery address is same address filled at the time registration of account
        //13. Verify that the billing address is same address filled at the time registration of account

        //14. Click 'Delete Account' button
        driver.findElement(By.xpath("//*[text()=' Delete Account']")).click();

        //15. Verify 'ACCOUNT DELETED!' and click 'Continue' button

    }

}
