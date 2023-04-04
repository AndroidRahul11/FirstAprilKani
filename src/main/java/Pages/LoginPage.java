package Pages;

import com.mobile.BaseClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

    @AndroidFindBy (xpath ="//android.widget.TextView[@text=\"SIGN IN\"]") private WebElement signinbtn;
    @AndroidFindBy (id ="UserName") private WebElement emailbox;
    @AndroidFindBy (id ="Password") private WebElement passwordbox;
    @AndroidFindBy (xpath ="//android.widget.Button[@text=\"Login →\"]") private WebElement loginBtn;

    AndroidDriver driver;
    public LoginPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
    }

    public void logInToApplication() {

        util.waitforVisibility(signinbtn, 10);
        util.click(signinbtn);
        util.waitforVisibility(emailbox, 10);
        util.click(emailbox);
        util.sendkeys(emailbox, "vishnu@gmail.com");
        util.click(passwordbox);
        util.sendkeys(passwordbox, "admin");
        util.click(loginBtn);
    }

}
