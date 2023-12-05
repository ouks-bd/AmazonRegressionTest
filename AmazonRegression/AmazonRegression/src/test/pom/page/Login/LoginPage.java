package LeadManagement.pom.page.Login;

import LeadManagement.pom.base.BaseTest;
import LeadManagement.pom.page.Dashboard.DashboardPage;
import LeadManagement.pom.util.GeneralUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseTest {

    @FindBy(css = "input[id='username']")
    WebElement usernameE1;


    @FindBy(id = "user-password")
    WebElement passwordE1;
//    @FindBy(css = "input[id='password']")
//    WebElement passwordE1;

    @FindBy(css = "div button.btn-bg-gradient-x-purple-blue")
    WebElement loginButton;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public DashboardPage login(String username, String password) {
        usernameE1.isDisplayed();
        usernameE1.clear();
        usernameE1.sendKeys(username);

        passwordE1.clear();
        passwordE1.sendKeys(password);

        GeneralUtil.waitForDomStable();

        loginButton.isDisplayed();
        loginButton.click();
        GeneralUtil.waitForDomStable();
        return new DashboardPage();
    }
}
