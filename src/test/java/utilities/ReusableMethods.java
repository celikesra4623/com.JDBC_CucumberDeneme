package utilities;

import java.sql.*;

public class ReusableMethods {


    public static Connection connection;

    public static Statement statement;


    public static void main(String[] args) throws SQLException {
        //Connection
        Connection connection = DriverManager.getConnection(ConfigReader.getProperty("URL"),
                ConfigReader.getProperty("USERNAME"),
                ConfigReader.getProperty("PASSWORD"));

        //Statement + SQL QUERY

        Statement statement = connection.createStatement();

        String SQL = "";

        ResultSet resultSet = statement.executeQuery(SQL);


    }

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
}