package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Excelutility {

	@DataProvider(name = "getData", parallel = true)
	public static Object[][] getTestData() throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\SANAKH\\eclipse-workspace1\\docker\\book.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rownum = sheet.getLastRowNum();
		System.out.println(rownum);
		int cellnum = sheet.getRow(0).getLastCellNum();
		System.out.println();
		Object[][] data = new Object[rownum][cellnum];
		for (int i = 1; i <= rownum; i++) {
			for (int j = 0; j < cellnum; j++) {
				data[i - 1][j] = sheet.getRow(i).getCell(j).getStringCellValue();
			}
		}
		workbook.close();
		return data;
	}

	@DataProvider(name = "getTestData1", parallel = true)
	public static List<Map<String, String>> getTestData1() throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\SANAKH\\eclipse-workspace1\\docker\\testData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rownum = sheet.getLastRowNum();
		System.out.println(rownum);
		int cellnum = sheet.getRow(0).getLastCellNum();
		System.out.println(cellnum);
		// Object[] data = new Object[rownum];
		List<Map<String, String>> list = new ArrayList<>();
		Map<String, String> map;
		for (int i = 1; i <= rownum; i++) {
			map = new HashMap<>();
			for (int j = 0; j < cellnum; j++) {
				String key = sheet.getRow(0).getCell(j).getStringCellValue();
				String value = sheet.getRow(i).getCell(j).getStringCellValue();
				map.put(key, value);
				System.out.print(map);
				// data[i - 1] = map;
				list.add(map);
			}
		}
		workbook.close();
		return list;

	}
}
