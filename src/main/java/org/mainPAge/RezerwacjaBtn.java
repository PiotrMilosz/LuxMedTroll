package org.mainPAge;

import org.jboss.arquillian.drone.api.annotation.Drone;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RezerwacjaBtn {

	@Drone
	private WebDriver driver;

	@FindBy(id = "rezerwacja_long")
	private WebElement rezButton;

	public void goToRezerwacja() {
		WebElement linkERez = rezButton.findElement(By.tagName("a"));
		String LinkRez =linkERez.getAttribute("href");
		System.out.print(LinkRez);
		driver.get(LinkRez);
	}
};
