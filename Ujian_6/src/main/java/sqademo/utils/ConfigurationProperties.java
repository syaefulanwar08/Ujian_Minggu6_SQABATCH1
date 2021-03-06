package sqademo.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("framework.properties")
public class ConfigurationProperties {
	
	@Value("${browser}")
	private String browser;
	
	@Value("${inputUsernameRegister}")
	private String usernameRegister;
	
	@Value("${inputEmailRegister}")
	private String emailRegister;

	@Value("${inputPasswordRegister}")
	private String passwordRegister;
	
	@Value("${inputUsernameLogin}")
	private String usernameLogin;
	
	@Value("${inputPasswordLogin}")
	private String passwordLogin;
	
	@Value("${inputSearchShoes}")
	private String inputShoes;
	
	@Value("${inputSearchGlass}")
	private String inputGlass;
	
	//////// CHECKOUT //////////////
	
	@Value("${inputFirstname}")
	private String firstname;
	
	@Value("${inputLastname}")
	private String lastname;
	
	@Value("${inputCompany}")
	private String company;
	
	@Value("${inputCountry}")
	private String country;
	
	@Value("${inputHouse}")
	private String house;
	
	@Value("${inputApart}")
	private String apart;
	
	@Value("${inputCity}")
	private String city;
	
	@Value("${inputProvince}")
	private String province;
	
	@Value("${inputPostCode}")
	private String postcode;
	
	@Value("${inputPhone}")
	private String phone;
	
	@Value("${inputEmail}")
	private String email;
	
	@Value("${inputAddInfo}")
	private String addInfo;
	

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getCompany() {
		return company;
	}

	public String getCountry() {
		return country;
	}

	public String getHouse() {
		return house;
	}

	public String getApart() {
		return apart;
	}

	public String getCity() {
		return city;
	}

	public String getProvince() {
		return province;
	}

	public String getPostCode() {
		return postcode;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	public String getAddInfo() {
		return addInfo;
	}

	public String getInputShoes() {
		return inputShoes;
	}

	public String getInputGlass() {
		return inputGlass;
	}

	public String getUsernameLogin() {
		return usernameLogin;
	}

	public String getPasswordLogin() {
		return passwordLogin;
	}

	public String getUsernameRegister() {
		return usernameRegister;
	}

	public String getEmailRegister() {
		return emailRegister;
	}

	public String getPasswordRegister() {
		return passwordRegister;
	}

	public String getBrowser() {
		return browser;
	}

	
}
