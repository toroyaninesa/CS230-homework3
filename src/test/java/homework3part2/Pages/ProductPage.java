package homework3part2.Pages;

import homework3part2.Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static homework3part2.Helpers.LocatorConstants.*;

public class ProductPage extends BasePage {
  public ProductPage(WebDriver driver) {
    super(driver);
  }
  @FindBy(css = PRODUCT)
  public WebElement product;
  @FindBy(className = PRODUCT_NAME)
  public WebElement productTitle;

  @FindBy(css = ADD_TO_CART)
  public WebElement addToCart;


}
