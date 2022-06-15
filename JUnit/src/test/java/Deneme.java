import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.TestBase;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Deneme extends TestBase {
    @Test
    public void name() throws InterruptedException {

        driver.get("https://secure.indeed.com/account/login");
        driver.findElement(By.id("login-google-button")).click();
        //hold window handles
        Set<String> s = driver.getWindowHandles();

        // iterate handles
        Iterator<String> i = s.iterator();
        Thread.sleep(4000);

        //child window handle id
        String c = i.next();
        Thread.sleep(4000);
        //parent window handle id
        String p = i.next();
        Thread.sleep(4000);

        // child window switch
        driver.switchTo().window(c);
        System.out.println("Page title of child window: "+ driver.getTitle());

        // switch to parent window
        driver.switchTo().window(p);
        System.out.println("Page title of parent window: "+ driver.getTitle());
        //browser quit
        driver.quit();

    }
}
