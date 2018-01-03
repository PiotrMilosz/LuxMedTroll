package org.eRezerwacjaSzukajka;

import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.graphene.Graphene;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChoseSubmitButton {

	@Drone
	private WebDriver driver;
	
	@FindBy(name = "submit_search")
	private WebElement searchBtn;
	
	public void goSearch() throws Exception {
		Graphene.waitAjax().until().element(searchBtn).is().clickable();
		searchBtn.click();
		searchBtn.click();
		Thread.sleep(10000);
		
	}
}
