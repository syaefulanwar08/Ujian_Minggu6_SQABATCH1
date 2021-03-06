package sqademo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sqademo.driver.DriverSingleton;

public class Register {

private WebDriver driver;
	
	public Register() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@class='woocommerce-store-notice__dismiss-link']")
	private WebElement dismiss;
	
	@FindBy(xpath = "//*[@id=\"noo-site\"]/header/div[1]/div/ul[2]/li[2]/a")
	private WebElement btnMyAccountPage;
	
	@FindBy(id = "reg_username")
	private WebElement inputRegisterUsername;
	
	@FindBy(id = "reg_email")
	private WebElement inputRegisterEmail;
	
	@FindBy(id = "reg_password")
	private WebElement inputRegisterPassword;
	
	@FindBy(xpath = "//button[@name='register']")
	private WebElement btnRegister;
	
	public void gotoMyAccount() {
		dismiss.click();
		btnMyAccountPage.click();
	}
	
	public void inputRegister(String RegisterUsername, String RegisterEmail, String RegisterPassword) {
		inputRegisterUsername.sendKeys(RegisterUsername);
		inputRegisterEmail.sendKeys(RegisterEmail);
		inputRegisterPassword.sendKeys(RegisterPassword);
		btnRegister.click();
	}
	
//	public String getDisplaynameRegister() {
//		return txtDisplaynameRegister.getText();
//	}
	
}
