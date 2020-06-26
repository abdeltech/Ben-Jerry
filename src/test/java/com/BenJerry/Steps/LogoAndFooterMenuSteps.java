package com.BenJerry.Steps;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.BenJerry.pages.LogoAndFooterPageElements;
import com.BenJerry.testBase.BaseClass;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class LogoAndFooterMenuSteps extends BaseClass {
	public WebDriver driver;
	public LogoAndFooterPageElements logoDashBoard;
	public static Logger log = LogManager.getLogger(BaseClass.class.getName());

	@When("user navigate to action ben jerry page")
	public void user_navigate_to_action_ben_jerry_page() throws IOException {

		driver = initializeDriver();

		log.info("Driver is initialized");
		driver.get(prop.getProperty("url"));
		log.info("Navigated to Home page");

	}

	@Then("user should see the image displayed")
	public void user_should_see_the_image_displayed() throws InterruptedException {

		driver.switchTo().frame(0);

		logoDashBoard = new LogoAndFooterPageElements();
		boolean actual = logoDashBoard.logo.isDisplayed();
		System.out.println(actual);
		Assert.assertTrue("No Logo is displayed", actual);

		Thread.sleep(3000);

		System.out.println("Step Test completed");

		driver.switchTo().defaultContent();


	}

	@Then("user see footer menu is displayed")
	public void user_see_footer_menu_is_displayed(DataTable dashBoard) throws InterruptedException {
		
		driver.switchTo().frame(1);

		List<String> expectedMenu = dashBoard.asList();
		List<String> actualMenu = new ArrayList<String>();

		for (WebElement list : logoDashBoard.footerMenu) {
			actualMenu.add(list.getText());
		}

		System.out.println(expectedMenu);
		System.out.println(actualMenu);

		Thread.sleep(2000);

		Assert.assertTrue(actualMenu.equals(expectedMenu));

		driver.switchTo().defaultContent();
		
	}

}
