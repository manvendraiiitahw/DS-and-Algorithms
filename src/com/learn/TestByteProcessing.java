//package com.learn;
//
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.util.Iterator;
//
//public class TestByteProcessing {
//    public static void main(String[] args) throws IOException {
//        FileInputStream file = new FileInputStream(new File("/Users/m0k00hw/Desktop/test_xls.xlsx"));
//        XSSFWorkbook wb = new XSSFWorkbook(file);
//        StringBuilder stringBuilder = new StringBuilder("");
//        Iterator<Sheet> sheetIterator = wb.iterator();
//        while (sheetIterator.hasNext()) {
//            for (Row row : sheetIterator.next()) {
//                Iterator<Cell> cellIterator = row.cellIterator();
//                while (cellIterator.hasNext()) {
//                    Cell cell = cellIterator.next();
//                    switch (cell.getCellTypeEnum()) {
//                        case STRING:     //field that represents string cell type
//                            stringBuilder.append(cell.getStringCellValue()).append(",");//each value will be concatenate by ,
//                            System.out.print(cell.getStringCellValue() + "\t\t\t");
//                            break;
//                        case NUMERIC:    //field that represents number cell type
//                            stringBuilder.append(cell.getNumericCellValue()).append(",");
//                            System.out.print(cell.getNumericCellValue() + "\t\t\t");
//                            break;
//                        case FORMULA:    //field that represents number cell type
//                            stringBuilder.append(((XSSFCell) cell).getRawValue()).append(",");
//                            System.out.print(((XSSFCell) cell).getRawValue() + "\t\t\t");
//                            break;
//                        default:
//                    }
//                }
//                System.out.println(); // for new line
//            }
//        }
//        System.out.println(stringBuilder.toString());
//    }
//}
