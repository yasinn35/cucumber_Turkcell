package PageObjectModels;

import Utilities.DriverManager;
import Utilities.Methods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ExampleLocators extends Methods {
    public ExampleLocators() {
        PageFactory.initElements(DriverManager.Driver(), this);
    }

    @FindBy(xpath = "//span[text()='Detay']")
    public List<WebElement> services;

    @FindBy(xpath = "(//span[text()='Kariyer'])[1]")
    public WebElement career;

    @FindBy(xpath = "//h2[text()='Kariyer Fırsatları']")
    public WebElement careerOpportunities;


}
