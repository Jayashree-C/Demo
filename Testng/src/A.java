import org.testng.annotations.Test;

public class A {
@Test(priority=-17)
private void tc1() {
System.out.println("1234");
}
@Test(priority=17)
private void tc2() {
System.out.println("abcde");
}
@Test(priority=19, invocationCount=5
)
private void tc3() {
System.out.println("ab");
}

@Test(priority=20, enabled=false)
private void tc4() {
System.out.println("Jai");
}
}