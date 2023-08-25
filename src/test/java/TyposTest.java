import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

//Проверить соответствие параграфа орфографии

public class TyposTest extends BaseTest{

    @Test
    public void verifyTyposInParagrath() {
        driver.get("http://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[@href='/typos']")).click();
        List<WebElement> paragrath = driver.findElements(By.tagName("p"));
        String stringToCheck = paragrath.get(1).getText();
        Assert.assertTrue(stringToCheck.contains("won't"));
    }
}
