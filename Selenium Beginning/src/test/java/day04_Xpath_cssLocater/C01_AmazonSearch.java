package day04_Xpath_cssLocater;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_AmazonSearch {
  // 2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
  // a.google web sayfasına gidin. https://www. amazon.com/
  //         b. Search(ara) “city bike”
  // c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
  // d. “Shopping” e tıklayın.
  // e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // a.google web sayfasına gidin. https://www. amazon.com/
        driver.get("https://www.amazon.com");

        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike"+ Keys.ENTER);

        List<WebElement> istenenElementListesi =driver.findElements(By.className("sg-col-inner"));

        WebElement sonucYazisi=istenenElementListesi.get(0);
        System.out.println(sonucYazisi.getText());

        List<WebElement> urunResmiListesi =driver.findElements(By.className("s-image"));
        WebElement ilkUrunResmi = urunResmiListesi.get(0);
        ilkUrunResmi.click();





    }
}
