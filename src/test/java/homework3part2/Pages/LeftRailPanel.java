package homework3part2.Pages;

import homework3part2.Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static homework3part2.Helpers.LocatorConstants.*;

public class LeftRailPanel extends BasePage {
  public LeftRailPanel(WebDriver driver) {
    super(driver);
  }

  @FindBy(css = MENU_ITEM)
  public WebElement categoryItem;

  @FindBy(css = MENU_SUB_ITEM)
  public WebElement menuSubItem;
}
