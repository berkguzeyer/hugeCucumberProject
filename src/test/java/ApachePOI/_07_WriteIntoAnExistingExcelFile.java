package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _07_WriteIntoAnExistingExcelFile {
    public static void main(String[] args) throws IOException {
        String path = "src/test/java/ApachePOI/Resources/WriteIntoAnExcelFile.xlsx";
        FileInputStream inputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheetAt(0);

        //** EVERYTHING HERE IS IN THE MEMORY, NOT IN THE FILE! **\\
        Row row = sheet.createRow(0); // created a new row in the memory
        Cell cell = row.createCell(0); // created a new cell in the memory
        cell.setCellValue("Hello World"); // put the value in the cell - STILL in the memory

        for (int i = 1; i < 10; i++) {
            row.createCell(i).setCellValue(i);
        }

        // We are done with the memory - we'll close
        inputStream.close();

        // Now we will need the writing/editing mode turned on with following
        FileOutputStream outputStream = new FileOutputStream(path);
        workbook.write(outputStream); // workbook has now been saved to the Excel file
        workbook.close(); // the memory that's been reserved for the workbook has now been cleared
        outputStream.close(); // writing/editing mode on the Excel file has been closed


    }
}
