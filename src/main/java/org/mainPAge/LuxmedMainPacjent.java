package org.mainPAge;

import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.graphene.page.Location;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LuxmedMainPacjent {

	
	@Drone
	private WebDriver driver;
	
	@FindBy(id = "right_container")
	private RezerwacjaBtn rezerwacja;
	
	static String pacjentUrl = "http://luxmedlublin.pl/dla_pacjenta/";
	public void getUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.print(currentUrl);
		Assert.assertEquals(currentUrl, pacjentUrl);
	}
	public RezerwacjaBtn goToRez() {
		return rezerwacja;
	}
}
