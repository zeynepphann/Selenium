package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class DemoqaPage {
    public DemoqaPage() {
        PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]")//degisti
    public WebElement elements;

    @FindBy(xpath = "//div[@class='element-group']")
    public WebElement elementsMenu;

    @FindBy (xpath = "(//span[@class='text'])[4]")
    public WebElement webTables;

    public String webTablesPageUrl= Driver.getDriver().getCurrentUrl();

    @FindBy(xpath = "//div[@class='rt-tbody']")
    public WebElement tableBody;

    @FindBy(xpath = "//div[@class='rt-td']")
    public List<WebElement> cellList;

    @FindBy (xpath = "//div[@role='columnheader']")
    public List<WebElement> headerList;

    @FindBy(xpath = "//div[@class='rt-tr-group']")
    public List<WebElement> rowList;
    @FindBy(xpath = "//div[@class='rt-tbody']//div[@class='rt-td'][2]")
    public List<WebElement> secondColumnList;

    @FindBy(xpath = "//div[@class='rt-tbody']//div[@class='rt-td'][6]")
    public List<WebElement> departmentColumnList;

}
