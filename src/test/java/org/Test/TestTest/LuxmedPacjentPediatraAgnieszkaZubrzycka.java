package org.Test.TestTest;

import org.arquillian.extension.recorder.screenshooter.Screenshooter;
import org.arquillian.extension.recorder.screenshooter.api.Screenshot;
import org.arquillian.extension.recorder.screenshooter.browser.impl.ScreenshotTaker;
import org.eRezerwacjaRodzajWizyty.LuxmedE_Rezerwacja_Rodzaj;
import org.eRezerwacjaSzukajka.LuxmedERezerwacja;
import org.eRezerwacjaWyniki.LuxmedE_Rezerwacja_Wyniki;
import org.intro.LuxmedIntro;
import org.jboss.arquillian.container.test.api.RunAsClient;
import org.jboss.arquillian.graphene.page.InitialPage;
import org.jboss.arquillian.graphene.page.Location;
import org.jboss.arquillian.graphene.page.Page;
import org.jboss.arquillian.testng.Arquillian;
import org.mainPAge.LuxmedMainPacjent;
import org.testng.annotations.Test;

@RunAsClient
public class LuxmedPacjentPediatraAgnieszkaZubrzycka extends Arquillian {

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

	@Screenshot()

	@Test(priority = 1, description = "Otwieranie strony")
	public void LunchLuxmed() throws Exception {
		Intro.goTo();
	}

	@Test(priority = 2, description = "Wybieranie opcji pacjent")
	public void ChosePacjent() {
		Intro.goToChoice().goToPacjent();
	}

	@Test(priority = 3, description = "Potwierdzanie Url")
	public void CheckUrl() {
		Main.getUrl();
	}

	@Test(priority = 4, description = "Wybieranie Rezerwacji")
	public void ClickRezerwacja() {
		Main.goToRez().goToRezerwacja();
	}

	@Test(priority = 5, description = "Wybieranie rodzaju wizyty")
	public void ChoseRodzajRezerwacji() throws Exception {
		WizytaRodz.goPrywatna();
	}

	@Test(priority = 6, description = "Wybór placówki")
	public void choseLocationSpecialistPerson() throws Exception {
		Rezerwacja.wyborCombo();
	}

	@Test(priority = 7, description = "Wybór specjalisty")
	public void choseSpecialist() throws Exception {
		Rezerwacja.wyborSpecjalisty();
	}

	@Test(priority = 8, description = "Wybór daty urodzenia")
	public void choseData() throws Exception {
		Rezerwacja.dataPacjenta();
	}

	@Test(priority = 9, description = "Wyszukuj wizyty")
	public void searchResults() throws Exception {
		Rezerwacja.goSubbmitButton();
	}
	@Test(priority=10,description="Wybór rodzaju wizyty i dostepne terminy")
	public void goVisitTypeAndResults() throws Exception {
		Wyniki.goWizytaPediatra();
	}
}