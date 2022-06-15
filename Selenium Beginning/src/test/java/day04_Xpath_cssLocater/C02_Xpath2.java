package day04_Xpath_cssLocater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

// BASINDA IKI// VARSA XPATH EGER YOKSA TAGNAME'DIR

public class C02_Xpath2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));



        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        // 2- Add Element butonuna basin
        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click(); // tek sefe bu elementi kullanacaksak webelement'e
                                                                                   // atamamiza gerek yok direk click yapabiliriz
        // 3- Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButonu=driver.findElement(By.xpath("//button[@class='added-manually']"));
        if (deleteButonu.isDisplayed()){
            System.out.println("delete butonu testi PASSED");
        }else
            System.out.println("delete butonu testi FAILED");

        //4- Delete tusuna basin
        deleteButonu.click();


        //  5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement removeButonu=driver.findElement(By.xpath("//h3"));
        if (removeButonu.isDisplayed()){
            System.out.println("remove butonu testi PASSED");
        }else
            System.out.println("remove butonu testi FAILED");

        driver.close();


    }
}
