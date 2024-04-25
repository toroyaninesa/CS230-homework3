package homework3part2.Base;


import homework3part2.Pages.HeaderNavigation;
import homework3part2.Pages.LeftRailPanel;
import homework3part2.Pages.ProductPage;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {

  private WebDriver driver;
  protected HeaderNavigation header;
  protected ProductPage productPage;
  protected LeftRailPanel leftRailPanel;

  @Before
  public void setUp() {
    System.setProperty("webdriver.firefox.bin","/Applications/Firefox.app/Contents/MacOS/firefox");
    System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver");
    driver = new FirefoxDriver();
    driver.get("https://domus.am/");
    initializePages();
  }

  @After
  public void tearDown() {
    driver.quit();
  }

  private void initializePages() {
    header = new HeaderNavigation(driver);
    productPage = new ProductPage(driver);
    leftRailPanel = new LeftRailPanel(driver);
  };
}
