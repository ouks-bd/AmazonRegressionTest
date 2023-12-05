package LeadManagement.pom.page.Dashboard;

import LeadManagement.pom.base.BaseTest;
import LeadManagement.pom.page.LeadManagement.AddPlanPage;
import LeadManagement.pom.page.LeadReport.CallReport;
import LeadManagement.pom.util.GeneralUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class DashboardPage extends BaseTest {

    @FindBy(css = ".dropdown > a:nth-child(1) > i")
    WebElement logoutEl;

    @FindBy(css = "ul.nav:nth-child(1) > li:nth-child(3) > a:nth-child(1) > p:nth-child(2) > i")
    WebElement leadManageEl;
    @FindBy(css = "div ul li a[href='/CallPlan']")
    WebElement callPlanEl;

    @FindBy (css = "")
    WebElement leadReportEl;

    @FindBy (css = "")
    WebElement callReportEl;



    public DashboardPage() {
        PageFactory.initElements(driver, this);
    }

    public boolean hasLogoutLink() {
        GeneralUtil.waitForDomStable();
        return logoutEl.isDisplayed();
    }

    public AddPlanPage clickAddPlan() {
        new Actions(driver).click(leadManageEl).perform();
        new Actions(driver).click(callPlanEl).perform();
        return new AddPlanPage();
    }

    public CallReport callreport(){
        new Actions(driver).click(leadReportEl).perform();
        new Actions(driver).click(callReportEl).perform();
        return new CallReport();

    }
}
