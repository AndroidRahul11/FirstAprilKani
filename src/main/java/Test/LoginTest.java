package Test;

import Pages.LoginPage;
import Pages.Menu;
import com.mobile.BaseClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest extends BaseClass {

    @Test(priority =1)
    public void login() {
        loginPage.logInToApplication();
        System.out.println("User logged in successfully");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    @Test(priority =2)
    public void VerifySalesOrder() {
        menu.accessMenu();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        System.out.println("Sales order created successfully");


    }

}
