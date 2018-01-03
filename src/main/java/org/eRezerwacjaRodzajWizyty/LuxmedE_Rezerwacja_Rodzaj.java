package org.eRezerwacjaRodzajWizyty;

import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.graphene.Graphene;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LuxmedE_Rezerwacja_Rodzaj {
	
	@Drone
	private WebDriver driver;
	
	@FindBy(id="pp")
	private WebElement radialPrywatne;
	@FindBy(id="pa")
	private WebElement radialAbonamentowa;
	@FindBy(id="pn")
	private WebElement radialNFZ;
	@FindBy(id="mp")
	private WebElement radialMedPrac;
	@FindBy(id="sk")
	private WebElement radialSklep;
	@FindBy(id="st")
	private WebElement radialStudent;
	@FindBy(id="am")
	private WebElement radialAktywnaMama;
	@FindBy(id="bez_logowania")
	private WebElement bezLogBtn;
	
	public void goPrywatna() throws Exception {
		radialPrywatne.click();
		String linkBtn = bezLogBtn.getAttribute("href");
		System.out.println(linkBtn);
		bezLogBtn.click();
		//driver.get(linkBtn);
		Graphene.waitForHttp(linkBtn);
		Thread.sleep(5000);
	}
	public void goNFZ() {
		radialNFZ.click();
		String linkBtn = bezLogBtn.getAttribute("href");
		bezLogBtn.click();
		//driver.get(linkBtn);
	}
	public void goStudent() {
		radialStudent.click();
		String linkBtn = bezLogBtn.getAttribute("href");
		bezLogBtn.click();
		//driver.get(linkBtn);
	}
	public void goMama() {
		radialAktywnaMama.click();
		String linkBtn = bezLogBtn.getAttribute("href");
		bezLogBtn.click();
		//driver.get(linkBtn);
	}

}
