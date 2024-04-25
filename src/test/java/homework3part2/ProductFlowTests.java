package homework3part2;

import homework3part2.Base.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import static homework3part2.Helpers.AssertionMessages.WRONG_REDIRECT_URL;
import static homework3part2.Helpers.AssertionMessages.WRONG_TITLE;

public class ProductFlowTests extends BaseTest {
  @Test
  public void checkCategoryBurgerMenu() {
    header.categoriesBurgerMenu.click();
    leftRailPanel.categoryItem.click();
    leftRailPanel.menuSubItem.click();
    String currentUrl = header.getCurrentUrl();

    Assert.assertEquals(WRONG_REDIRECT_URL,"https://domus.am/category/000001003/000001004", currentUrl);
  }

  @Test
  public void checkProduct() {
    header.categoriesBurgerMenu.click();
    leftRailPanel.categoryItem.click();
    leftRailPanel.menuSubItem.click();
    productPage.product.click();
    String currentUrl = header.getCurrentUrl();
    Assert.assertEquals(WRONG_REDIRECT_URL, "https://domus.am/product/112500005-%d5%ab%d5%b6%d5%a4%d5%b8%d6%82%d5%af%d6%81%d5%ab%d5%b8%d5%b6-%d5%a5%d6%83%d5%b4%d5%a1%d5%b6-%d5%ba%d5%a1%d5%b6%d5%a5%d5%ac-izf-68600-msp-%d5%bd%d6%87", currentUrl);

    Assert.assertEquals(
      "Teka 112500005 Ինդուկցիոն եփման պանել IZF 68600 MSP սև",
      productPage.productTitle.getText());
  }

  @Test
  public void checkAddToCartOption() {
    header.categoriesBurgerMenu.click();
    leftRailPanel.categoryItem.click();
    leftRailPanel.menuSubItem.click();
    productPage.product.click();
    Assert.assertEquals(
      "Ավելացնել զամբյուղում",
      productPage.addToCart.getText());
  }

  @Test
  public void checkCart() {
    header.categoriesBurgerMenu.click();
    leftRailPanel.categoryItem.click();
    leftRailPanel.menuSubItem.click();
    productPage.product.click();
    header.basket.click();
    Assert.assertEquals(WRONG_TITLE, "Իմ զամբյուղը", header.basketText.findElement(By.tagName("span")).getText());
  }
}
