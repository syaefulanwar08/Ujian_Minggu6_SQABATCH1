package sqademo.pages;

import javax.lang.model.element.Element;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import sqademo.driver.DriverSingleton;

public class CartPageToCheckout {

	private WebDriver driver;

	public CartPageToCheckout() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//i[@class='icon_bag_alt']")
	private WebElement gotoCartPage;

	@FindBy(xpath = "//a[@class='checkout-button button alt wc-forward']")
	private WebElement btnProceedToCheckout;

	@FindBy(id = "billing_first_name")
	private WebElement inputfirstname;

	@FindBy(id = "billing_last_name")
	private WebElement inputlastname;

	@FindBy(id = "billing_company")
	private WebElement inputcompany;

	@FindBy(id = "select2-billing_country-container")
	private WebElement chooseCountry;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	private WebElement inputCountry;

	@FindBy(id = "billing_address_1")
	private WebElement inputhouseAndStreetName;

	@FindBy(id = "billing_address_2")
	private WebElement inputApart;

	@FindBy(id = "billing_city")
	private WebElement inputCity;

	@FindBy(id = "select2-billing_state-container")
	private WebElement chooseProvince;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	private WebElement inputProvince;

	@FindBy(id = "billing_postcode")
	private WebElement inputPin;

	@FindBy(id = "billing_phone")
	private WebElement inputPhone;

	@FindBy(id = "billing_email")
	private WebElement inputEmail;

	@FindBy(id = "order_comments")
	private WebElement inputAddInfo;

	@FindBy(id = "terms")
	private WebElement terms;

	@FindBy(id = "place_order")
	private WebElement btnPlaceOrder;
	
	@FindBy(xpath = "//h2[@class='woocommerce-order-details__title']")
	private WebElement orderDetails;


	public void gotoCartPage() {
		gotoCartPage.click();
	}

	public void gotoCheckoutPage() {
		btnProceedToCheckout.click();
	}

	public void inputfirstnameLastname(String firstname, String lastname) {
		inputfirstname.sendKeys(firstname);
		inputlastname.sendKeys(lastname);
	}

	public void inputCompany(String company) {
		inputcompany.sendKeys(company);
	}

	public void chooseCountry(String country) {
		chooseCountry.click();
		inputCountry.click();
		inputCountry.sendKeys(country, Keys.ENTER);
	}

	public void inputStreetAddress(String house, String apart) {
		inputhouseAndStreetName.sendKeys(house);
		inputApart.sendKeys(apart);
	}

	public void inputCity(String city) {
		inputCity.sendKeys(city);
	}

	public void chooseProvince(String province) {
		chooseProvince.click();
		inputProvince.click();
		inputProvince.sendKeys(province, Keys.ENTER);
	}

	public void inputPostcodePhoneAndEmail(String postcode, String phone, String email) {
		inputPin.sendKeys(postcode);
		inputPhone.sendKeys(phone);
		inputEmail.sendKeys(email);
	}

	public void inputAddInfo(String addInfo) {
		inputAddInfo.sendKeys(addInfo, Keys.TAB);
	}

	public void checklist() {
		Actions a = new Actions(driver);
		a.moveToElement(terms);
		terms.click();
	}

	public void placeOrder() throws InterruptedException {
		btnPlaceOrder.click();
		
		Thread.sleep(5000);
		
		 Actions a = new Actions(driver);
	     a.moveToElement(orderDetails);
	}
}
