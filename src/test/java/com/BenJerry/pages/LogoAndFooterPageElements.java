package com.BenJerry.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BenJerry.testBase.BaseClass;

public class LogoAndFooterPageElements {// Locate page elements and initialize the page object.
	public WebDriver driver;

	@FindBy(xpath = "/html/body/div/header/nav/div[2]/div/div/a/img")
	public WebElement logo;

	@FindBy(xpath = "//div[@class='footer-links']")
	public List<WebElement> footerMenu;

	public LogoAndFooterPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

}
