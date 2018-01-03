package org.eRezerwacjaWyniki;

import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.arquillian.extension.recorder.screenshooter.Screenshot;
import org.arquillian.extension.recorder.screenshooter.event.TakeScreenshot;
import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.graphene.Graphene;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.gargoylesoftware.htmlunit.javascript.host.Screen;
import com.gargoylesoftware.htmlunit.javascript.host.file.File;

public class RodzajWizytyWyniki {

	@Drone
	private WebDriver driver;
	
	@FindBy(id = "0")
	private WebElement pediatra;
	@FindBy(className = "owl-item")
	private WebElement itemCheck;
	
	
	public void goPediatra() throws Exception {
		pediatra.click();
		Graphene.waitAjax().withTimeout(20,TimeUnit.SECONDS).pollingEvery(1, TimeUnit.SECONDS).ignoring(WebDriverException.class).until().element(itemCheck).is().present();
		//Thread.sleep(10000);
	}
	
}
