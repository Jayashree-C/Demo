import java.awt.AWTException;

import org.junit.BeforeClass;
import org.junit.Test;

public class AxisBank extends Base{

	@BeforeClass
	
	public static void launch() throws AWTException {
		getDriverAccess();
		loadUrl("https://www.axisbank.com/bank-smart/internet-banking/features-services");
		TAB();
		Enter();
	}
		
		@Test
		
		//Valid email ID, Invalid password
		
		public void tC1() throws InterruptedException {
		AxisPage a= new AxisPage();
		click(a.getLogin());
		windowsHandle();
		Thread.sleep(7000);
		fill(a.getLoginID(), "858022345");
		fill(a.getPass(), "Shree@2013");
		click(a.getSubmit());
		click(a.getPayment());
	}

	


}

