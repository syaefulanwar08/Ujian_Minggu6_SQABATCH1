package sqademo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sqademo.driver.DriverSingleton;

public class Login {

private WebDriver driver;
	
	public Login() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"noo-site\"]/header/div[1]/div/ul[2]/li[2]/a")
	private WebElement btnMyAccountPage;
	
	@FindBy(id = "username")
	private WebElement inputUsername;
	
	@FindBy(id = "password")
	private WebElement inputPassword;
	
	@FindBy(id = "rememberme")
	private WebElement btnRememberme;
	
	@FindBy(xpath = "//button[@name='login']")
	private WebElement btnLogin;
	
	
	public void inputLogin(String username, String password) {
		inputUsername.sendKeys(username);
		inputPassword.sendKeys(password);
		btnRememberme.click();
		btnLogin.click();
	}
	
	
}
