package com.flipkart.stepdefinition;

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
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaptopPurchase {
	static WebDriver driver;
	@Given("user launches the flipkart application")
	public void user_launches_the_flipkart_application() {
 
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
	
		WebElement b = driver.findElement(By.xpath("//input[@type='text']"));
		b.sendKeys("Laptop", Keys.ENTER);
		
		WebElement b1 = driver.findElement(By.xpath("//div[contains(text(),'ASUS Core i3 10th Gen - (4 GB ')]"));
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].scrollIntoView(true)", b1);
		j.executeScript("arguments[0].click()", b1);
	}
	

	@When("user click on the laptop name")
	public void user_click_on_the_laptop_name() {
		
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

	}
	
	
	
	
	
	
 
}
