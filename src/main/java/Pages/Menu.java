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
    }

}
