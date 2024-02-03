package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excellibrary {

	XSSFWorkbook wb;
	XSSFSheet sheet;

	public Excellibrary() throws IOException {
		String excelpath = "C:\\Users\\hp\\eclipse-workspace\\AutomationExercise\\TestData\\Exceldata.xlsx";

		File file = new File(excelpath);
		FileInputStream fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);

	}

	public String readdata(String sheetname, int row, int cell) {
		sheet = wb.getSheet(sheetname);
		String data = sheet.getRow(row).getCell(cell).getStringCellValue();
		return data;

	}

	public int readnumericdata(String sheetname, int row, int cell) {
		sheet = wb.getSheet(sheetname);
		int data = (int) sheet.getRow(row).getCell(cell).getNumericCellValue();
		return data;

	}
}
