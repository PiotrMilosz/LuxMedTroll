package org.eRezerwacjaSzukajka;

import java.util.concurrent.TimeUnit;

import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.graphene.Graphene;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LuxmedERezerwacja {

	@Drone
	private WebDriver driver;
	@FindBy(xpath = "//*[@id='cont_container']/form/table/tbody/tr[1]/td[2]")
	LuxmedERezerwacja_Szukajki szukajka;
	@FindBy(xpath = "//*[@id='cont_container']/form/table/tbody/tr[2]/td[2]")
	ChoseSpecialist specialista;
	@FindBy(xpath = "//*[@id='cont_container']/form/table/tbody/tr[4]/td[2]")
	ChoseYear data;
	@FindBy(xpath = "//*[@id='cont_container']/form/table/tbody/tr[6]/td[2]")
	ChoseSubmitButton button;
	@FindBy(id = "lokalizacja_id")
	private WebElement lokalizacjaCheck;
	@FindBy(id = "szukaj")
	private WebElement szukajCheck;
	@FindBy(id = "byear")
	private WebElement yearCheck;
	

	public LuxmedERezerwacja_Szukajki useSzukajka() {
		return szukajka;
	}
	public ChoseSpecialist useSpecialist() {
		return specialista;
	}
	public ChoseYear useYear() {
		return data;
	}
	public ChoseSubmitButton goButton() {
		return button;
	}

	public void wyborCombo() throws Exception {
		Graphene.waitAjax().withTimeout(20,TimeUnit.SECONDS).pollingEvery(1, TimeUnit.SECONDS).ignoring(WebDriverException.class).until().element(lokalizacjaCheck).is().clickable();
		szukajka.choosePlacowka("0");
	}

	public void wyborSpecjalisty() throws Exception {
		Graphene.waitAjax().withTimeout(20,TimeUnit.SECONDS).pollingEvery(1, TimeUnit.SECONDS).ignoring(WebDriverException.class).until().element(szukajCheck).is().clickable();
		specialista.choseSpecialist("Zubrzycka Agnieszka");
		
	}
	public void dataPacjenta() throws Exception {
		Graphene.waitAjax().withTimeout(20,TimeUnit.SECONDS).pollingEvery(1, TimeUnit.SECONDS).ignoring(WebDriverException.class).until().element(yearCheck).is().clickable();
		data.choseYear("2017","04","07");
		// szukajka.goSearch();
	}
	public void goSubbmitButton() throws Exception {
		button.goSearch();
	}
}
