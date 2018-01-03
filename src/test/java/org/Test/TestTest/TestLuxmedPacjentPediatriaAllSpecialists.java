package org.Test.TestTest;

import org.arquillian.extension.recorder.screenshooter.Screenshooter;
import org.arquillian.extension.recorder.screenshooter.api.Screenshot;
import org.arquillian.extension.recorder.screenshooter.browser.impl.ScreenshotTaker;
import org.eRezerwacjaRodzajWizyty.LuxmedE_Rezerwacja_Rodzaj;
import org.eRezerwacjaSzukajka.LuxmedERezerwacja;
import org.eRezerwacjaWyniki.LuxmedE_Rezerwacja_Wyniki;
import org.eRezerwacjaWyniki.LuxmedWynikiAllspecialists;
import org.intro.LuxmedIntro;
import org.jboss.arquillian.container.test.api.RunAsClient;
import org.jboss.arquillian.graphene.page.Page;
import org.jboss.arquillian.testng.Arquillian;
import org.mainPAge.LuxmedMainPacjent;
import org.testng.annotations.Test;

@RunAsClient
public class TestLuxmedPacjentPediatriaAllSpecialists extends Arquillian {

	@Page
	private LuxmedIntro Intro;
	@Page
	private LuxmedMainPacjent Main;
	@Page
	private LuxmedE_Rezerwacja_Rodzaj WizytaRodz;
	@Page
	private LuxmedERezerwacja Rezerwacja;
	@Page
	private LuxmedE_Rezerwacja_Wyniki Wyniki;
	@Page
	private LuxmedWynikiAllspecialists WynikiAll;

	@Screenshot()

	@Test(priority = 1, description = "Otwieranie strony")
	public void LunchLuxmed1() throws Exception {
		Intro.goTo();
	}

	@Test(priority = 2, description = "Wybieranie opcji pacjent")
	public void ChosePacjent1() {
		Intro.goToChoice().goToPacjent();
	}

	@Test(priority = 3, description = "Potwierdzanie Url")
	public void CheckUrl1() {
		Main.getUrl();
	}

	@Test(priority = 4, description = "Wybieranie Rezerwacji")
	public void ClickRezerwacja1() {
		Main.goToRez().goToRezerwacja();
	}

	@Test(priority = 5, description = "Wybieranie rodzaju wizyty")
	public void ChoseRodzajRezerwacji1() throws Exception {
		WizytaRodz.goPrywatna();
	}

	@Test(priority = 6, description = "Wybór placówki")
	public void choseLocationSpecialistPerson1() throws Exception {
		Rezerwacja.wyborCombo();
	}

	@Test(priority = 7, description = "Wybór specjalisty")
	public void choseSpecialist1() throws Exception {
		Rezerwacja.useSpecialist().choseSpecialist("Pediatria");
	}

	@Test(priority = 8, description = "Wybór daty urodzenia")
	public void choseData1() throws Exception {
		Rezerwacja.dataPacjenta();
	}

	@Test(priority = 9, description = "Wyszukuj wizyty")
	public void searchResults1() throws Exception {
		Rezerwacja.goSubbmitButton();
	}
	@Test(priority = 10, description="Print wszystkich specialistów z datami wolnego terminu")
	public void printSpecWyniki1() throws Exception {
		WynikiAll.printWyniki();
	}
	
}