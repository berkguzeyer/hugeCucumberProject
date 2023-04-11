package JDBC.day02;

import Utilities.JDBCConnection;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _02_FirstAndLastRowGetRowGetType extends JDBCConnection {


    @Test
    public void test1() throws SQLException {
        ResultSet rs = statement.executeQuery("select city_id, city, country_id from city");

        rs.last();
        String cityName = rs.getString("city");
        System.out.println("City on the last row: " + cityName);

        // if a column contains pure numbers, you can get them either as a String or as an integer
        int idInt = rs.getInt("city_id");
        System.out.println("id int: " + idInt);

        String idStr = rs.getString("city_id");
        System.out.println("id String: " + idStr);

        rs.getRow(); // Returns the current row number - basically where ever you are
        System.out.println("I am currently at row#" + rs.getRow());
        // You can find how many rows your query returns by using last and getRow one after another (e.g. get the last first and getRow)

        rs.first(); // goes to the first row

    }

}
