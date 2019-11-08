package Com.StepDefination;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import static junit.framework.TestCase.assertEquals;

public class Registrations extends driverClass {


    @Given("^I enter url as \"([^\"]*)\"$")
    public void iEnterUrlAs(String url)  {

        driver.get(url);
        driver.manage().window().maximize();
    }

    @When("^I click on register button$")
    public void iClickOnRegisterButton() {

        driver.findElement(By.linkText("Register")).click();
    }

    @Given("^I enter Username as \"([^\"]*)\"$")
    public void iEnterUsernameAs(String Username) throws Throwable {
        driver.findElement(By.name("credential.username")).sendKeys(Username);
    }

    @Given("^I enter Password as \"([^\"]*)\"$")
    public void iEnterPasswordAs(String Password) throws Throwable {
        driver.findElement(By.id("password")).sendKeys(Password);
    }

    @Given("^I enter RetypePassword as \"([^\"]*)\"$")
    public void iEnterRetypePasswordAs(String RPassword) throws Throwable {
        driver.findElement(By.id("confirmPassword")).sendKeys(RPassword);
    }

    @When("^I select \"([^\"]*)\" from Title drop down box$")
    public void iSelectFromTitleDropDownBox(String Title) throws Throwable {
        Select selectByValue = new
        Select(driver.findElement(By.id("name.title")));
        selectByValue.selectByValue("1");

    }

    @Given("^I enter Firstname as \"([^\"]*)\"$")
    public void iEnterFirstnameAs(String firstname) throws Throwable {
        driver.findElement(By.id("name.firstName")).sendKeys(firstname);
    }

    @Given("^I enter Surname as \"([^\"]*)\"$")
    public void iEnterSurnameAs(String surname) throws Throwable {
       driver.findElement(By.id("name.surname")).sendKeys(surname);
    }

    @Given("^I enter ContactNumber as \"([^\"]*)\"$")
    public void iEnterContactNumberAs(String Number) throws Throwable {
       driver.findElement(By.id("telephone")).sendKeys(Number);
    }

    @Given("^I enter Emailadd as \"([^\"]*)\"$")
    public void iEnterEmailaddAs(String emailadd) throws Throwable {
        driver.findElement(By.name("email")).sendKeys(emailadd);
    }

    @When("^I select \"([^\"]*)\" from what role do you play drop down box$")
    public void iSelectFromWhatRoleDoYouPlayDropDownBox(String role) throws Throwable {
        Select selectByValue = new
                Select(driver.findElement(By.name("jobFunction")));
        selectByValue.selectByValue("14");
    }

    @And("^I select \"([^\"]*)\" from where did you hear about us  drop down box$")
    public void iSelectFromWhereDidYouHearAboutUsDropDownBox(String hear) throws Throwable {
        Select selectByValue = new
                Select(driver.findElement(By.id("hearAbout")));
        selectByValue.selectByValue("8");
    }

    @And("^I click on By email box$")
    public void iClickOnByEmailBox() {

        driver.findElement(By.id("marketingEmail")).click();
    }
    @And("^I click Register button on Registration page$")
    public void iClickRegisterButtonOnRegistrationPage() {
        driver.findElement(By.id("register-button")).click();
    }

    @Then("^I should see Welcome Harshad Text$")
    public void iShouldSeeWelcomeHarshadText() {
        String actual_pagetitle;
        String expected_Pagetitle = "Welcome HARSHAD";
        actual_pagetitle =driver.findElement(By.cssSelector(".welcome")).getText();
        assertEquals(expected_Pagetitle,actual_pagetitle);
    }

    @And("^I should see url as \"([^\"]*)\"$")
    public void iShouldSeeUrlAs(String expected_url) throws Throwable {
        String actual_url;
        actual_url = driver.getCurrentUrl();
        assertEquals(expected_url,actual_url);
    }


    @When("^I click Login button$")
    public void iClickLoginButton() {

        driver.findElement(By.id("js-logInOut")).click();
    }

    @Given("^I enter Username as \"([^\"]*)\" on Login page$")
    public void iEnterUsernameAsOnLoginPage(String username) throws Throwable {
        driver.findElement(By.name("username")).sendKeys(username);
    }

    @And("^I enter Password as \"([^\"]*)\" on Login page$")
    public void iEnterPasswordAsOnLoginPage(String Password) throws Throwable {
       driver.findElement(By.id("password")).sendKeys(Password);
    }

    @When("^I click Login button on Login page$")
    public void iClickLoginButtonOnLoginPage() {
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/button")).click();
    }
    @Given("^I enter in search box as\"([^\"]*)\"$")
    public void iEnterInSearchBoxAs(String pcode) throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"searchTerm\"]")).sendKeys(pcode);
    }

    @When("^I click searh button$")
    public void iClickSearhButton() {
        driver.findElement(By.cssSelector(".icon-search")).click();
    }

    @And("^I click on Add to Basket$")
    public void iClickOnAddToBasket()
    {
        driver.findElement(By.cssSelector(".btn-primary-red")).click();
    }

    @And("^I click on Basket button$")
    public void iClickOnBasketButton() {
        driver.findElement(By.className("icon-cart")).click();
    }

    @Then("^I should see My Basket Text$")
    public void iShouldSeeMyBasketText() {
        String actual_pagetitle;
        String expected_Pagetitle = "My Basket";
        actual_pagetitle =driver.findElement(By.cssSelector(".pageTitleBlack")).getText();
        assertEquals(expected_Pagetitle,actual_pagetitle);
    }
}
