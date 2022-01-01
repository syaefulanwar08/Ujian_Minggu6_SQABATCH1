package sqademo.pages;

import java.security.Key;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sqademo.driver.DriverSingleton;

public class AddToChart {

private WebDriver driver;
	
	public AddToChart() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@class='custom-logo-link']")
	private WebElement backHomePage;
	
	@FindBy(xpath = "//a[@class='noo-search']")
	private WebElement search;
	
	@FindBy(xpath = "//input[@type='search']")
	private WebElement inputSearch;
	
	@FindBy(id = "pa_color")
	private WebElement chooseColor;
	
	@FindBy(id = "pa_size")
	private WebElement chooseSize;
	
	@FindBy(xpath = "//button[@class='single_add_to_cart_button button alt']")
	private WebElement btnAddToChart;
	
	@FindBy(xpath = "//*[@id=\"noo-site\"]/div[2]/div[2]/div/div/div[2]/div/h3/a")
	private WebElement productGlass;
	
	
	
	public void backHomePage() {
		backHomePage.click();
	}
	
	public void searchShoes(String shoes) {
		search.click();
		inputSearch.sendKeys(shoes, Keys.ENTER);
	}
	
	public void chooseOptionShoes() {
		chooseColor.click();
		chooseColor.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		chooseSize.click();
		chooseSize.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
	}
	
	public void addToChartShoes() {
		btnAddToChart.click();
	}
	
	public void searchGlass(String glass) {
		search.click();
		inputSearch.sendKeys(glass, Keys.ENTER);
	}
	
	public void productGlass() {
		productGlass.click();
	}
	
	public void chooseOptionGlass() {
		chooseColor.click();
		chooseColor.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		chooseSize.click();
		chooseSize.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
	}
	
	public void addToChartGlass() {
		btnAddToChart.click();
	}
}
