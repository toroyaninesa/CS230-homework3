package homework3part2.Pages;

import homework3part2.Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static homework3part2.Helpers.LocatorConstants.*;

public class HeaderNavigation extends BasePage {

  @FindBy(className = SEARCH)
  public WebElement search;

  @FindBy(id = SEARCH_SUBMIT)
  public WebElement searchSubmit;

  @FindBy(css = CATEGORIES_BURGER_MENU)
  public WebElement categoriesBurgerMenu;

  @FindBy(css = BASKET)
  public WebElement basket;

  @FindBy(css = BASKET_TEXT)
  public WebElement basketText;

  public HeaderNavigation(WebDriver driver) {
    super(driver);
  }
}
