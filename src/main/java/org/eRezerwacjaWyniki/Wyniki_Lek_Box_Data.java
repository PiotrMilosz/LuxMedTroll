package org.eRezerwacjaWyniki;

import java.util.List;

import org.jboss.arquillian.drone.api.annotation.Drone;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Wyniki_Lek_Box_Data {

	@Drone
	private WebDriver driver;
	
	public void dataFromBoxes() throws Exception {
		Thread.sleep(15000);
		List<WebElement> boxList = driver.findElements(By.className("lek_box"));
		System.out.println("Lista dostepnych lekarzy i data pierwszego wolnego terminu");
		
		for(int i = 0; i<10; i++) {
			WebElement lekarzId = boxList.get(i).findElement(By.tagName("a"));
			System.out.println(lekarzId.getText());
			WebElement dataAvailable = boxList.get(i).findElement(By.className("data_header"));
			
			System.out.println(dataAvailable.getText());
		}
	}
	
}
