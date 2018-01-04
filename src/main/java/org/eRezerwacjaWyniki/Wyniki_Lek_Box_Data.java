package org.eRezerwacjaWyniki;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.arquillian.extension.recorder.screenshooter.Screenshooter;
import org.arquillian.extension.recorder.screenshooter.ScreenshotType;
import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.graphene.Graphene;
import org.jboss.arquillian.test.api.ArquillianResource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Wyniki_Lek_Box_Data {

	@Drone
	private WebDriver driver;
	@ArquillianResource Screenshooter screenshooter;
	@FindBy(className = "rezerwuj_btn" )
	private WebElement rezerwujButton;
	
	
	public void dataFromBoxes() throws Exception {
		Graphene.waitAjax().withTimeout(20,TimeUnit.SECONDS).pollingEvery(1, TimeUnit.SECONDS).ignoring(WebDriverException.class).until().element(rezerwujButton).is().clickable();
		List<WebElement> boxList = driver.findElements(By.className("lek_box"));
		System.out.println("Lista dostepnych lekarzy i data pierwszego wolnego terminu");
		screenshooter.takeScreenshot("TerminyWszyscyPediatrzy.gif",ScreenshotType.GIF);
		
		for(int i = 0; i<10; i++) {
			WebElement lekarzId = boxList.get(i).findElement(By.tagName("a"));
			System.out.println(lekarzId.getText());
			WebElement dataAvailable = boxList.get(i).findElement(By.className("data_header"));
			
			System.out.println(dataAvailable.getText());
		}
	}
	
}
