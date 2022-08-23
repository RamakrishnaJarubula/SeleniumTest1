package Sc1.Scenario1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
WebDriver driver;
	
	@FindBy(css="ul > li:nth-of-type(3) > a[title='T-shirts']")
	WebElement tShirt;
	
	@FindBy(css="img[title='Faded Short Sleeve T-shirts']")
	WebElement fadedTshirt;
	
	@FindBy(css="p#add_to_cart > button > span")
	WebElement addCart;
	
	@FindBy(css="div:nth-of-type(4).content_sortPagiBar")
	WebElement page;
	
	
	public LoginPage(WebDriver driver){

        this.driver = driver;

        PageFactory.initElements(driver, this);

    }

	public void tShirtClick()
	{
		tShirt.click();
	}

	public void fadedTShirtClick()
	{
		fadedTshirt.click();
	}
	
	public void addCartClick()
	{
		driver.switchTo().frame(0);
		addCart.click();
	}
}
