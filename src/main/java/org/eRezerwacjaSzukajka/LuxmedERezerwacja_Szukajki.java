package org.eRezerwacjaSzukajka;

import java.util.List;

import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.graphene.Graphene;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.gargoylesoftware.htmlunit.javascript.host.html.Option;

import junit.framework.Assert;

public class LuxmedERezerwacja_Szukajki {

	@Drone
	private WebDriver driver;

	@FindBy(id = "lokalizacja_id")
	private WebElement lokalizacjaDrop;
	@FindBy(id = "tick1")
	private WebElement tick;
	@FindBy(id = "tick1_info")
	private WebElement tick1info;

	public void choosePlacowka(String optionNumber) throws Exception {

		Graphene.guardAjax(lokalizacjaDrop);
		List<WebElement> options = lokalizacjaDrop.findElements(By.tagName("option"));
		/*
		 * value="0">Lublin, Dowolna placówka value="19">Lublin, ul. Zwycięska 6A
		 * value="4">Lublin, ul. Radziwiłłowska 5 value="3">Lublin, ul. Królewska 11
		 * value="24">Lublin, ul. Koncertowa 4D value="31">Lublin, ul. Krasińskiego 2
		 * value="5">Kraśnik, ul. Lubelska 56A value="6">Chełm, Plac Kupiecki 12
		 * value="7">Krasnystaw, ul. Poniatowskiego 33 a value="8">Biłgoraj, ul.
		 * Kościuszki 18 value="14">Zamość, ul. Spadek 41 value="15">Świdnik,
		 * ul.Racławicka 16
		 */
		String number;
		for (int i = 0; i < options.size(); i++) {
			number = options.get(i).getAttribute("value");
			if (number.equals(optionNumber)) {
				options.get(i).click();
			}
		}
		Thread.sleep(6000);
		String styleInfo = tick1info.getAttribute("style");
		System.out.println(styleInfo);
		// Graphene.waitAjax().until().element(By.xpath("//*[@id='tick1']")).is().visible();
		Assert.assertEquals("color: rgb(153, 0, 0); font-size: 12px; margin-top: 10px; display: none;", styleInfo);

	}


}
