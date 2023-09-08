package Database;

import Core.Menu;
import Core.Portata;

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

    public Integer insertMenuAndGetMenuId(Menu menu) throws SQLException {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
        Statement statement = conn.createStatement();

        String insertQueryMenu = "INSERT INTO menu (titolo, descrizione) VALUES ('" + menu.getTitle() + "', '" + menu.getDescription() + "')";

        PreparedStatement ps = conn.prepareStatement(insertQueryMenu, Statement.RETURN_GENERATED_KEYS);

        ps.execute();

        ResultSet rs = ps.getGeneratedKeys();
        int generatedKey = 0;
        if (rs.next()) {
            generatedKey = rs.getInt(1);
        }

        System.out.println("Inserted record's ID: " + generatedKey);

        //statement.executeUpdate(insertQueryMenu);

        conn.close();

        return generatedKey;
    }

    public void insertPortata(Portata portata) throws SQLException {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
        Statement statement = conn.createStatement();

        String insertQueryMenu = "INSERT INTO portata (nome, prezzo, descrizione, calorie, idMenu) " +
                                 "VALUES ('" + portata.getName() + "', '" + portata.getPrice() + "', '" + portata.getDescription()+ "', '" + portata.getCalories() + "', '" + portata.getIdMenu() + "')";

        statement.executeUpdate(insertQueryMenu);

        conn.close();
    }
}
