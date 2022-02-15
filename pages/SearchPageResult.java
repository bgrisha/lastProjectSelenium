package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SearchPageResult extends BasePage {


    @FindBy(xpath = "//a[@id='ctl00_Topmneu_HyperLink9']")
    WebElement service;


    @FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[1]/span[2]")
    WebElement telephon;


    @FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[1]/span[1]")
    WebElement telephon2;

    @FindBy(xpath = "//a[@id='ctl00_SiteHeader_HyperLinkHomePage']")
    WebElement Flag;

    @FindBy(xpath = "//a[@id='ctl00_Topmneu_BenefitsHyperLink']")
    WebElement rights;

    @FindBy(xpath = "//a[@id='ctl00_Topmneu_BenefitsHyperLink']")
    WebElement sick;

    @FindBy(xpath = "//a[@id='ctl00_Topmneu_BranchesHyperLink']")
    WebElement city;

    @FindBy(xpath = "//a[@id='ctl00_Topmneu_HyperLink1']")
    WebElement payment;

    @FindBy(xpath = "//input[@id='TopQuestions']")
    WebElement searchBox;

    @FindBy(xpath = "//header/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
    WebElement russian;

    @FindBy(xpath = "//header/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")
    WebElement arabic;

    @FindBy(xpath = "//header/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]")
    WebElement french;

    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[2]/button[1]/span[1]")
    WebElement accessibility;

    @FindBy(xpath = "//body/form[@id='aspnetForm']/div[@id='s4-workspace']/div[@id='s4-bodyContainer']/div[@id='contentRow']" +
            "/div[@id='contentBox']/div[@id='BTL']/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]/div[1]/a[1]")
    WebElement printPage;

    @FindBy(xpath = "//input[@id='ctl00_PlaceHolderMain_snifsearch_snifimSearch']")
    WebElement branch;


    public SearchPageResult(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement personalService() {

        return service;
    }

    public WebElement searchTelephon() {

        return telephon;
    }

    public WebElement searchTelephon2() {

        return telephon2;
    }

    public WebElement searchFlag() {

        return Flag;
    }

    public WebElement CitizensRights() {

        return rights;
    }

    public WebElement CitizensSick() {

        return sick;
    }

    public WebElement InputCity() {

        return city;
    }
    public WebElement Payment() {

        return payment;
    }
    public WebElement SearchBox() {

        return searchBox;
    }
    public WebElement InRussian() {

        return russian;
    }
    public WebElement InArabic() {

        return arabic;
    }
    public WebElement InFrench() {

        return french;
    }
    public WebElement Accessibility () {

        return accessibility ;
    }
    public WebElement PrintPage () {

        return printPage ;
    }

    public WebElement InputBranch() {

        return branch;
    }


}