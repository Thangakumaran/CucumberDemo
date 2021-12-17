package com.flipkart.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.resources.CommonActions;

public class LaptopPurchasePage extends CommonActions {
	
	public LaptopPurchasePage() {

		PageFactory.initElements(driver,this);
	
	}
	@FindBy(xpath = "//button[text()='✕']")
	private WebElement cancelButton;
	
	@FindBy(xpath = "//input[@type='text']")
	private WebElement textBox;
	
	@FindBy(xpath = "//button[text()='ADD TO CART']")
	private WebElement addTocartElement;

	public WebElement getCancelButton() {
		return cancelButton;
	}

	public WebElement getTextBox() {
		return textBox;
	}

	public WebElement getAddTocartElement() {
		return addTocartElement;
	}
	
	

}
