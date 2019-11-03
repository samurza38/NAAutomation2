import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelRead {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Abi Auto\\Downloads\\Try.xls");
        FileInputStream fs = new FileInputStream(file);
        Workbook wb = new HSSFWorkbook(fs);
        Sheet sh = wb.getSheet("Sheet1");
        int rowCount = sh.getLastRowNum();
        Row rw;
        Cell cell;
        for (int i = 0; i < rowCount; i++) {
            rw=sh.getRow(i);
            cell=rw.getCell(0);

            //Row  rw=sh.getRow(1);
            //Cell celll=rw.getCell(1);
            System.out.println(cell.getStringCellValue());
        }
    }
}
