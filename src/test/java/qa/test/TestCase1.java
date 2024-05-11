package qa.test;

import org.testng.annotations.Test;

import Base.BaseClass;
import PageEvents.HomePageEvents;
import PageEvents.LoginPageEvents;
import Utils.Elements;

public class TestCase1 extends BaseClass{
	
	Elements ele = new Elements();
	HomePageEvents home = new HomePageEvents();
	LoginPageEvents login = new LoginPageEvents();
	
	
  @Test
  public void GoToPage() {
	  home.signInButton();
	  login.verifyLoginPageIsLoaded();
  }
}
