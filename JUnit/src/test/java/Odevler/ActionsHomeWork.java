package Odevler;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class ActionsHomeWork extends TestBase {
    //1. "http://webdriveruniversity.com/Actions" sayfasina gidin
   @Test
    public void test01() throws InterruptedException {
       driver.get("http://webdriveruniversity.com/Actions");

       //  2. "Hover over Me First" kutusunun ustune gelin
       WebElement HoverOverMeFirstKutusu=driver.findElement(By.xpath("//*[text()='Hover Over Me First!']"));
      Actions actions=new Actions(driver);
      actions.click(HoverOverMeFirstKutusu).perform();

       //  3. "Link 1" e tiklayin
       driver.findElement(By.xpath("(//*[text()='Link 1'])[1]")).click();

       //  4. Popup mesajini yazdirin
      System.out.println("driver.switchTo().alert().getText() = " + driver.switchTo().alert().getText());

      //  5. Popup'i tamam diyerek kapatin
       driver.switchTo().alert().accept();

       //  6. "Click and hold" kutusuna basili tutun
       WebElement clickTusu=driver.findElement(By.xpath("//div[@id='click-box']"));
       actions.sendKeys(Keys.PAGE_DOWN).
       clickAndHold(clickTusu).perform();


       //  7. "Click and hold" kutusunda cikan yaziyi yazdirin
      System.out.println(clickTusu.getText());

       //  8. "Double click me" butonunu cift tiklayin
      WebElement doubleClickButonu=driver.findElement(By.xpath("//*[text()='Double Click Me!']"));

      actions.doubleClick(doubleClickButonu).perform();
   }



}
