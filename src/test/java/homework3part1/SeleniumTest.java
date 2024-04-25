package homework3part1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SeleniumTest {
  public static void main(String[] args) {
    System.setProperty("webdriver.firefox.bin","/Applications/Firefox.app/Contents/MacOS/firefox");
    System.setProperty("webdriver.gecko.driver", "/Users/inesatoroyan/Desktop/homework3/src/test/resources/geckodriver");

    WebDriver driver = new FirefoxDriver();

    driver.get("https://emis.am/");
    driver.manage().window().maximize();

    /**
     * Scenario 1
     */
    WebElement divBox = driver.findElement(By.className("box_3"));
    WebElement pElement = divBox.findElement(By.tagName("p"));
    String textBlock = pElement.getText();
    Assert.assertEquals("Էլեկտրոնային մատյան", textBlock);

    /**
     * Scenario 2
     */
    WebElement inputField = driver.findElement(By.id("name"));
    inputField.sendKeys("Inesa");
    String inputValue = inputField.getAttribute("value");
    Assert.assertEquals("Inesa", inputValue);

    /**
     * Scenario 3
     */
    WebElement contactSection = driver.findElement(By.id("contact"));
    WebElement buttonWrapper = contactSection.findElement(By.className("text-lg-right"));
    WebElement button = buttonWrapper.findElement(By.tagName("button"));
    String buttonTitle = button.getAttribute("title");

    Assert.assertEquals("Ուղարկել", buttonTitle);


    driver.get("https://support.emis.am/");
    /**
     * Scenario 4
     */
    WebElement subMenu = driver.findElement(By.className("menu-top-menu-container"));
    WebElement navItem = subMenu.findElement(By.tagName("ul")).findElement(By.tagName("li"));
    navItem.click();
    String currentUrlAfterClick = driver.getCurrentUrl();

    Assert.assertEquals("https://support.emis.am/category/1", currentUrlAfterClick);

    /**
     * Scenario 5
     */
    WebElement search = driver.findElement(By.className("search-term"));
    WebElement searchButton = driver.findElement(By.className("search-btn"));

    search.sendKeys("Inesa");
    searchButton.click();
    String currentUrl = driver.getCurrentUrl();

    Assert.assertEquals("https://support.emis.am/search/?q=Inesa", currentUrl);
    driver.quit();
  }}

