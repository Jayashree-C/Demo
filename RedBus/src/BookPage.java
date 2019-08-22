import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookPage extends Base {
	public BookPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="FromStation") 
	private WebElement fromstation;
	public WebElement getFromstation() {
		return fromstation;
	}
}
