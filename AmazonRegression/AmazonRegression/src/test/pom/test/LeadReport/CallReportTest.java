package LeadManagement.pom.test.LeadReport;

import LeadManagement.pom.base.BaseTest;
import LeadManagement.pom.page.LeadReport.CallReport;
import LeadManagement.pom.page.Login.LoginPage;
import LeadManagement.pom.util.GeneralUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CallReportTest extends BaseTest {

    //AddPlanPage addPlanPage;
    CallReport callReport;
    public CallReportTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        callReport = new LoginPage().login(getUsername(), getPassword()).callreport();
    }

    @Test
    public void addPlanShouldSuccess() throws InterruptedException {
        callReport = callReport

                .selectCategory()
                .clickCategory()
                .leadType()
                .leadSelect()
                .name("name")
                .entryCIF("CIF")
                .subject("subject")
                .testDescription("testdescription")
                .add()
                .saveplan();

        Thread.sleep(5000);
    }

    @AfterMethod
    public void TearDown() {
        GeneralUtil.waitForDomStable();
        driver.quit();

    }
}

