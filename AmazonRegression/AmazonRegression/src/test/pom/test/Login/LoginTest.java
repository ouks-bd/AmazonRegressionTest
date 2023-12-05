package LeadManagement.pom.test.Login;

import LeadManagement.pom.base.BaseTest;
import LeadManagement.pom.page.Dashboard.DashboardPage;
import LeadManagement.pom.page.Login.LoginPage;
import LeadManagement.pom.util.GeneralUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    DashboardPage dashboardPage;
    LoginPage loginPage;

    public LoginTest() {
        super();

    }
    @BeforeMethod
    public void SetUp(){
        initialization();
        loginPage =new LoginPage();

    }
        @Test
    public void loginShouldSuccess(){
       dashboardPage=loginPage.login(getUsername(),getPassword());
            Assert.assertTrue(dashboardPage.hasLogoutLink());

        }
        @AfterMethod
    public void tearDown(){
            GeneralUtil.waitForDomStable();
            driver.quit();
        }
}
