package Pages;

import com.mobile.BaseClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Menu extends BaseClass {

    @AndroidFindBy (xpath ="//android.view.ViewGroup/android.widget.TextView[@text=\"\uE5D2\"]") private WebElement menubtn;
    @AndroidFindBy (xpath = "//android.widget.TextView[@text=\"Sales Order\"]") private WebElement SalesOrder;
    @AndroidFindBy (xpath ="//android.view.ViewGroup/android.widget.TextView[@text=\"\uE145\"]") private WebElement plusbtn;
    @AndroidFindBy (xpath ="//android.view.ViewGroup/android.widget.ImageView") private WebElement selCustomer;
    @AndroidFindBy (xpath ="//android.widget.TextView[@text=\"1 vish test\"]") private WebElement Customerselected;

    @AndroidFindBy (xpath ="//android.widget.TextView[@text=\"Customer Details\"]") private WebElement customerDetails;





    AndroidDriver driver;
    public Menu(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
    }

    public void accessMenu() {

        util.waitforVisibility(menubtn, 10);
        util.click(menubtn);
        util.waitforVisibility(SalesOrder, 10);
        util.click(SalesOrder);
        util.waitforVisibility(plusbtn, 10);
        util.click(plusbtn);
        util.waitforVisibility(selCustomer, 10);
        util.click(selCustomer);
        util.waitforVisibility(Customerselected, 10);
        util.click(Customerselected);
        util.waitforVisibility(customerDetails, 10);
        System.out.println("Navigated to Customer details page");
    }

}
