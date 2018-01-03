package org.eRezerwacjaSzukajka;

import java.util.List;

import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.graphene.Graphene;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import junit.framework.Assert;

public class ChoseSpecialist {

	@Drone
	private WebDriver driver;
	@FindBy(id = "szukaj")
	private WebElement specialistaInput;
	@FindBy(id = "tick2_info")
	private WebElement tick2;
	

public void choseSpecialist(String nazwisko) throws Exception	
{
	specialistaInput.sendKeys(nazwisko);
	specialistaInput.sendKeys(Keys.ENTER);
	
	
	Thread.sleep(6000);
	String styleInfo = tick2.getAttribute("style");
	System.out.println(styleInfo);
	Assert.assertEquals("color: rgb(153, 0, 0); font-size: 12px; margin-top: 10px; display: none;", styleInfo);
	Thread.sleep(3000);
	
}
	
	/*public void chooseSpecialist(String nazwisko) {
		
		specialistaInput.click();
		WebElement specialistaDrop = driver.findElement(By.id("personel_id"));
		List<WebElement> options = specialistaDrop.findElements(By.tagName("option"));

		String nazwiskot;
		for (int i = 0; i < options.size(); i++) {
			nazwiskot = options.get(i).getText();
			System.out.print(nazwiskot);
			if (nazwiskot.equals(nazwisko)) {
				options.get(i).click();
			}
		}

	}*/
}
