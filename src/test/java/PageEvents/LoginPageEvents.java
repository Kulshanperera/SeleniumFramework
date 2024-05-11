package PageEvents;

import org.testng.Assert;

import Pagelements.LoginPageElements;
import Utils.Elements;

public class LoginPageEvents {

	Elements ele = new Elements();

	public void verifyLoginPageIsLoaded() {

		Assert.assertTrue(ele.getWebElements("XPATH", LoginPageElements.loginPage).size()>0,
				"Element is not found");

	}

}
