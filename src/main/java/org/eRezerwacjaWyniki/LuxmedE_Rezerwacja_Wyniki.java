package org.eRezerwacjaWyniki;

import org.jboss.arquillian.drone.api.annotation.Drone;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LuxmedE_Rezerwacja_Wyniki {

	@Drone
	private WebDriver driver;
	@FindBy(name = "lekForm")
	RodzajWizytyWyniki rodzaj;
	
	public RodzajWizytyWyniki choseRodzajWizyty() {
		return rodzaj;
	}

	public void goWizytaPediatra() throws Exception {
		rodzaj.goPediatra();
	}
}

	
