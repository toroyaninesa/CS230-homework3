package homework3part2;

import homework3part2.Base.BaseTest;
import org.junit.Assert;
import org.junit.Test;

import static homework3part2.Helpers.AssertionMessages.WRONG_REDIRECT_URL;

public class HeaderNavigationTests extends BaseTest {
  @Test
  public void checkRedirectOnSearch() {
    header.search.sendKeys("wrongdata");
    header.searchSubmit.click();
    String currentUrl = header.getCurrentUrl();

    Assert.assertEquals(WRONG_REDIRECT_URL,"https://domus.am/?s=wrongdata", currentUrl);
  }
}

