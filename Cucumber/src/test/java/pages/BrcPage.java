package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BrcPage {

    public BrcPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@role='button']")
    public WebElement loginButonu;

    @FindBy(xpath = "//*[text()='Create new user']")
    public WebElement createNewUser;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement registerButonu;

    @FindBy(xpath = "(//input[@class='form-control is-invalid'])[1]")
    public WebElement phoneNumber;

    @FindBy(xpath = "(//input[@class='form-control is-invalid'])[2]")
    public WebElement adress;

    @FindBy(xpath = "//input[@name='zipCode']")
    public WebElement zipCode;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//input[@name='confirmPassword']")
    public WebElement ikinciPassword;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstname;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastname;

    @FindBy(xpath = "//input[@id='formBasicEmail']")
    public WebElement girisEmail;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement girisPassword;

    @FindBy(xpath = "(//button[@type='button'])[6]")
    public WebElement secimButonu;

    @FindBy(xpath = "(//*[text()='Audi Q8'])[2]")
    public WebElement audiSecim;

    @FindBy(xpath = "(//*[text()=' Login'])[2]")
    public WebElement girisLoginButonu;


}
