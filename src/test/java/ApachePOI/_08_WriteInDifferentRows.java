package ApachePOI;
import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _08_WriteInDifferentRows {
    public static void main(String[] args) throws IOException {
        String path = "src/test/java/ApachePOI/Resources/WriteIntoAnExcelFile.xlsx";
        FileInputStream inputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheetAt(0);

        int rowCount = sheet.getPhysicalNumberOfRows();

        Row row = sheet.createRow(rowCount);
        Cell cell = row.createCell(0);

        //NOT DONE YET
    }



}
