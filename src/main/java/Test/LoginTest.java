package Test;

import Pages.LoginPage;
import com.mobile.BaseClass;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {

    @Test(priority =1)
    public void login() {
        loginPage.logInToApplication();
        System.out.println("User trying to login");
    }

}
