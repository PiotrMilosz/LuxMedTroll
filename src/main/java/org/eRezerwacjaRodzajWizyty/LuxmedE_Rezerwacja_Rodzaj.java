package org.eRezerwacjaRodzajWizyty;

import java.util.concurrent.TimeUnit;

import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.graphene.Graphene;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
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
	@FindBy(id = "cont_container")
	private WebElement containerCheck;
	@FindBy(id = "lokalizacja_id")
	private WebElement lokalizacjaCheck;
	
	public void goPrywatna(){
		radialPrywatne.click();
		Graphene.waitAjax().withTimeout(20,TimeUnit.SECONDS).pollingEvery(1, TimeUnit.SECONDS).ignoring(WebDriverException.class).until().element(bezLogBtn).is().clickable();
		String linkBtn = bezLogBtn.getAttribute("href");
		System.out.println(linkBtn);
		bezLogBtn.click();
		//driver.get(linkBtn);
		Graphene.waitForHttp(linkBtn);
		Graphene.waitAjax().withTimeout(20,TimeUnit.SECONDS).pollingEvery(1, TimeUnit.SECONDS).ignoring(WebDriverException.class).until().element(containerCheck).is().present();
		Graphene.waitAjax().withTimeout(20,TimeUnit.SECONDS).pollingEvery(1, TimeUnit.SECONDS).ignoring(WebDriverException.class).until().element(lokalizacjaCheck).is().clickable();
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
