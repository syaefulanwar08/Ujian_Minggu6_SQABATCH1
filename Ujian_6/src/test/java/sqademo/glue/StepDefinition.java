package sqademo.glue;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.spring.CucumberContextConfiguration;
import sqademo.config.AutomationFrameworkConfiguration;
import sqademo.driver.DriverSingleton;
import sqademo.pages.AddToChart;
import sqademo.pages.CartPageToCheckout;
import sqademo.pages.Login;
import sqademo.pages.Register;
import sqademo.utils.ConfigurationProperties;
import sqademo.utils.Constants;
import sqademo.utils.TestCases;
import sqademo.utils.Utils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

@CucumberContextConfiguration
@ContextConfiguration(classes = AutomationFrameworkConfiguration.class)
public class StepDefinition {

	private WebDriver driver;
	private Register register;
	private Login login;
	private AddToChart addtochart;
	private CartPageToCheckout cartToCheckout;
	ExtentTest extentTest;
	static ExtentReports report = new ExtentReports("src/main/resources/Report.html");
	
	@Autowired
	ConfigurationProperties configurationProperties;
	
	@Before
	public void initializeObjects() {
		DriverSingleton.getInstance(configurationProperties.getBrowser());
		register = new Register();
		login = new Login();
		addtochart = new AddToChart();
		cartToCheckout = new CartPageToCheckout();
		TestCases[] tests = TestCases.values();
		extentTest = report.startTest(tests[Utils.testCount].getTestName());
		Utils.testCount++;
	}
	
	@Given("User go to the website")
	public void User_go_to_the_Website() {
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL);
		extentTest.log(LogStatus.PASS, "Navigating to "+ Constants.URL);
	}
	
	@When("Click button my account page")
	public void Click_button_my_account_page() {
		register.gotoMyAccount();
		extentTest.log(LogStatus.PASS, "Click button my account page");
	}
	
	@When("User input username email password and click register")
	public void User_input_username_email_password_and_click_register() {
		register.inputRegister(configurationProperties.getUsernameRegister(), configurationProperties.getEmailRegister(), configurationProperties.getPasswordRegister());
		extentTest.log(LogStatus.PASS, "User input username email password and click register");
	}
	
	//////// LOGIN //////////////////
	
	
	@When("User input username password and click login")
	public void User_input_username_password_and_click_login() {
		login.inputLogin(configurationProperties.getUsernameLogin(), configurationProperties.getPasswordLogin());
		extentTest.log(LogStatus.PASS, "User input username password and click login");
	}
	

	//////// ADD TO CHART ////////////////
	
	@Given("Back to home page")
	public void Back_to_home_page() {
		addtochart.backHomePage();
		extentTest.log(LogStatus.PASS, "Back to home page");
	}
	
	@When("Search shoes")
	public void Search_shoes() {
		addtochart.searchShoes(configurationProperties.getInputShoes());
		extentTest.log(LogStatus.PASS, "Search shoes");
	}
	
	@And("Choose color and size shoes")
	public void Choose_color_and_size_shoes() {
		addtochart.chooseOptionShoes();
		extentTest.log(LogStatus.PASS, "Choose color and size");
	}
	
	@And("Click button add to chart shoes")
	public void Click_button_add_to_chart_shoes() {
		addtochart.addToChartShoes();
		extentTest.log(LogStatus.PASS, "Click button add to chart shoes");
	}
	
	@When("Search glass")
	public void Search_glass() {
		addtochart.searchGlass(configurationProperties.getInputGlass());
		extentTest.log(LogStatus.PASS, "Search glass");
	}
	
	@And("Click glass product")
	public void Click_glass_product() {
		addtochart.productGlass();
		extentTest.log(LogStatus.PASS, "Click glass product");
	}
	
	@And("Choose color and size glass")
	public void Choose_color_and_size_glass() {
		addtochart.chooseOptionGlass();
		extentTest.log(LogStatus.PASS, "Choose color and size glass");
	}
	
	@And("Click button add to chart glass")
	public void Click_button_add_to_chart_glass() {
		addtochart.addToChartGlass();
		extentTest.log(LogStatus.PASS, "Click button add to chart glass");
	}
	
	/////// CHART PAGE TO CHECKOUT /////////////
	
	@Given("Go to cart page")
	public void Go_to_cart_page() {
		cartToCheckout.gotoCartPage();
		extentTest.log(LogStatus.PASS, "Go to cart page");
	}
	
	@When("Click button proceed to checkout")
	public void Click_button_proceed_to_checkout() {
		cartToCheckout.gotoCheckoutPage();
		extentTest.log(LogStatus.PASS, "Click button proceed to checkout");
	}
	
	@And("User input fisrtname and lastname")
	public void User_input_fistname_and_lastname() {
		cartToCheckout.inputfirstnameLastname(configurationProperties.getFirstname(), configurationProperties.getLastname());
		extentTest.log(LogStatus.PASS, "User input fisrtname and lastname");
	}
	
	@And("User input company")
	public void User_input_company() {
		cartToCheckout.inputCompany(configurationProperties.getCompany());
		extentTest.log(LogStatus.PASS, "User input company");
	}
	
	@And("User choose country")
	public void User_choose_country() {
		cartToCheckout.chooseCountry(configurationProperties.getCountry());
		extentTest.log(LogStatus.PASS, "User choose country");
	}
	
	@And("User input street address")
	public void User_input_street_address() {
		cartToCheckout.inputStreetAddress(configurationProperties.getHouse(), configurationProperties.getApart());
		extentTest.log(LogStatus.PASS, "User input street address");
	}
	
	@And("User input town or city")
	public void User_input_town_or_city() {
		cartToCheckout.inputCity(configurationProperties.getCity());
		extentTest.log(LogStatus.PASS, "User input town or city");
	}
	
	@And("User choose province")
	public void User_choose_province() {
		cartToCheckout.chooseProvince(configurationProperties.getProvince());
		extentTest.log(LogStatus.PASS, "User choose state");
	}
	
	@And("User input postcode phone and email")
	public void User_input_postcode_phone_and_email() {
		cartToCheckout.inputPostcodePhoneAndEmail(configurationProperties.getPostCode(), configurationProperties.getPhone(), configurationProperties.getEmail());
		extentTest.log(LogStatus.PASS, "User input pin phone and email");
	}
	
	@And("User input additional information")
	public void User_input_additional_information() {
		cartToCheckout.inputAddInfo(configurationProperties.getAddInfo());
		extentTest.log(LogStatus.PASS, "User input additional information");
	}
	
	@And("User checklist button")
	public void User_checklist_button() {
		cartToCheckout.checklist();
		extentTest.log(LogStatus.PASS, "User checklist button");
	}
	
	@And("User click button place order")
	public void User_click_button_place_order() throws InterruptedException {
		cartToCheckout.placeOrder();
		extentTest.log(LogStatus.PASS, "User click button place order");
	}
	
	
	
	@After
	public void closeObject() {
		report.endTest(extentTest);
		report.flush();
	}
	
}
