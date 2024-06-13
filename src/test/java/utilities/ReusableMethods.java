package utilities;

import java.sql.*;

public class ReusableMethods {


    public static Connection connection;

    public static Statement statement;

    public static ResultSet resultSet;


    public static Connection getConnection() {
        try {
            connection = DriverManager.getConnection(ConfigReader.getProperty("URL"),
                    ConfigReader.getProperty("USERNAME"),
                    ConfigReader.getProperty("PASSWORD"));
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }

    public static Statement getStatement() {
        try {
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return (statement);
    }

    public static ResultSet getResultSet(String query) {

        try {
            resultSet = statement.executeQuery(query);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return (resultSet);
    }

}