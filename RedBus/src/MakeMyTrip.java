import java.awt.AWTException;

public class MakeMyTrip extends Base {

	public static void main(String[] args) throws AWTException {
		getDriverAccess();
		loadUrl("https://www.makemytrip.com/");
MakePage a=new MakePage();
		click(a.getFromloc());
		VK2();
		Enter();
		click(a.getDesloc());
		VK3();
		
	}

}
