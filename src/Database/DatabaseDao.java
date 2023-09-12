package Database;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class DatabaseDao {
    private static final Properties properties = new Properties();

    static {
        try (FileInputStream fileInputStream = new FileInputStream(".config.properties")) {
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static final String DB_URL = properties.getProperty("db_url");
    private static final String USER = properties.getProperty("db_user");
    private static final String PASSWORD = properties.getProperty("db_password");


    public Connection getConnetion() throws SQLException {
        return DriverManager.getConnection(DB_URL, USER, PASSWORD);
    }
}
