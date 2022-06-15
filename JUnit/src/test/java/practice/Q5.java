package practice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Q5 extends TestBase {
    @Test
    public void name() {
        // Navigate to website  https://testpages.herokuapp.com/styled/index.html
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");

        // Under the  ORIGINAL CONTENTS
        // click on Alerts
        WebElement alertButonu =driver.findElement(By.xpath("(//*[text()='Alerts (JavaScript)'])[1]"));
        alertButonu.click();

        // print the URL
        System.out.println("driver.getCurrentUrl1() = " + driver.getCurrentUrl());

        // navigate back
        driver.navigate().back();

        // print the URL
        System.out.println("driver.getCurrentUrl2() = " + driver.getCurrentUrl());

        // Click on Basic Ajax
        WebElement basicAjax=driver.findElement(By.xpath("//a[@id='basicajax']"));
        basicAjax.click();

        // print the URL
        System.out.println("driver.getCurrentUrl3() = " + driver.getCurrentUrl());

        // enter value-> 20 and Enter
        driver.findElement(By.xpath("//input[@id='lteq30']")).sendKeys("20"+Keys.ENTER);

        // and then verify Submitted Values is displayed open page

        // close driver
        driver.close();


    }

}
