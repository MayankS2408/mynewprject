package Excel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

public class ReadExcel {

	@Test
	public void readexcel() throws Exception {
		String excelpath = "C:\\Users\\hp\\eclipse-workspace\\AutomationExercise\\TestData\\Exceldata.xlsx";
		String filename = "Exceldata";
		String sheetname = "Sheet1";

		File file = new File(excelpath);
		FileInputStream fis = new FileInputStream(file);

		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet(sheetname);

		int rowcount = sheet.getLastRowNum();
		System.out.println(rowcount);

		String data = sheet.getRow(1).getCell(0).getStringCellValue();
		System.out.println(data);
	}
}
