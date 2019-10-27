import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionDragAndDrop {
    public static void main(String[] args) {
        InvokeBrowser myBrowseer = new InvokeBrowser();
        WebDriver driver = myBrowseer.invokeBrowser();
        driver.get("http://demo.guru99.com/test/drag_drop.html");
        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[@id='credit2']")));
        WebElement source=driver.findElement(By.xpath("//li[@id='credit2']"));
        WebElement target=driver.findElement(By.cssSelector("ol#bank>li"));
        Actions myActions =new Actions(driver);
        myActions.dragAndDrop(source,target).build().perform();
    }
}