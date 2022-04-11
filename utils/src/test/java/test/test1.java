package test;

import org.testng.annotations.Test;


public class test1 {

	
	@Test
	public void readData() {
		excelUtility2 reader = new excelUtility2("F:\\selenium_files\\student_data.xlsx");
		int rowCount = reader.getRowCount("registration");
		System.out.println(rowCount);
		
		// to read all the data from excel
		for(int i = 1; i<= rowCount; i++) {
			String uname = reader.getCellData("registration", "name", i);
			System.out.println(uname);
			
			String pas = reader.getCellData("registration", "type", i);
			System.out.println(pas);
		}
		
	}
}
