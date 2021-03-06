// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class CalcDolarTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void calcDolar() {
    driver.get("https://www.mercadolivre.com.br//");
    driver.manage().window().setSize(new Dimension(1936, 1048));
    driver.findElement(By.id("valor")).click();
    driver.findElement(By.id("valor")).sendKeys("100");
    driver.findElement(By.cssSelector(".uk-button")).click();
    driver.findElement(By.id("de")).click();
    {
      WebElement dropdown = driver.findElement(By.id("de"));
      dropdown.findElement(By.xpath("//option[. = 'De Real']")).click();
    }
    driver.findElement(By.id("para")).click();
    {
      WebElement dropdown = driver.findElement(By.id("para"));
      dropdown.findElement(By.xpath("//option[. = 'Para Dólar Americano']")).click();
    }
    driver.findElement(By.cssSelector(".uk-button")).click();
    driver.findElement(By.id("valor")).click();
    driver.findElement(By.id("valor")).click();
    driver.findElement(By.id("valor")).click();
    driver.findElement(By.id("valor")).click();
    {
      WebElement element = driver.findElement(By.id("valor"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    driver.findElement(By.id("valor")).sendKeys("250");
    driver.findElement(By.cssSelector(".uk-button")).click();
    driver.findElement(By.id("de")).click();
    {
      WebElement dropdown = driver.findElement(By.id("de"));
      dropdown.findElement(By.xpath("//option[. = 'De Dólar Americano']")).click();
    }
    driver.findElement(By.id("para")).click();
    {
      WebElement dropdown = driver.findElement(By.id("para"));
      dropdown.findElement(By.xpath("//option[. = 'Para Real']")).click();
    }
    driver.findElement(By.cssSelector(".uk-button")).click();
  }
}
