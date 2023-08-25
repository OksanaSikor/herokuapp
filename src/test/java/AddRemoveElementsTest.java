import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

//1. Добавить 2 элемента;
//2. Удалить элемент;
//3. Проверить количество элементов.

public class AddRemoveElementsTest extends BaseTest {

    @Test
    public void verifyAddRemoveElements() {
        driver.get("http://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[@href='/add_remove_elements/']")).click();
        driver.findElement(By.xpath("//button[text()='Add Element']")).click();
        driver.findElement(By.xpath("//button[text()='Add Element']")).click();
        driver.findElement(By.xpath("//button[text()='Delete']")).click();
        int numberDeleteElements = driver.findElements(By.xpath("//button[text()='Delete']")).size();
        int elementsPage = 1;
        Assert.assertEquals(numberDeleteElements,elementsPage);
    }
}
