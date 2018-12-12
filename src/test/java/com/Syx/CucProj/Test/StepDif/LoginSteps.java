package com.Syx.CucProj.Test.StepDif;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	WebDriver driver;

    @Given("^I open browser$")
    public void i_open_browser() throws Throwable {
    	WebDriverManager.chromedriver().setup();
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\eclipse-workspace\\com.cucumber\\src\\test\\resources\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //driver.manage().window().fullscreen();// for windows use .maximize
    }

    @Given("^I navigate to the FreeCrm$")
    public void i_navigate_to_the_FreeCrm() throws Throwable {
        driver.get("https://www.freecrm.com/index.html");
    }

    @When("^I enter valid username and password$")
    public void i_enter_valid_username_and_password() throws Throwable {
        driver.findElement(By.name("username")).sendKeys("KINGBallouch");
        driver.findElement(By.name("password")).sendKeys("Azbn1234");
        Thread.sleep(3000);
    }

    @When("^I click Login button$")
    public void i_click_Login_button() throws Throwable {
    	driver.findElement(By.xpath("//input[@value='Login']")).click();
       //System.out.println("click login");
    }

    @Then("^I successfully logged in$")
    public void i_successfully_logged_in() throws Throwable {
        System.out.println("succesfully login");
        driver.quit();
    }
    @When("^I enter invalid username and password$")
    public void i_enter_invalid_username_and_password() throws Throwable {
    	driver.findElement(By.name("username")).sendKeys("Samm");
        driver.findElement(By.name("password")).sendKeys("sms123");
        Thread.sleep(2000);
      //  System.out.println("I enter invalid username and password");
    }

    @Then("^I still see sign up link$")
    public void i_see_error_message() throws Throwable {
    	driver.findElement(By.xpath("//input[@value='Login']")).click();
    	 System.out.println("I still see sign up link");
    }
}
