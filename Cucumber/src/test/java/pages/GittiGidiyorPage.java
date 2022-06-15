package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GittiGidiyorPage {

    public GittiGidiyorPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@data-cy='header-search-input']")
    public WebElement gGaramaButonu;

    @FindBy(xpath = "//*[text()='BUL']")
    public WebElement bulButonu;

    @FindBy(xpath = "//a[@aria-label='2. sayfa']")
    public WebElement ikinciSayfa;

    @FindBy(xpath = "//*[text()='Kapat']")
    public WebElement cerezButonu;

    @FindBy(xpath = "//div[@class='pmyvb0-0 jCCkZh']")
    public WebElement ikinciSayfaGorunurlugu;

    @FindBy(xpath = "(//*[@class='sc-1nx8ums-0 dyekHG'])[1]")
    public WebElement urun;






}
