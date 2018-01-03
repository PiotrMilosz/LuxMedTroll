package org.intro;

import java.net.URL;

import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.graphene.Graphene;
import org.jboss.arquillian.graphene.page.Location;
import org.jboss.arquillian.test.api.ArquillianResource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import junit.framework.Assert;

public class LuxmedIntro {

	@Drone
	private WebDriver driver;

	@FindBy(id = "cont_container")
	private OptionNavigation navigation;
	@FindBy(id = "logo")
	private WebElement logo;

	public void goTo() throws Exception {
		driver.get("http://luxmedlublin.pl");
		Graphene.waitAjax().until().element(logo).is().visible();
		Thread.sleep(3000);
		String adress = driver.getCurrentUrl();
		System.out.println(adress);
		
	}

	public OptionNavigation goToChoice() {
		return navigation;

	}

	
}
