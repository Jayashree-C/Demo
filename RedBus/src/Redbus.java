import java.awt.AWTException;

public class Redbus extends Base {

	public static void main(String[] args) throws AWTException, InterruptedException {
	getDriverAccess();
	loadUrl("https://www.redbus.in/");
	RedPage a =new RedPage();
	fill(a.getSrc1(), "Chennai");
	fill(a.getDes1(), "Thirupathi");
	TAB();
	Enter();
	Thread.sleep(7000);
	click(a.getClk());
	Thread.sleep(7000);

	TAB();
	Enter();
	Thread.sleep(7000);

	click(a.getDate());
	click(a.getRclk());
	click(a.getRclk());
	click(a.getSearchbus());
	}

}
