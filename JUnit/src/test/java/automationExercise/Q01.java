package automationExercise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Q01 {
    /*
    1. Launch browser
    2. Navigate to url 'http://automationexercise.com'
    3. Verify that home page is visible successfully
    4. Click on 'Signup / Login' button
    5. Verify 'New User Signup!' is visible
    6. Enter name and email address
    7. Click 'Signup' button
    8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
    9. Fill details: Title, Name, Email, Password, Date of birth
    10. Select checkbox 'Sign up for our newsletter!'
    11. Select checkbox 'Receive special offers from our partners!'
    12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    13. Click 'Create Account button'
    14. Verify that 'ACCOUNT CREATED!' is visible
    15. Click 'Continue' button
    16. Verify that 'Logged in as username' is visible
    17. Click 'Delete Account' button
    18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
     */

      WebDriver driver;
     @Before
     public void setUp(){
         WebDriverManager.chromedriver().setup();
         driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

     }

     @After
     public void tearDown(){
     driver.close();
     }

     @Test
     public void test01(){
      //  1. Launch browser
      //  2. Navigate to url 'http://automationexercise.com'
         driver.get("http://automationexercise.com");

      //  3. Verify that home page is visible successfully
         driver.findElement(By.xpath("//html[@lang='en']")).isDisplayed();

      //  4. Click on 'Signup / Login' button
         driver.findElement(By.xpath("//*[text()=' Signup / Login']")).click();

      //  5. Verify 'New User Signup!' is visible
       WebElement yeniGiris= driver.findElement(By.xpath("//*[text()='New User Signup!']"));
       yeniGiris.isDisplayed();

      //  6. Enter name and email address
         driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Zeynep");
         driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("zynphn@gmail.com");

      //  7. Click 'Signup' button
         driver.findElement(By.xpath("//*[text()='Signup']")).submit();

      //  8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
         driver.findElement(By.xpath("//*[text()='Enter Account Information']")).isDisplayed();

      //  9. Fill details: Title, Name, Email, Password, Date of birth
         driver.findElement(By.xpath("//input[@id='id_gender2']")).click();
         driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345");

         WebElement drapDown1=driver.findElement(By.xpath("//select[@id='days']"));
         Select select1=new Select(drapDown1);
         select1.selectByVisibleText("2");

         WebElement drapDown2=driver.findElement(By.xpath("//select[@id='months']"));
         Select select2=new Select(drapDown2);
         select2.selectByValue("5");



         WebElement drapDown3=driver.findElement(By.xpath("//select[@id='years']"));
         Select select3=new Select(drapDown3);
         select3.selectByValue("1999");

      //  10. Select checkbox 'Sign up for our newsletter!'
         driver.findElement(By.xpath("//input[@id='newsletter']")).click();

      //  11. Select checkbox 'Receive special offers from our partners!'
         driver.findElement(By.xpath("//input[@name='optin']")).click();

      //  12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
         driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Zeynep");
         driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Han");
         driver.findElement(By.xpath("//input[@data-qa='address']")).sendKeys("Street address, P.O. Box, Company name, etc.");

         WebElement ulkeAdi=driver.findElement(By.xpath("//select[@id='country']"));
         Select select4=new Select(ulkeAdi);
         select4.selectByValue("Canada");
         driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Ontorio");
         driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Toronto");
         driver.findElement(By.xpath("//input[@data-qa='zipcode']")).sendKeys("66777");
         driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("+490555555555");


       //  13. Click 'Create Account button'
         driver.findElement(By.xpath("//*[text()='Create Account']")).click();

       //  14. Verify that 'ACCOUNT CREATED!' is visible
         driver.findElement(By.xpath("//*[text()='Account Created!']")).isDisplayed();

       //  15. Click 'Continue' button
         driver.findElement(By.xpath("//*[text()='Continue']")).click();

       //  16. Verify that 'Logged in as username' is visible
       //  17. Click 'Delete Account' button
       //  18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button


     }

}
