import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MakePage extends Base {
	public MakePage()
	{
		PageFactory.initElements(driver, this);
		
	}
	public WebElement getFromloc() {
		return fromloc;
	}
	public WebElement getDesloc() {
		return desloc;
	}
	@FindBy(xpath="//input[@type='text']")
	private WebElement fromloc;
	

	
	@FindBy(xpath="//input[@placeholder='To']")
	private WebElement desloc;
	
	
}
