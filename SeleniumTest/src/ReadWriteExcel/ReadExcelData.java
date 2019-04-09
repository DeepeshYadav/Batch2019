package ReadWriteExcel;

public class ReadExcelData {
	
		   public static void main(String[] args) throws Exception {
			   
			  ReadDataFromExcel  dd = new ReadDataFromExcel ("C:\\selenium\\inputdata.xlsx","Sheet1");
		     
		      System.out.print(dd.getCellData(0, 0)+" : "+ dd.getCellData(0, 1)+ "\n");
		      System.out.print(dd.getCellData(1, 0)+" : "+ dd.getCellData(1, 1)+ "\n");
		      System.out.print(dd.getCellData(2, 0)+" : "+ dd.getCellData(2, 1)+ "\n");
		      
		     
		   }

		
}
