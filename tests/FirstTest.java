package tests;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.InitializePage;

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.*;

import java.io.IOException;


public class FirstTest extends InitializePage {

    @BeforeTest
    public void setUp() {

        super.setUp();
    }

    // assert title is -  דף הבית, הביטוח הלאומי
    @Test(priority = 1)
    public void searchTitle() {
        Assert.assertEquals("דף הבית, הביטוח הלאומי", driver.getTitle());
        System.out.println("Page Title is :" + driver.getTitle());


    }
    // assert personal service  exist (שירות אישי)
    @Test(priority = 2)
    public void personalService() {
        homePage.searchInput("");
        assertNotNull(utilities.waitForElement(searchPage.personalService(), 20));
    }

    // assert telephon is 04-8812345
    @Test(priority = 3)
    public void searchTelephon() {
        assertNotNull(utilities.waitForElement(searchPage.searchTelephon(), 20));
        String actualTel1 = driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[1]/span[2]")).getText();
        assertTrue(actualTel1.contains("04-8812345"), "This is not right number");


    }
    // assert telephon is *6050
    @Test(priority = 4)
    public void searchTelephon2() {
        assertNotNull(utilities.waitForElement(searchPage.searchTelephon(), 20));

        String actualTel2 = driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[1]/span[1]")).getText();
        assertTrue(actualTel2.contains("*6050"), "This is not right number");


    }
    // search logo exist
    @Test(priority = 5)
    public void searchFlag() {

        assertNotNull(utilities.waitForElement(searchPage.searchFlag(), 20));
    }

    //Exhaustion Of Rights (מיצוי זכויות)
    @Test(priority = 6)
    public void CitizensRights() {

        assertNotNull(utilities.waitForElement(searchPage.CitizensRights(), 20));

    }

    //Exhaustion Of Rights of the sicks (זכויות החולה)
    @Test(priority = 7)
    public void CitizensSick() {


        assertNotNull(utilities.waitForElement(searchPage.CitizensSick(), 20));

    }

    //Search for branches (סניפים)
    @Test(priority = 8)
    public void InputCity() {
        homePage.searchInput("");
        assertNotNull(utilities.waitForElement(searchPage.InputCity(), 20));

    }
    //Search for Payment (תשלומים)
    @Test(priority = 9)
    public void Payment() {
        homePage.searchInput("");

        assertNotNull(utilities.waitForElement(searchPage.Payment(), 20));

    }
    //Search for SearchBox (חפש-בוקס)
    @Test(priority = 10)
    public void SearchBox()  {
        homePage.searchInput("שירות אישי");

       driver.findElement(By.xpath("//input[@id='ctl00_SiteHeader_reserve_btnSearch']")).click();
        assertNotNull(utilities.waitForElement(searchPage.SearchBox(), 20));

    }
    //Search for language (אתר ברוסית)
    @Test(priority = 11)
    public void InRussian() {

        assertNotNull(utilities.waitForElement(searchPage.InRussian(), 20));

    }
    //Search for language (אתר בערבית)
    @Test(priority = 12)
    public void InArabic() {

        assertNotNull(utilities.waitForElement(searchPage.InArabic(), 20));
        }
    //Search for language (אתר בצרפתית)
    @Test(priority = 13)
    public void InFrench() {

        assertNotNull(utilities.waitForElement(searchPage.InFrench(), 20));
    }
    //Search for Accessibility (כפתור נגישות)
    @Test(priority = 14)
    public void Accessibility () {

        assertNotNull(utilities.waitForElement(searchPage.Accessibility (), 20));
    }
    //Search and printing for service of guiding hand (הדפסה של "יד מכוונת" באתר)
    @Test(priority = 15)
    public void ContactUs()  {

            driver.findElement(By.xpath("//a[@id='ctl00_Topmneu_ContactsHyperLink']")).click();
        driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[@id='s4-workspace']/div[@id='s4-bodyContainer']" +
                "/div[@id='contentRow']/div[@id='contentBox']/div[@id='BTL']/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]" +
                "/ul[1]/li[6]/div[1]/ul[2]/li[2]/a[1]")).click();
        assertNotNull(utilities.waitForElement(searchPage.PrintPage(), 20));

    }


    public void tearDown() throws IOException {

        super.tearDown();
    }

}