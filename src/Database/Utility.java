package Database;

import Core.Menu;
import Core.Portata;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Utility {

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

    public void insertMenu(Menu menu) throws SQLException {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
        Statement statement = conn.createStatement();

        String insertQueryMenu = "INSERT INTO menu (titolo, descrizione) VALUES ('" + menu.getTitle() + "', '" + menu.getDescription() + "')";

        statement.executeUpdate(insertQueryMenu);

        conn.close();
    }

    public void insertPortata(Portata portata) throws SQLException {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
        Statement statement = conn.createStatement();

        String insertQueryMenu = "INSERT INTO portata (nome, prezzo, descrizione, calorie) " +
                                 "VALUES ('" + portata.getName() + "', '" + portata.getPrice() + "', '" + portata.getDescription()+ "', '" + portata.getCalories() + "')";

        statement.executeUpdate(insertQueryMenu);

        conn.close();
    }
}
