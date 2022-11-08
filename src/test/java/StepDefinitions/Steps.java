package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.*;
import java.util.Set;

public class Steps {

    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();

    @Given("Navigate to Amazon Website")
    public void navigateToAmazonWebsite() {
        GWD.getDriver().get("https://www.amazon.in/");
        GWD.getDriver().manage().window().maximize();
    }

    @And("Click On The Hamburger Menu")
    public void clickOnTheHamburgerMenu() {
        ln.findAndClick("hamburger");
    }

    @And("Click On TV, Appliances and Electronics")
    public void clickOnTVAppliancesAndElectronics() {
        ln.findAndClick("tvAppElec");
    }

    @And("Click On Televisions")
    public void clickOnTelevisions() {
        ln.findAndClick("televisions");
    }

    @And("Filter The Results By Brand Samsung")
    public void filterTheResultsByBrandSamsung() {
        ln.findAndClick("samsung");
    }

    @And("Sort The Samsung Results With Price High To Low.")
    public void sortTheSamsungResultsWithPriceHighToLow() {
        dc.findAndClick("sort");
        dc.findAndClick("highToLow");
    }

    @And("Click On The Second Highest Priced Item")
    public void clickOnTheSecondHighestPricedItem() {
        dc.findAndClickSorted(dc.priceList);

    }


    @Then("Assert That About this item Section is Present And Log This Section Text to Console Report")
    public void assertThatAboutThisItemSectionIsPresentAndLogThisSectionTextToConsoleReport() {
        dc.assertElementVisible("about");
        dc.writeToConsole("log");


    }

    @When("Switch the Window")
    public void switchTheWindow() {
        String mainPageWindowId = GWD.getDriver().getWindowHandle();
        Set<String> windowsIds = GWD.getDriver().getWindowHandles();

        for (String id : windowsIds) {
            if (id.equals(mainPageWindowId)) continue;

            GWD.getDriver().switchTo().window(id);
        }
    }
}