package practice03;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Q10_coz extends TestBase {
    @Test
    public void name() {
        // https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/ sitesine gidin
        driver.get("https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/");
        WebElement iframe=driver.findElement(By.xpath("//iframe[@id='emoojis']"));
        // driver.switchTo().frame()
        // ikinci emojiye tıklayın
        driver.findElement(By.xpath("(//span[@data-upgraded=',MaterialRipple'])[2]")).click();

        // tüm ikinci emoji öğelerini tıklayın

        // parent iframe e geri donun
        // formu doldurun,(Formu istediğiniz metinlerle doldurun)
        //  apply button a basin
    }

}
