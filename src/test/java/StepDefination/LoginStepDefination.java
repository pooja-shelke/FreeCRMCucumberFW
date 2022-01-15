package StepDefination;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefination {

	WebDriver driver;
	Hooks h;
	
	@io.cucumber.java.Before
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "/home/shelke/Documents/VI/Selenium_Akash/Driver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		driver.navigate().to("https://ui.cogmento.com/");

	}
	
	@After
	public void tearDown()
	{
		driver.close();
	}
	
	
	
	@Given("^I am already on login page$")
	public void i_am_already_on_login_page(){
		
	}


	@When("^Title of the page is Cogmento CRM$")
	public void title_of_the_page_is_Cogmento_CRM() {
		String title = driver.getTitle();

		//Assert.assertEquals("Cogmento CRM", title, "Both are not matching");

	}
	
	@Then("^User Enter email-id as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void user_Enter_email_id_as_and_password_as(String arg1, String arg2)  {
		h=new Hooks(driver);
		h.EnterEmail(arg1);
		h.EnterPassword(arg2);
	}

	@Then("^Click on Login Button$")
	public void click_on_Login_Button()  {
		h=new Hooks(driver);
		h.ClickMe();
	}

	
	@Then("^Next Page title is$")
	public void next_Page_title_is() {
	
		boolean b=driver.findElement(By.xpath("//a[text()='Free account']")).isDisplayed();
		
		if(b==true)
		{
			System.out.println("Pooja shelake is displayed");
		}
		else
		{
			System.out.println("Pooja shelake is not displayed");
			
		}
		
	}
}
