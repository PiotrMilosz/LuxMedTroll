package org.eRezerwacjaWyniki;

import org.openqa.selenium.support.FindBy;

public class LuxmedWynikiAllspecialists {

	@FindBy(xpath = "//*[@id='wide_cont_container']/div")
	Wyniki_Lek_Box_Data WynikiBox;
	
	public Wyniki_Lek_Box_Data wynikiLekBox() {
		return WynikiBox;
	}
	public void printWyniki() throws Exception {
		WynikiBox.dataFromBoxes();
	}
}
