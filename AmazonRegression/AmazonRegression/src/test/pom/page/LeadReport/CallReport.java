package LeadManagement.pom.page.LeadReport;

import LeadManagement.pom.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CallReport  extends BaseTest {

    //write expath here

    @FindBy(css = "div span span[aria-labelledby='select2-CategoryId-container']")
    WebElement selectCategoryEl;

    @FindBy(css = ".select2-dropdown.select2-dropdown--below ul li[data-select2-id=\"7\"]")
    WebElement clickCategoryEl;

    @FindBy(css = "dropdown")
    WebElement selectLeadtypeEl;

    @FindBy(css = "dropdown")
    WebElement clickLeadtEl;

    @FindBy(id = "CIF")
    WebElement entryCIFEl;

    @FindBy(id = "nae")
    WebElement entrynameEl;

    @FindBy(id = "subject")
    WebElement entrysubjectEl;

    @FindBy(id = "description")
    WebElement entrydescriptionEl;

    @FindBy(id = "add")
    WebElement clickAddEl;

    @FindBy(id="saveplan")
    WebElement savePlanEl;

    public CallReport (){
        PageFactory.initElements(driver, this);
    }

    public CallReport selectCategory() {
        selectCategoryEl.isDisplayed();
        selectCategoryEl.click();
        return this;
    }

    public CallReport clickCategory() {
        clickCategoryEl.isDisplayed();
        clickCategoryEl.click();
        return this;
    }

    public CallReport leadType() {
        selectLeadtypeEl.isDisplayed();
        selectLeadtypeEl.click();
        return this;
    }

    public CallReport leadSelect() {
        clickLeadtEl.isDisplayed();
        clickLeadtEl.click();
        return this;
    }


    public CallReport entryCIF(String CIF) {
        entryCIFEl.isDisplayed();
        entryCIFEl.clear();
        entryCIFEl.sendKeys(CIF);
        return this;
    }

    public CallReport name(String name) {
        entrynameEl.isDisplayed();
        entrynameEl.clear();
        entrynameEl.sendKeys(name);
        return this;
    }

    public CallReport subject(String subject) {
        entrysubjectEl.isDisplayed();
        entrysubjectEl.clear();
        entrysubjectEl.sendKeys(subject);
        return this;
    }
    public CallReport testDescription(String testdescription) {
        entrydescriptionEl.isDisplayed();
        entrydescriptionEl.clear();
        entrydescriptionEl.sendKeys(testdescription);
        return this;
    }

    public CallReport add (){
        clickAddEl.isDisplayed();
        clickAddEl.click();
        return this;
    }

    public CallReport saveplan(){
        savePlanEl.isDisplayed();
        savePlanEl.click();
        return this;
    }

}
