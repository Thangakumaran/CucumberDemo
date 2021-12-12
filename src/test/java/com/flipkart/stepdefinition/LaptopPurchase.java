package com.flipkart.stepdefinition;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaptopPurchase {
	static WebDriver driver;
	static String laptopName;
	@Given("user launches the flipkart application")
	public void user_launches_the_flipkart_application() {
 
		System.out.println("Launch");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}

	@Given("user login by entering credentials")
	public void user_login_by_entering_credentials() {
	
		  try {
				
				WebElement a = driver.findElement(By.xpath("//button[text()='✕']"));
				a.isDisplayed();
				a.click();
			} catch (Exception e) {
				System.out.println("Login popup is closed");
			}
	}

	@When("user search the laptop")
	public void user_search_the_laptop() {
	
		laptopName="ASUS TUF Dash F15 (2021)";
		WebElement b = driver.findElement(By.xpath("//input[@type='text']"));
		b.sendKeys("ASUS TUF Dash F15 (2021)", Keys.ENTER);
		
		
	}
	

	@When("user click on the laptop name")
	public void user_click_on_the_laptop_name() throws InterruptedException {
		Thread.sleep(2000);
		WebElement b1 = driver.findElement(By.xpath("(//div[contains(text(),'"+laptopName+"')])[1]"));
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].click()", b1);
		
		String c = driver.getWindowHandle();
		Set<String> d = driver.getWindowHandles();
		for (String e : d) {
			if (!c.equals(e)) {
				driver.switchTo().window(e);
			}

		}
		
	}

	@Then("user click on add to cart")
	public void user_click_on_add_to_cart() {
	  
	
		WebElement i = driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
		i.click();
        driver.quit();
	}
	

@When("user search the laptop by one dim list")
public void user_search_the_laptop_by_one_dim_list(DataTable dataTable) {
   
	List<String> asList = dataTable.asList(String.class);
	WebElement b = driver.findElement(By.xpath("//input[@type='text']"));
	b.sendKeys(asList.get(0), Keys.ENTER);
	
	laptopName=asList.get(0);
}

@When("user search the laptop by one dim map")
public void user_search_the_laptop_by_one_dim_map(DataTable dataTable) {

	Map<String, String> asmap = dataTable.asMap(String.class, String.class);
	WebElement b = driver.findElement(By.xpath("//input[@type='text']"));
	b.sendKeys(asmap.get("3"), Keys.ENTER);
	   
	laptopName=asmap.get("3");
}
	
	
	
 
}
