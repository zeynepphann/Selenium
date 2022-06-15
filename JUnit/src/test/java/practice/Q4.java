package practice;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class Q4 extends TestBase {
    @Test
    public void name() {

        // ...Exercise4...
        // Navigate to  https://testpages.herokuapp.com/styled/index.html
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        // Click on  Calculate under Micro Apps
        driver.findElement(By.xpath("//*[text()='Calculator']")).click();

        //    Type any number in the first input
        driver.findElement(By.xpath("//input[@id='number1']")).sendKeys("4");

        //    Type any number in the second input
        driver.findElement(By.xpath("//input[@id='number2']")).sendKeys("74");

        // Click on Calculate
        driver.findElement(By.xpath("//input[@id='calculate']")).click();

        // Get the result
        // Print the result

        System.out.println(driver.findElement(By.xpath("//*[text()='Answer : ']")).getText());
    }

}
