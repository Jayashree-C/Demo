import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AxisPage extends Base {
	public AxisPage(){
		PageFactory.initElements(driver, this);
		
		}
		@FindBy(xpath="(//a[text()='Login'])[4]")
		private WebElement login;
		
		@FindBy(id="loginId")
		private WebElement loginID;
		
		@FindBy(id="newPassword")
		private WebElement pass;
		
		@FindBy(xpath="//input[@value='Login']")
		private WebElement submit;
		
		@FindBy(xpath="//a[text()='PAYMENTS']")
		private WebElement payment;
		
		
		
		public WebElement getPayment() {
			return payment;
		}

		public WebElement getSubmit() {
			return submit;
		}

		public WebElement getPass() {
			return pass;
		}

		public WebElement getLogin() {
			return login;
		

	}

		public WebElement getLoginID() {
			return loginID;
		}
	}