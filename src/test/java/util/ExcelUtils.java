package util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//import stepDef.CBOLSignOn;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import util.ConfigFileReader;


public class ExcelUtils {
    //Main Directory of the project
    public static final String currentDir = System.getProperty("user.dir");
	final static Log log = LogFactory.getLog(ExcelUtils.class.getName());
    
    public static ConfigFileReader configFileReader;

    //Location of Test data excel file
    public static String testDataExcelPath = null;

    //Excel WorkBook
    private static XSSFWorkbook excelWBook;

    //Excel Sheet
    private static XSSFSheet excelWSheet;

    //Excel cell
    private static XSSFCell cell;

    //Excel row
    private static XSSFRow row;

    //Row Number
    public static int rowNumber;

    //Column Number
    public static int columnNumber;

    public static String testDataExcelFileName = "";
    
    public static String testDateExcelsheetName = ""; 
    
    //Setter and Getters of row and columns
    public static void setRowNumber(int pRowNumber) {
        rowNumber = pRowNumber;
    }

    public static int getRowNumber() {
        return rowNumber;
    }

    public static void setColumnNumber(int pColumnNumber) {
        columnNumber = pColumnNumber;
    }

    public static int getColumnNumber() {
        return columnNumber;
    }

    // This method has two parameters: "Test data excel file name" and "Excel sheet name"
    // It creates FileInputStream and set excel file and excel sheet to excelWBook and excelWSheet variables.
    public static void setExcelFileSheet(String sheetName) {
    	
    	configFileReader = new ConfigFileReader();
    
    	
        //MAC or Windows Selection for excel path
    	testDataExcelFileName = "";
    	testDataExcelFileName = configFileReader.getExcelName();
    	
    	testDateExcelsheetName = "Demo";
    	
    	
    	testDataExcelPath = currentDir + configFileReader.getExcelPath();

    	// Open the Excel file
    	log.info(testDataExcelPath + testDataExcelFileName);
    	
        FileInputStream ExcelFile = null;
		try {
			ExcelFile = new FileInputStream(testDataExcelPath + testDataExcelFileName);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        try {
			excelWBook = new XSSFWorkbook(ExcelFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        excelWSheet = excelWBook.getSheet(sheetName);
        
     
    }

    //This method reads the test data from the Excel cell.
    //We are passing row number and column number as parameters.
    public static String getCellData(int RowNum, int ColNum) {
    	log.info(RowNum + " - "+ ColNum);
        cell = excelWSheet.getRow(RowNum).getCell(ColNum);
        DataFormatter formatter = new DataFormatter();
        String cellData = formatter.formatCellValue(cell);
        return cellData;
  
    }

    //This method takes row number as a parameter and returns the data of given row number.
    public static XSSFRow getRowData(int RowNum) throws Exception {
    	log.info("Iteration is " + RowNum);
    	   try {
               row = excelWSheet.getRow(RowNum);
               return row;
           } catch (Exception e) {
               throw (e);
           }
    	   
        
        
    }

    //This method gets excel file, row and column number and set a value to the that cell.
    public static void setCellData(String value, int RowNum, int ColNum) {
        row = excelWSheet.getRow(RowNum);
        cell = row.getCell(ColNum);
        if (cell == null) {
            cell = row.createCell(ColNum);
            cell.setCellValue(value);
        } else {
            cell.setCellValue(value);
        }
        // Constant variables Test Data path and Test Data file name
        FileOutputStream fileOut = null;
		try {
			fileOut = new FileOutputStream(testDataExcelPath + testDataExcelFileName);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
			excelWBook.write(fileOut);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
			fileOut.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
			fileOut.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }
}

