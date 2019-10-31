import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelRead
{
   public static void main(String[]args) throws IOException {
       File file=new File("C:\\Users\\Abi Auto\\Downloads\\Try.xls");
       FileInputStream fs=new FileInputStream(file);
       Workbook wb=new HSSFWorkbook(fs);
       Sheet sh=wb.getSheet("Sheet1");
       Row  rw=sh.getRow(0);
       Cell celll=rw.getCell(0);
       System.out.println(celll.getStringCellValue());
   }
}

