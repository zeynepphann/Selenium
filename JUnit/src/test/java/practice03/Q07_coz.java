package practice03;

import org.bouncycastle.est.LimitedSource;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.stylesheets.LinkStyle;
import utilities.TestBase;

import java.util.List;
import java.util.Set;

public class Q07_coz extends TestBase {
    @Test
    public void name() {
        // go to url : https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/
        driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

        //-->Task1 Find Dropdown on Multi Selection
        WebElement drapdown=driver.findElement(By.xpath("//input[@id='justAnInputBox']"));

        //-->Task2 Find  all Dropdown Elements on page
        WebElement allDrapdown =driver.findElement(By.xpath("//div[@class='row']"));
        System.out.println("allDrapdown = " + allDrapdown.getText());

        //-->Task3 printout DropDown Elements' number
        List<WebElement> allDrapDownNumber=driver.findElements(By.xpath("//h3"));
        int allDrapDownNumberSayisi=allDrapDownNumber.size();
        System.out.println(allDrapDownNumberSayisi);

        //-->Task4 choose dropdown elements and printout dropdown elements' name  until choise 6

        WebElement ilkDrapDown=driver.findElement(By.xpath("(//span[@class='comboTreeArrowBtnImg'])[1]"));
        ilkDrapDown.click();

        WebElement ikinciDrapDown=driver.findElement(By.xpath("(//span[@class='comboTreeArrowBtnImg'])[1]"));
        ikinciDrapDown.click();

        WebElement ucuncuDrapDown=driver.findElement(By.xpath("(//span[@class='comboTreeArrowBtnImg'])[1]"));
        ucuncuDrapDown.click();




    }

 }
