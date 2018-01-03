package org.eRezerwacjaSzukajka;

import java.util.concurrent.TimeUnit;

import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.graphene.Graphene;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import junit.framework.Assert;

public class ChoseYear {

	@Drone
	private WebDriver driver;

	@FindBy(id = "byear")
	private WebElement year;
	@FindBy(id = "tick5_info")
	private WebElement tick5;

	public void choseYear(String yearStr, String monthStr, String dayStr) throws Exception {
		Graphene.waitModel().until().element(year).is().clickable();
		year.click();
		year.clear();
		year.sendKeys(yearStr);
		;
		Thread.sleep(5000);

		/*
		 * Graphene.waitModel().until().element(By.xpath("//*[@id='bmonth']")).is().
		 * visible().wait(10000);
		 * //Graphene.waitAjax().until().element(By.xpath("//*[@id='bmonth']")).is().
		 * visible(); // until().element(By.xpath("//*[@id='bmonth']")).is().visible();
		 */
		Long yearLng = Long.parseLong(yearStr);
		if (yearLng > 1998) {
			WebElement month = driver.findElement(By.id("bmonth"));
			month.click();
			month.clear();
			month.sendKeys(monthStr);
			Thread.sleep(2000);
			WebElement day = driver.findElement(By.id("bday"));
			day.click();
			day.clear();
			day.sendKeys(dayStr);
			Thread.sleep(2000);

		}
		String styleInfo = tick5.getAttribute("style");
		System.out.println(styleInfo);
		Assert.assertEquals("color: rgb(153, 0, 0); font-size: 12px; margin-top: 10px; width: 200px; display: none;", styleInfo);

		//Graphene.waitAjax().until().element(By.xpath("//*[@id='tick5']")).is().visible();
		//Assert.assertTrue(tick5.isDisplayed());
	}

}
