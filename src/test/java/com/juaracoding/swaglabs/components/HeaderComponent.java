package com.juaracoding.swaglabs.components;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HeaderComponent extends BaseComponent {

  private By buttonAddToChart;
  private By buttonRemoveChart;
  private By chartIcon = By.xpath("//span[@data-test='shopping-cart-badge']");

  public HeaderComponent(WebDriver driver) {
    super(driver);
  }

  public void setButtonAddToChart(String xpathExpression) {
    this.buttonAddToChart = By.xpath(xpathExpression);
  }

  public void setButtonRemoveChart(String xpathExpression) {
    this.buttonRemoveChart = By.xpath(xpathExpression);
  }

  public void clickButtonAddToChart() {
    WebElement element = waitingElementReady(buttonAddToChart);
    element.click();
  }

  public void clickButtonRemoveChart() {
    WebElement element = waitingElementReady(buttonRemoveChart);
    element.click();
  }

  public boolean isVisibleButtonAddToChart() {
    try {
      WebElement element = waitingElementForCheckingDisplay(buttonAddToChart);
      return element.isDisplayed();
    } catch (NoSuchElementException e) {
      return false;
    } catch (TimeoutException e) {
      return false;
    }
  }

  public boolean isVisibleButtonRemoveToChart() {
    try {
      WebElement element = waitingElementForCheckingDisplay(buttonRemoveChart);
      return element.isDisplayed();
    } catch (NoSuchElementException e) {
      return false;
    } catch (TimeoutException e) {
      return false;
    }
  }

  public boolean isVisibleChartIcon() {
    try {
      WebElement element = waitingElementForCheckingDisplay(chartIcon);
      return element.isDisplayed();
    } catch (NoSuchElementException e) {
      return false;
    } catch (TimeoutException e) {
      return false;
    }
  }

  public String getTextButtonAddToChart() {
    WebElement element = waitingElementReady(buttonAddToChart);
    return element.getText();
  }

  public String getTextButtonRemoveChart() {
    WebElement element = waitingElementReady(buttonAddToChart);
    return element.getText();
  }

  public int getTotalChart() {
    WebElement element = waitingElementReady(chartIcon);
    return Integer.parseInt(element.getText());
  }
}
