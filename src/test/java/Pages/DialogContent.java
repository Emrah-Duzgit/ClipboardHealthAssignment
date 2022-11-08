package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class DialogContent extends Parent {

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(id = "a-autoid-0-announce")
    private WebElement sort;

    @FindBy(id = "s-result-sort-select_2")
    private WebElement highToLow;

    @FindBy(css = "span[class=\"a-price-whole\"]")
    public List<WebElement> priceList;

    @FindBy(xpath = "//h1[.=' About this item ']")
    private WebElement about;

    @FindBy(id = "featurebullets_feature_div")
    private WebElement log;


    WebElement myElement;

    public void findAndClickSorted(List<WebElement> strElement) {
        WebElement list = strElement.get(1);
        int count = 0;
        for (int i = 0; i < strElement.size(); i++) {
            System.out.print(i+1 + ". TV Price = " + strElement.get(i).getText() + " ");
            count++;
            if (count >=10){
                System.out.println();
                count=0;
            }
        }
        System.out.println();
        clickFunction(list);
    }


    public void findAndClick(String strElement) {
        switch (strElement) {
            case "sort": myElement = sort; break;
            case "highToLow": myElement = highToLow; break;
        }

        clickFunction(myElement);
    }

    public void assertElementVisible(String strElement) {
        switch (strElement) {
            case "about": myElement = about; break;
        }

        verifyElementVisible(myElement);
    }

    public void writeToConsole(String strElement) {
        switch (strElement) {
            case "log": myElement = log; break;
        }
        System.out.println(myElement.getText());

    }
}
