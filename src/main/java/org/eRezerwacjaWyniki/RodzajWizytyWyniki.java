package org.eRezerwacjaWyniki;

import org.apache.commons.io.FileUtils;
import org.arquillian.extension.recorder.screenshooter.Screenshot;
import org.arquillian.extension.recorder.screenshooter.event.TakeScreenshot;
import org.jboss.arquillian.drone.api.annotation.Drone;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.gargoylesoftware.htmlunit.javascript.host.Screen;
import com.gargoylesoftware.htmlunit.javascript.host.file.File;

public class RodzajWizytyWyniki {

	@Drone
	private WebDriver driver;
	
	@FindBy(id = "0")
	private WebElement pediatra;
	
	public void goPediatra() throws Exception {
		pediatra.click();
		Thread.sleep(10000);
	}
	
}
