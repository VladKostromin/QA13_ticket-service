import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainTest {
    WebDriver webDriver;
    String url = "https://ticket-service-69443.firebaseapp.com/";

    @BeforeMethod
    public void preCondition() {
        webDriver = new ChromeDriver();
        webDriver.get(url);
    }
    @Test
    public void testSomething() {

    }
}
