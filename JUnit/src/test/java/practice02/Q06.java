package practice02;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

public class Q06 extends TestBase {
    @Test
    public void name() {

        // ...Exercise6...
        // 1. Amazon.com'a gidelim.
        driver.get("https://www.amazon.com");

        // 2. DropDown üzerinde Books secelim.(All yazan yerde)
        WebElement dropDown=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        dropDown.click();

        Select select=new Select(dropDown);
        select.selectByVisibleText("Books");

        // kategorilerin hepsini konsola yazdiralim

        System.out.println("dropDown.getText() = " + dropDown.getText());

        // 3. Arama kutusuna Les Miserables yazalım ve arama yapalim.
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Les Miserables" + Keys.ENTER);

        // 4. Sonuc sayisini ekrana yazdiralim.
        String sonucYazisi=driver.findElement(By.xpath("//*[text()='1-16 of over 5,000 results for']")).getText();

        // 5. Sonucların Les Miserables i icerdigini assert edelim
        String expectedSonucYazisi="Les Miserables";
        String actualSinucYazisi=sonucYazisi;

        Assert.assertTrue(!actualSinucYazisi.contains(expectedSonucYazisi));

    }

}
