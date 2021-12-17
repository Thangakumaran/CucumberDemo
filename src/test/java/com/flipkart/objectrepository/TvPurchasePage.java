package com.flipkart.objectrepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.resources.CommonActions;

public class TvPurchasePage extends CommonActions {
	public TvPurchasePage() {

		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[text()='✕']")
	private WebElement closeButton;

	@FindBy(xpath = "//input[@type='text']")
	private WebElement searchBox;

	@FindBy(xpath = "//button[text()='ADD TO CART']")
	private WebElement addToCart;
	
	@FindBy(xpath = "//input[@type='text']")
	private WebElement OneDimList;


	public WebElement getOneDimList(String data) {
		
		return OneDimList;
				
	}

	public WebElement getCloseButton() {
	
		return closeButton;
	}

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}	
	
}
