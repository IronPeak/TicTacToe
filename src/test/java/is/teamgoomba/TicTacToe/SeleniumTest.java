package is.teamgoomba.TicTacToe;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import com.gargoylesoftware.htmlunit.BrowserVersion;
import org.openqa.selenium.support.ui.Select;

public class SeleniumTest {
	private HtmlUnitDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		if(runSeleniumTests()) {
			driver = new HtmlUnitDriver();
			baseUrl = "https://calm-beyond-6452.herokuapp.com/";
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
	}

	@Test
	public void testSelenium() throws Exception {
		if(runSeleniumTests()) {
			driver.get(baseUrl + "");
			assertEquals("Tic Tac Toe", driver.getTitle());
		}
	}

	@After
	public void tearDown() throws Exception {
		if(runSeleniumTests()) {
			driver.quit();
			String verificationErrorString = verificationErrors.toString();
			if (!"".equals(verificationErrorString)) {
				fail(verificationErrorString);
			}
		}
	}
  
	public static boolean runSeleniumTests() {
		String branch = System.getenv("TRAVIS_BRANCH");
		if(branch != null && branch == "SeleniumTests") {
			return true;
		}
		return false;
	}
}
