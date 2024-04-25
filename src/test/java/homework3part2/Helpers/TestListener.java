package homework3part2.Helpers;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;


import java.io.File;

class TestListener implements ITestListener {

  WebDriver driver;

  @Override
  public void onTestFailure(ITestResult result) {
    System.out.println("Test Failed: " + result.getName());
    Object currentClass = result.getInstance();
    //driver = ((TestNGWithListeners) currentClass).driver;
    if (driver != null) {
      // Take screenshot on test failure
      takeScreenshot(driver, result.getName());
    }
  }

  private void takeScreenshot(WebDriver driver, String methodName) {
    try {
      File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
      String screenshotPath = "./screenshots/" + methodName + ".png";
      FileUtils.copyFile(screenshotFile, new File(screenshotPath));
      System.out.println("Screenshot captured: " + screenshotPath);
      Reporter.log("<br><img src='" + screenshotPath + "' height='300' width='400'/><br>");
    } catch (Exception e) {
      System.out.println("Failed to capture screenshot: " + e.getMessage());
    }
  }
}
