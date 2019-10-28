package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.HashMap;
import java.util.Map;

public class Littlefoot_Library {

    public Littlefoot_Library(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='fistName']")
    public WebElement fistName;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@name='title']")
    public WebElement title;

    @FindBy(xpath = "//input[@name='author']")
    public WebElement author;

    @FindBy(xpath = "//input[@name='pages']")
    public WebElement pages;

    @FindBy(xpath = "//input[@name='pages']")
    public WebElement pagesRead;

    @FindBy(xpath = "//input[@name='dewey_decimal']")
    public WebElement dewey_decimal;

    @FindBy(xpath = "//select[@name='dropdown']")
    public WebElement dropdown;

    public static Map<String, Integer> totalPages = new HashMap<>();

}
