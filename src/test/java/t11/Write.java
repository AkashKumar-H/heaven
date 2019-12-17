package t11;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

 
public class Write {
FileInputStream FRead;
FileOutputStream FWrite;
XSSFWorkbook wb;
XSSFSheet sh;

 
@Test
 public void f() throws Exception{
FRead=new FileInputStream("\"C:\\HK\\javastreamtraining\\Day7TestJunit\\src\\pack1\\testdata.xls\"");
wb=new XSSFWorkbook(FRead);
sh=wb.getSheetAt(0);
Row row=sh.createRow(1);
Cell cell=row.createCell(1);
cell.setCellValue("ram");
FWrite=new FileOutputStream("");
wb.write(FWrite);
}
}
