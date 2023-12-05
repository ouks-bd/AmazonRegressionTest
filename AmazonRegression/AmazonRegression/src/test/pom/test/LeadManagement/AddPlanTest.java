package LeadManagement.pom.test.LeadManagement;

import LeadManagement.pom.base.BaseTest;
import LeadManagement.pom.page.LeadManagement.AddPlanPage;
import LeadManagement.pom.page.Login.LoginPage;
import LeadManagement.pom.util.GeneralUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddPlanTest extends BaseTest {
    AddPlanPage addPlanPage;

    public AddPlanTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        addPlanPage = new LoginPage().login(getUsername(), getPassword()).clickAddPlan();
    }

    @Test
    public void addPlanShouldSuccess() throws InterruptedException {
        addPlanPage = addPlanPage
                .clickAddNewPlan()
                .selectCategory()
                .clickCategory()
                .leadType()
                .clickLead()
                .name("name")
                .entryCIF("CIF")
                .subject("subject")
                .testDescription("testdescription")
                .tentative()
                .index()
                .add();
                //.saveplan();

        Thread.sleep(100000);
    }

    @AfterMethod
    public void TearDown() {
        GeneralUtil.waitForDomStable();
        driver.quit();

    }
}
