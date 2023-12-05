package LeadManagement.pom.page.LeadManagement;

import LeadManagement.pom.base.BaseTest;
import LeadManagement.pom.util.GeneralUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class AddPlanPage extends BaseTest {


    @FindBy(css = "div button.dt-button")
    WebElement clickAddNewEl;

    @FindBy(css = "div span span[aria-labelledby='select2-CategoryId-container']")
    WebElement selectCategoryEl;

    @FindBy(css = ".select2-dropdown--below.select2-dropdown ul li[data-select2-id=\"10\"]")
    WebElement clickCategoryEl;

    @FindBy(css = "div span span[aria-labelledby='select2-CallTypeId-container']")
    WebElement selectLeadtypeEl;

    //@FindBy(xpath = "//li[normalize-space()='Existing']")
    @FindBy(xpath = "(//span[@id='select2-CallTypeId-container'])[1]")
    WebElement clickLeadtEl;



    @FindBy(id = "CIF")
    WebElement entryCIFEl;

    @FindBy(id = "Name")
    WebElement entrynameEl;

    @FindBy(id = "Subject")
    WebElement entrysubjectEl;

    @FindBy(id = "Purpose")
    WebElement entrydescriptionEl;

    @FindBy(id = "btn-Temp-Add")
    WebElement clickAddEl;

//    @FindBy(id = "btn-callPlan-save")
//    WebElement savePlanEl;
//
    @FindBy(xpath = "//button[@id='btn-callPlan-save']")
    WebElement savePlanEl;

    @FindBy(xpath = "//input[@id='TentativeDate']")
    WebElement tentativeEl;

    @FindBy(css = "body > div:nth-child(22) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(4) > td:nth-child(4)")
    WebElement indexEl;

    public AddPlanPage() {
        PageFactory.initElements(driver, this);
    }

    public AddPlanPage clickAddNewPlan() {
        clickAddNewEl.isDisplayed();
        clickAddNewEl.click();
        return this;
    }

    public AddPlanPage selectCategory() {
        selectCategoryEl.isDisplayed();
        //new Select(selectCategoryEl).deselectByVisibleText(index);
        //    selectByVisibleText("Account Update");
        selectCategoryEl.click();
        //selectCategoryEl.click();
        // driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(GeneralUtil.PAGE_LOAD_TIME));
        // new Select(selectCategoryEl).selectByIndex(index);
        return this;
    }

    public AddPlanPage clickCategory() {
        clickCategoryEl.isDisplayed();
        clickCategoryEl.click();
        // new Actions(driver).click(clickCategoryEl).perform();

       // driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(GeneralUtil.PAGE_LOAD_TIME));
        // new Select(selectCategoryEl).selectByIndex(index);
        return this;
    }

    public AddPlanPage leadType() {
        selectLeadtypeEl.isDisplayed();
        selectLeadtypeEl.click();
        //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(GeneralUtil.PAGE_LOAD_TIME));
        return this;
    }

    public AddPlanPage clickLead() {
        clickLeadtEl.isDisplayed();
        clickLeadtEl.click();
        //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(GeneralUtil.PAGE_LOAD_TIME));
        return this;
    }


    public AddPlanPage entryCIF(String CIF) {
        entryCIFEl.isDisplayed();
        entryCIFEl.clear();
        entryCIFEl.sendKeys(CIF);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(GeneralUtil.PAGE_LOAD_TIME));
        return this;
    }

    public AddPlanPage name(String name) {
        entrynameEl.isDisplayed();
        entrynameEl.clear();
        entrynameEl.sendKeys(name);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(GeneralUtil.PAGE_LOAD_TIME));
        return this;
    }

    public AddPlanPage subject(String subject) {
        entrysubjectEl.isDisplayed();
        entrysubjectEl.clear();
        entrysubjectEl.sendKeys(subject);
        return this;
    }

    public AddPlanPage testDescription(String testdescription) {
        entrydescriptionEl.isDisplayed();
        entrydescriptionEl.clear();
        entrydescriptionEl.sendKeys(testdescription);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(GeneralUtil.PAGE_LOAD_TIME));
        return this;

    }

    public AddPlanPage tentative () throws InterruptedException {
        tentativeEl.isDisplayed();
        tentativeEl.click();
        Thread.sleep(5000);
        return this;
    }
    public AddPlanPage index (){
        indexEl.click();

        return  this;
        }

    public AddPlanPage add() {
        clickAddEl.isDisplayed();
        clickAddEl.click();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(GeneralUtil.PAGE_LOAD_TIME));
        return this;
    }

//    public AddPlanPage saveplan() {
//        savePlanEl.isDisplayed();
//        savePlanEl.click();
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(GeneralUtil.PAGE_LOAD_TIME));;
//        return this;
//    }

//    public AddPlanPage blankClick() {
//        blankClickEl.isDisplayed();
//        blankClickEl.click();
//        return this;
//    }


}
