package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

    public AmazonPage(){ //cons
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="twotabsearchtextbox")
    public WebElement aramaKutusu;

    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement aramaSonucElementi;

    @FindBy(xpath = "//i[@class='hm-icon nav-sprite']")
    public WebElement allButonu;

    @FindBy(xpath = "//*[text()='digital content & devices']")
    public WebElement digitalContentYazisi;

    @FindBy(xpath = "//*[text()='Kindle E-readers & Books']")
    public WebElement kindleButonu;

    @FindBy(xpath = "//*[text()='Kindle Kids']")
    public WebElement kindleKidsButonu;

    @FindBy(xpath = "(//input[@class='a-button-input'])[6]")
    public WebElement kindleKidsucuncuResim;

    @FindBy(xpath = "//*[text()='Registry']")
    public WebElement  registryButonu;

    @FindBy(xpath = "//input[@class='gr-text gr-text--sm gr-text--tertiary gr-find-stripe__name']")
    public WebElement  registrantKutusu;

    @FindBy(xpath = "//select[@name='searchUrl']")
    public WebElement  selectButonu;

    @FindBy(xpath = "//button[@class='gr-btn gr-btn--rounded gr-text gr-find-stripe__cta gr-find-stripe__submit']")
    public WebElement  searchButonu;

    @FindBy(xpath = "//div[@class='gr-search-registry-no-result-title gr-header--lg']")
    public WebElement  sorryYazisi;





}
