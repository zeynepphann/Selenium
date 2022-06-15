package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class DemogaPage {

    public DemogaPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]")
    public WebElement elementBasligi;

    @FindBy(xpath = "(//div[@class='header-text'])[1]")
    public WebElement ikinciSaydaElementGorunurlugu;

    @FindBy(xpath = "(//span[@class='text'])[4]")
    public WebElement webTableButonu;

    @FindBy(xpath = "//div[@class='ReactTable -striped -highlight']")
    public WebElement webTableBody;

    @FindBy(xpath = "//div[@class='rt-th rt-resizable-header -cursor-pointer']")
    public List<WebElement> tableBasliklariList;

    @FindBy(xpath = "//div[@class='rt-td']")
    public List<WebElement> satirBilgisi;

    @FindBy(xpath = "//div[@role='row']")
    public List<WebElement> sutunBilgisi;

    @FindBy(xpath = "//div[@class='rt-tbody']//div[@class='rt-td'][2]")
    public List<WebElement> ikinciSutun;


    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[3]")
    public WebElement alertButonu;

    @FindBy(xpath = "(//li[@id='item-0'])[3]")
    public WebElement browserButonu;

    @FindBy(xpath = "//*[text()='New Tab']")
    public WebElement newTabButonu;

    @FindBy(xpath = "//*[text()='This is a sample page']")
    public WebElement newTabYazisi;

    @FindBy(xpath = "//div[@id='windowButtonWrapper']")
    public WebElement newWindowButonu;

    @FindBy(xpath = "//*[text()='New Window Message']")
    public WebElement newWindowMessageButonu;














}
