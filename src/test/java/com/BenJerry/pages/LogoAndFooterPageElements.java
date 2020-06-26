package com.BenJerry.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BenJerry.testBase.BaseClass;

public class LogoAndFooterPageElements {// Locate page elements and initialize the page object.
	public WebDriver driver;
	
	@FindBy(xpath="/html/body/div/header/nav/div[2]/div/div/a/img")
	public WebElement logo;
	
//	@FindBy(xpath="//*[@id=\"cbp-tm-menu\"]/li[1]/a")
//	public WebElement Flavors;
//	
//	@FindBy(xpath="//*[@id=\"cbp-tm-menu\"]/li[2]/a")
//	public WebElement ShopsAndCatering;
//	
//	@FindBy(xpath="//*[@id=\"cbp-tm-menu\"]/li[3]/a")
//	public WebElement Values;
//	
//	@FindBy(xpath="//*[@id=\"cbp-tm-menu\"]/li[4]/a")
//	public WebElement AboutUs;
//	
//	@FindBy(xpath="//*[@id=\"cbp-tm-menu\"]/li[5]/a")
//	public WebElement WhatsNew;
//	
//	@FindBy(xpath="//*[@id=\"cbp-tm-menu\"]/li[6]/a")
//	public WebElement FindUs;
	
	@FindBy(xpath="//div[@class='footer-links']")
	public List<WebElement> footerMenu;
	
	public LogoAndFooterPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}


//	public WebElement getLogo() {
//		
//		return logo;
//	}
	
	
	
}
