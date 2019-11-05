import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.*;

public class DataTest {
    public static void main(String[]args) throws IOException, InterruptedException {
        File file=new File("C:\\Users\\Abi Auto\\Downloads\\Try2.xls");
        FileInputStream fs=new FileInputStream(file);
        Workbook wb=new HSSFWorkbook(fs);
        Sheet sh=wb.getSheet("DataSet");
        InvokeBrowser browser=new InvokeBrowser();
        WebDriver driver=browser.invokeBrowser();
        driver.get("http://www.facebook.com");

        int totalRows=sh.getLastRowNum();
        for (int i=1;i<totalRows+1;i++){

            Row rw=sh.getRow(i);
            Cell userName=rw.getCell(0);
            Cell pwd=rw.getCell(1);

            driver.findElement(By.id("email")).clear();
            Thread.sleep(2000);
            driver.findElement(By.id("email")).sendKeys(userName.getStringCellValue());
            Thread.sleep(2000);
            driver.findElement(By.id("pass")).clear();
            Thread.sleep(2000);
            driver.findElement(By.id("pass")).sendKeys(pwd.getStringCellValue());

            Cell passed=rw.createCell(2);
            passed.setCellValue("passed");
            fs.close();
            FileOutputStream fos=new FileOutputStream(file);
            wb.write(fos);
            fos.close();


        }


    }
}
