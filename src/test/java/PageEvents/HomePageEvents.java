package PageEvents;

import Pagelements.HomePageElements;
import Utils.Elements;

public class HomePageEvents {

	Elements ele = new Elements();

	public void signInButton() {
		ele.getWebElement("XPATH", HomePageElements.signInbutton).click();
		// homePagEvents is interface.
		// use home page variable without creating object HomePageElements.signInbutton.
		// since they are final static variables cannot change dynamically.

	}

}
