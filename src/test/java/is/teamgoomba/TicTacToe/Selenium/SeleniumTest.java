package is.teamgoomba.TicTacToe.Selenium;

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
		driver = new HtmlUnitDriver();
		baseUrl = "http://goomba-developmentbranch.herokuapp.com/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testTitle() throws Exception {
		driver.get(baseUrl + "");
		assertEquals("Tic Tac Toe", driver.getTitle());
	}
	
	@Test
	public void testClearBoard() {
		driver.get(baseUrl + "");
		WebElement newGameButton = driver.findElement(By.id("restart"));
		newGameButton.click();
		for(int i = 0; i < 9; i++) {
			WebElement box = driver.findElement(By.id("box_" + i));
			String classAttribute = box.getAttribute("class");
			assertEquals("empty", classAttribute);
		}
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}
}
