package automationExercise;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Q26 extends TestBase {
    @Test
    public void name() {

        //    1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

        // 3. Verify that home page is visible successfully
        driver.findElement(By.xpath("/html[@lang='en']")).isDisplayed();

        //4. Scroll down page to bottom
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.END).perform();

        //5. Verify 'SUBSCRIPTION' is visible
        driver.findElement(By.xpath("//*[text()='Subscription']")).isDisplayed();

        //6. Scroll up page to top
        Actions action = new Actions(driver);
        action.sendKeys(Keys.HOME).perform();

        //7. Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen
        driver.findElement(By.xpath("(//*[text()='Full-Fledged practice website for Automation Engineers'])[1]")).isDisplayed();

    }
   }
