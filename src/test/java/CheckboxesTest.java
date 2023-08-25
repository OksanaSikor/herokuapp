import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

//1. Проверить, что первый чекбокс unchecked
//2. Отметить первый чекбокс, проверить, он checked
//3. Проверить, что второй чекбокс checked
//4. Сделать второй чекбокс unchecked и проверить что он unchecked

public class CheckboxesTest extends BaseTest{

    @Test
    public void verifyFirstCheckboxIsUncheckedByDefault() {
        driver.get("http://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[@href='/checkboxes']")).click();
        int index = 0;
        WebElement checkbox1 = (driver.findElements(By.cssSelector("[type=checkbox]"))).get(index);
        Assert.assertFalse(checkbox1.isSelected());
    }

    @Test
    public void verifyFirstCheckboxCanBeChecked() {
        driver.get("http://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[@href='/checkboxes']")).click();
        int index = 0;
        WebElement checkbox1 = (driver.findElements(By.cssSelector("[type=checkbox]"))).get(index);
        checkbox1.click();
        Assert.assertTrue(checkbox1.isSelected());
    }

    @Test
    public void verifySecondCheckboxIsChecked() {
        driver.get("http://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[@href='/checkboxes']")).click();
        int index = 1;
        WebElement checkbox2 = (driver.findElements(By.cssSelector("[type=checkbox]"))).get(index);
        Assert.assertTrue(checkbox2.isSelected());
    }

    @Test
    public void verifySecondCheckboxCanBeUnchecked() {
        driver.get("http://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[@href='/checkboxes']")).click();
        int index = 1;
        WebElement checkbox2 = (driver.findElements(By.cssSelector("[type=checkbox]"))).get(index);
        checkbox2.click();
        Assert.assertFalse(checkbox2.isSelected());
    }
}
