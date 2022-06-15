package day04_Xpath_cssLocater;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Xpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        /*
        1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
2- Add Element butonuna basin
3- Delete butonu’nun gorunur oldugunu test edin
4- Delete tusuna basin
5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
Collapse
         */


        /*
        <img class="s-image" src="https://m.media-amazon.com/images/I/61oXs1j9p8L._AC_UY218_.jpg"
        srcset="https://m.media-amazon.com/images/I/61oXs1j9p8L._AC_UY218_.jpg 1x,
         https://m.media-amazon.com/images/I/61oXs1j9p8L._AC_UY327_FMwebp_QL65_.jpg 1.5x,
         https://m.media-amazon.com/images/I/61oXs1j9p8L._AC_UY436_FMwebp_QL65_.jpg 2x,
         https://m.media-amazon.com/images/I/61oXs1j9p8L._AC_UY545_FMwebp_QL65_.jpg 2.5x,
          https://m.media-amazon.com/images/I/61oXs1j9p8L._AC_UY654_FMwebp_QL65_.jpg 3x"
        alt="Sponsored Ad - SLANIGIRO Adult Urban Bike Helmet - Adjustable Fit System &amp;
         Integrated Taillight for Men Women"
         data-image-index="1" data-image-load="" data-image-latency="s-product-image" data-image-source-density="1">
         */

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
    }


}
