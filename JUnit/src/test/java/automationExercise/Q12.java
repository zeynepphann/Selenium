package automationExercise;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Q12 extends TestBase {
    @Test
    public void name() {
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

        // 3. Verify that home page is visible successfully
        driver.findElement(By.xpath("/html[@lang='en']")).isDisplayed();
        //4. Click 'Products' button
        driver.findElement(By.xpath("//*[text()=' Products']")).click();

        //5. Hover over first product and click 'Add to cart'
        driver.findElement(By.xpath("(//a[@class='btn btn-default add-to-cart'])[1]")).click();

        // 6. Click 'Continue Shopping' button
        driver.findElement(By.xpath("//*[text()='Continue Shopping']")).click();

        //7. Hover over second product and click 'Add to cart'
        driver.findElement(By.xpath("(//a[@class='btn btn-default add-to-cart'])[3]")).click();

        //8. Click 'View Cart' button
        driver.findElement(By.xpath("//*[text()='View Cart']")).click();

        //9. Verify both products are added to Cart
        driver.findElement(By.id("product-1")).isDisplayed();
        driver.findElement(By.id("product-2")).isDisplayed();

        //10. Verify their prices, quantity and total price

        WebElement ilkurunFiyat= driver.findElement(By.xpath("//*[text()='Rs. 500'])[1])"));
        Assert.assertTrue(ilkurunFiyat.isEnabled());

        WebElement ikinciurunFiyat= driver.findElement(By.xpath("(//*[text()='Rs. 400'])[1]"));
        Assert.assertTrue(ikinciurunFiyat.isEnabled());

        WebElement ilkUrunAdedi=driver.findElement(By.xpath("(//*[text()='1'])[1]"));
        Assert.assertTrue(ilkUrunAdedi.isEnabled());

        WebElement ikinciUrunAdedi=driver.findElement(By.xpath("(//*[text()='1'])[2]"));
        Assert.assertTrue(ikinciUrunAdedi.isEnabled());


        WebElement ilkUrunToplamMiktar=driver.findElement(By.xpath("(//*[text()='Rs. 500'])[2]"));
        Assert.assertTrue(ilkUrunToplamMiktar.isEnabled());

        WebElement ikinciUrunToplamMiktar=driver.findElement(By.xpath("(//*[text()='Rs. 400'])[2]"));
        Assert.assertTrue(ikinciUrunToplamMiktar.isEnabled());



    }

}
