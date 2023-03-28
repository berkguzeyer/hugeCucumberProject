package ApachePOI;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _09_WriteInANewExcelFile {
    public static void main(String[] args) throws IOException {
        String path = "src/test/java/ApachePOI/Resources/WriteIntoANewExcelFile.xlsx";

        XSSFWorkbook workbook = new XSSFWorkbook(); // Created a new Excel file in the memory
        XSSFSheet sheet=workbook.createSheet("OurSheet"); // Created a new sheet in the Excel file

        Row row = sheet.createRow(0); // Created a row in the memory
        Cell cell = row.createCell(0); // Created a new cell in the row
        cell.setCellValue("Hello World");

        FileOutputStream outputStream = new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();


    }

}
