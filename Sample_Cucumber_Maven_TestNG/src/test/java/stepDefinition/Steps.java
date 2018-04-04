package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	WebDriver driver;
	@Given("^I want to write a step with precondition$")
	public void i_want_to_write_a_step_with_precondition() throws Throwable {
	  System.out.println("I want to write a step with precondition");
	}

	@Given("^some other precondition$")
	public void some_other_precondition() throws Throwable {
		System.out.println("some other precondition");
	}

	@When("^I complete action$")
	public void i_complete_action() throws Throwable {
		System.out.println("I complete action");
	}

	@When("^some other action$")
	public void some_other_action() throws Throwable {
		System.out.println("some other action");
	}

	@When("^yet another action$")
	public void yet_another_action() throws Throwable {
		System.out.println("yet another action");
	}

	@Then("^I validate the outcomes$")
	public void i_validate_the_outcomes() throws Throwable {
		System.out.println("I validate the outcomes");
	}

	@Then("^check more outcomes$")
	public void check_more_outcomes() throws Throwable {
		System.out.println("check more outcomes");
	}
	
	/*@Given("^Open Chrome and Launch Facebook$")
	public void open_Chrome_and_Launch_Facebook() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Given("^Print Page Title$")
	public void print_Page_Title() throws Throwable {
		System.out.println("Page Title :"+driver.getTitle());
	}

	@Given("^Close the Browser$")
	public void close_the_Browser() throws Throwable {
		driver.close();
	}*/
	
	@Given("^Open Chrome and Launch Firefox$")
	public void open_Chrome_and_Launch_Firefox() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Given("^Print page Title$")
	public void print_page_Title() throws Throwable {
		System.out.println("Page Title :"+driver.getTitle());
	}

	@Given("^Close Browser$")
	public void close_Browser() throws Throwable {
		driver.close();
	}

}
