package JDBC.day02;

import Utilities.JDBCConnection;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class _03_GetAllRowColumn extends JDBCConnection {

    @Test
    public void test1() throws SQLException {
        ResultSet rs = statement.executeQuery("select * from language");

        ResultSetMetaData rsmd = rs.getMetaData(); // stores the names, types and number of columns

        int columnCount = rsmd.getColumnCount(); //gives the number of columns
        System.out.println("Column count is: " + columnCount);

        for (int i = 1; i <= columnCount; i++) { // you iterate with <= otherwise it starts from 1 and has to go to the last column
            String columnName = rsmd.getColumnName(i); // gives column name each time 'i' goes through the loop
            String columnType = rsmd.getColumnTypeName(i); // gives column type
            System.out.println(columnName + " " + columnType);

        }

    }

    @Test
    public void test2() throws SQLException {


        /**
         * Print all rows on the language table as they are shown in a mysql result
         * */

        ResultSet rs = statement.executeQuery("select * from language");
        ResultSetMetaData rsmd = rs.getMetaData();

        int columnCount = rsmd.getColumnCount();

        for (int i = 1; i <= columnCount ; i++) {
            System.out.print(rsmd.getColumnName(i) + "\t\t");
        }
        System.out.println();

        while (rs.next()) { // you can do a `while` loop like this BECAUSE .next() method returns a BOOLEAN. // So it goes while rs.next is true
            for (int i = 1; i <= columnCount; i++) {
                System.out.print(rs.getString(i) + "\t\t\t\t"); // now are getting every value one by one with the for loop
            }
            System.out.println();
        }

    }
}
