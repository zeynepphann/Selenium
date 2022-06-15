package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class N11Page {

    public N11Page (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//*[text()='Mağazalar'])[1]")
    public WebElement magazaYaziElementi;

    @FindBy(xpath = "//a[@title='Mağazaları Gör']")
    public WebElement magazaGorYazisi;

    @FindBy(xpath = "//*[text()='M']")
    public WebElement mIleBaslayanMagaza;

    @FindBy(xpath = "//div[@role='rowgroup']")
    public List<WebElement> satirSayisi;


}
