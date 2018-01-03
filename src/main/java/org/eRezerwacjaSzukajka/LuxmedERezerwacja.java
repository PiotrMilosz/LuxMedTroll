package org.eRezerwacjaSzukajka;

import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.graphene.Graphene;
import org.openqa.selenium.WebDriver;
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
		szukajka.choosePlacowka("0");
	}

	public void wyborSpecjalisty() throws Exception {
		specialista.choseSpecialist("Zubrzycka Agnieszka");
		
	}
	public void dataPacjenta() throws Exception {
		data.choseYear("2017","04","07");
		// szukajka.goSearch();
	}
	public void goSubbmitButton() throws Exception {
		button.goSearch();
	}
}
