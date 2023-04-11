package JDBC.day02;

import Utilities.JDBCConnection;
import org.testng.annotations.Test;

import java.sql.*;

public class _01_AbsoluteRelative extends JDBCConnection {


    @Test
    public void test1() throws SQLException {

        ResultSet rs = statement.executeQuery("select * from film");

        rs.absolute(10); // goes to the 10th row right away (no index concept here)
        String title = rs.getString("title");
        System.out.println("10th row" + title);

        rs.absolute(5);
        title = rs.getString("title");
        System.out.println("5th row: " + title);

        rs.relative(20); // moves 20 rows from the current position. in this test, it is going to be 25th row.
        title = rs.getString("title");
        System.out.println("Film on the 25th row: " + title);

        rs.relative(3);// moves 3 rows from the current position. in this test, it is going to be 28th row.
        title = rs.getString("title");
        System.out.println("Film on the 28th row: " + title);

        rs.relative(-10);// moves back 10 rows from the current position. in this test, it is going to be 18th row.
        title = rs.getString("title");
        System.out.println("Film on the 18th row: " + title);



        connection.close();

    }

}
