package deneme;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day03_C04 {
    public static void main(String[] args) {
         /*
        1-amazon.com'a gidip arama kutusunu locate edin
        2-arama kutusunun tagname'nin input old. test edin
        3-arama kutusunun name attribute'nun degerinin.... oldugunu test edin
         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1-amazon.com'a gidip arama kutusunu locate edin
        driver.get("https://www.amazon.com");
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));

        //2-arama kutusunun tagname'nin input old. test edin
        String expectedTagName="input";
        String actualTagName=aramaKutusu.getTagName();

        if (expectedTagName.equals(actualTagName)){
            System.out.println("TagName test PASSED ");
        }else    System.out.println("TagName test FAILED");


        //3-arama kutusunun name attribute'nun degerinin field-keywords oldugunu test edin
        String expectedNameDegeri="field-keywords";
        String actualNameDegeri=aramaKutusu.getAttribute("name");// name'in degerini getirecek

        if (expectedNameDegeri.equals(actualNameDegeri)){
            System.out.println("NameDegeri test PASSED ");
        }else    System.out.println("NameDegeri test FAILED");




    }
}
