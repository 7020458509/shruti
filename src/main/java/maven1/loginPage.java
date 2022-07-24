package maven1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	@FindBy(id="userid")
	private WebElement username;
	@FindBy(id="password")
    private WebElement passw;
	@FindBy(xpath="//button[@class='button-orange wide']")
	private WebElement button;
	
	
	public loginPage (WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public void entercred(String user,String pass) {
		username.sendKeys(user);
		passw.sendKeys(pass);
	}
	public void clickloginbtn() {
		button.click();
	}
	

}
