import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class NewClass
{
 public static void main(String[]args){
     InvokeBrowser myBrowser=new InvokeBrowser();
     WebDriver driver=myBrowser.invokeBrowser();
     driver.get("http://demo.guru99.com/test/drag_drop.html");
     WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));
     WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));
     Actions act=new Actions(driver);
     act.dragAndDrop(From,To).build().perform();
 }
}
