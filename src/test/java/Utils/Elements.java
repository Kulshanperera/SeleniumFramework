package Utils;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Base.BaseClass;

public class Elements {

	public WebElement getWebElement(String identiferType, String identifierValue) {
		switch (identiferType) {

		case "XPATH":
			return BaseClass.driver.findElement(By.xpath(identifierValue));
			
		case "CSS":
			return BaseClass.driver.findElement(By.cssSelector(identifierValue));

		case "ID":
			return BaseClass.driver.findElement(By.id(identifierValue));

		case "NAME":
			return BaseClass.driver.findElement(By.name(identifierValue));

		default:
			return null;
		}

	}
	
	public List<WebElement> getWebElements(String identiferType, String identifierValue) {
		switch (identiferType) {

		case "XPATH":
			return BaseClass.driver.findElements(By.xpath(identifierValue));
			
		case "CSS":
			return BaseClass.driver.findElements(By.cssSelector(identifierValue));

		case "ID":
			return BaseClass.driver.findElements(By.id(identifierValue));

		case "NAME":
			return BaseClass.driver.findElements(By.name(identifierValue));

		default:
			return null;
		}

	}

}
