package StepDefinitions;

import PageObjectModels.ExampleLocators;
import Utilities.DriverManager;
import io.cucumber.java.en.*;
import org.openqa.selenium.interactions.Actions;

public class ExampleSteps {
    ExampleLocators locators = new ExampleLocators();


    @Given("Navigate to website")
    public void navigateToWebsite() {
        DriverManager.Driver().navigate().to("https://globalbilgi.com.tr/");


    }


    @When("The user clicks on the links in our services section and is transferred to the relevant area.")
    public void theUserClicksOnTheLinksInOurServicesSectionAndIsTransferredToTheRelevantArea() {

        for (int i = 0; i < locators.services.size(); i++) {
            locators.click(locators.services.get(i));
            DriverManager.Driver().navigate().back();

        }


    }

    @Then("User clicks on career button and sees career opportunities")
    public void userClicksOnCareerButtonAndSeesCareerOpportunities() {
        locators.click(locators.career);

    }
}
