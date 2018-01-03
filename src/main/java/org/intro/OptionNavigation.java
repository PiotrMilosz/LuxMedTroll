package org.intro;

import org.jboss.arquillian.drone.api.annotation.Drone;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OptionNavigation {

	@Drone
	private WebDriver driver;

	@FindBy(id = "pacjent_container")
	private WebElement pacjent;
	@FindBy(id = "lekarz_container")
	private WebElement lekarz;
	@FindBy(id = "firma_container")
	private WebElement firma;

	public void goToPacjent() {
		System.out.print("Clicking on Pacjent");
		WebElement linkP = pacjent.findElement(By.tagName("a"));
		String LinkPacjent = linkP.getAttribute("href");
		System.out.print(LinkPacjent);
		pacjent.click();
		driver.get(LinkPacjent);
		

	}

	public void goToLekarz() {
		System.out.print("Clicking on Lekarz");
		WebElement linkL = pacjent.findElement(By.tagName("a"));
		String LinkLekarz = linkL.getAttribute("href");
		System.out.print(LinkLekarz);
		lekarz.click();
		driver.get(LinkLekarz);

	}

	public void goToFirma() {
		System.out.print("Clicking on Firma");
		WebElement linkF = pacjent.findElement(By.tagName("a"));
		String LinkFirma = linkF.getAttribute("href");
		System.out.print(LinkFirma);
		firma.click();
		driver.get(LinkFirma);
		

	}

}
