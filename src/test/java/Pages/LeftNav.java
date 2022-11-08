package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent{

    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//i[@class='hm-icon nav-sprite']")
    private WebElement hamburger;

    @FindBy(xpath = "//div[text()='TV, Appliances, Electronics']")
    private WebElement tvAppElec;

    @FindBy(xpath = "//a[text()='Televisions']")
    private WebElement televisions;

    @FindBy (xpath = "//span[.='Samsung']")
    private WebElement samsung;



    WebElement myElement;
    public void findAndClick(String strElement){  // 2.aşama
        switch (strElement)
        {
            case "hamburger" : myElement = hamburger;break;
            case "tvAppElec" : myElement = tvAppElec;break;
            case "televisions" : myElement = televisions;break;
            case "samsung" : myElement = samsung;break;

        }

        clickFunction(myElement);
    }

}
