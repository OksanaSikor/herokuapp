import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

//Проверить на возможность ввести различные цифровые и нецифровые значения, используя Keys.ARROW_UP  И Keys.ARROW_DOWN

public class InputsTest extends BaseTest{

    @Test
    public void verifyValuesCanBeSelectedByArrowUP() {
        driver.get("http://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[@href='/inputs']")).click();
        WebElement input = driver.findElement(By.tagName("input"));
        input.sendKeys(Keys.ARROW_UP);
        String displayedValue = input.getAttribute("value");
        Assert.assertEquals(displayedValue, "1");
    }

    @Test
    public void verifyValuesCanBeSelectedByArrowDown() {
        driver.get("http://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[@href='/inputs']")).click();
        WebElement input = driver.findElement(By.tagName("input"));
        input.sendKeys(Keys.ARROW_DOWN);
        input.sendKeys(Keys.ARROW_DOWN);
        String displayedValue = input.getAttribute("value");
        Assert.assertEquals(displayedValue, "-2");
    }

    @Test
    public void verifyLettersCanBeEnteredFromKeyboard() {
        driver.get("http://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[@href='/inputs']")).click();
        WebElement input = driver.findElement(By.tagName("input"));
        input.sendKeys("A");
        String displayedValue = input.getAttribute("value");
        Assert.assertEquals(displayedValue, "");
    }

    @Test
    public void verifyDigitsCanBeEnteredFromKeyboard() {
        driver.get("http://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[@href='/inputs']")).click();
        WebElement input = driver.findElement(By.tagName("input"));
        input.sendKeys("10");
        String displayedValue = input.getAttribute("value");
        Assert.assertEquals(displayedValue, "10");
    }
}
