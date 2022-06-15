package automationExercise;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Q21 extends TestBase {
    @Test
    public void name() throws InterruptedException {

        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

        //3. Click 'Products' button
        driver.findElement(By.xpath("//*[text()=' Products']")).click();

        //4. Verify user is navigated to ALL PRODUCTS page successfully
        driver.findElement(By.xpath("(//div[@class='container'])[3]")).isDisplayed();

        //5. Click on 'View Product' button
        driver.findElement(By.xpath("(//*[text()='View Product'])[4]")).click();

        //6. Verify 'Write Your Review' is visible
        driver.findElement(By.xpath("//*[text()='Write Your Review']")).isDisplayed();

        //7. Enter name, email and review
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Zeynep");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sksksk@gmail.com");
        driver.findElement(By.xpath("//textarea[@id='review']")).sendKeys("bla  bla");

        //8. Click 'Submit' button
        driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();

        //9. Verify success message 'Thank you for your review.'
        WebElement yazi=driver.findElement(By.xpath("//*[text()='Thank you for your review.']"));
        String expectedYazi="Thank you for your review.";
        String actualYazi=yazi.getText();

        Assert.assertEquals(expectedYazi,actualYazi);

        driver.close();
    }

}
