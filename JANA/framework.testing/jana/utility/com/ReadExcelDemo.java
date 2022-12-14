package jana.utility.com;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

import jana.reposirty.com.LoginData;
import jana.reposirty.com.Property;


public class ReadExcelDemo implements LoginData{


	public static void main(String args[]){


		ReadExcelDemo rd = new ReadExcelDemo();

	//	rd.datainput(1, 3,0);
		//System.out.println(LoginData.loginidFAH1);

		//datainput(0, 0);
	}

    public String datainput (int row , int col, int sheet) {

//    	MLBD m = new MLBD();
//    	System.out.println(MLBD.Filen);

       try {
    	   //Create an object of File class to open xlsx file
           File file =    new File("D:\\All Projects\\JANA\\JANA AUTOMATION TESTDATA.xlsx");

           //Create an object of FileInputStream class to read excel file
           FileInputStream inputStream = new FileInputStream(file);

           XSSFWorkbook  wb = new XSSFWorkbook(inputStream);
           XSSFSheet sh = wb.getSheetAt(sheet);

           String data = sh.getRow(row).getCell(col).getStringCellValue();

           //System.out.println(data);

           return data;
	}

       catch (Exception e) {
		// TODO: handle exception
	}
	return null;

    }
    
    
    public String runMultiData (int sheet) {
    	
    	
    	try {
     	   //Create an object of File class to open xlsx file
            File file =    new File("D:\\All Projects\\JANA\\JANA AUTOMATION TESTDATA.xlsx");

            //Create an object of FileInputStream class to read excel file
            FileInputStream inputStream = new FileInputStream(file);

            XSSFWorkbook  wb = new XSSFWorkbook(inputStream);
            XSSFSheet sh = wb.getSheetAt(sheet);

          //get all rows in the sheet
            int rowCount=sh.getLastRowNum()-sh.getFirstRowNum();
            
          //iterate over all the row to print the data present in each cell.
            for(int i=1;i<=rowCount;i++){
                
                //get cell count in a row
                int cellcount=sh.getRow(i).getLastCellNum();
                
                //iterate over each cell to print its value
                System.out.println("Row"+ i+" data is :");
                
                for(int j=0;j<cellcount;j++){
                	
                	String data = sh.getRow(i).getCell(j).getStringCellValue();
                	
                    System.out.print(sh.getRow(i).getCell(j).getStringCellValue() +",");
                    
                    return data;
                }
               
                System.out.println();
            }
            
            
            //System.out.println(data);

            
 	}

        catch (Exception e) {
 		// TODO: handle exception
 	}
		return null;
    	
    
    }
    

    

    
    




}