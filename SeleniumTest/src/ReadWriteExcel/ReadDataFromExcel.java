package ReadWriteExcel;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {
 
        		public static XSSFSheet ExcelWSheet;
        		public static XSSFWorkbook ExcelWBook;
        		public static XSSFCell Cell;
        		public static XSSFRow Row;
    		//This method is to set the File path and to open the Excel file, Pass Excel Path and Sheetname as Arguments to this metho
    		public ReadDataFromExcel(String Path,String SheetName) throws Exception {
 
       			try {
           			// Open the Excel file
					FileInputStream ExcelFile = new FileInputStream(Path);
					// Access the required test data sheet
					ExcelWBook = new XSSFWorkbook(ExcelFile);
					ExcelWSheet = ExcelWBook.getSheet(SheetName);		
					} catch (Exception e){
						throw (e);
					}
			   }
    		//This method is to read the test data from the Excel cell, in this we are passing parameters as Row num and Col num
    	    public String getCellData(int RowNum, int ColNum) throws Exception{
 
       			try{
          			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
          			String CellData = Cell.getStringCellValue();          			
          			//System.out.println("CellData :"+CellData);
          			return CellData;
 
          			}catch (Exception e){
 
						return " " ;
 
          			}
 
		    }
    }