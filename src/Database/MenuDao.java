package Database;

import Core.Menu;
import java.sql.*;

public class MenuDao {

    public Integer insertMenuAndGetMenuId(Menu menu) throws SQLException {

        DatabaseDao dbDao = new DatabaseDao();
        Connection dbConnection = dbDao.getConnetion();

        String insertQueryMenu = "INSERT INTO menu (titolo, descrizione) VALUES ('" + menu.getTitle() + "', '" + menu.getDescription() + "')";

        PreparedStatement ps = dbConnection.prepareStatement(insertQueryMenu, Statement.RETURN_GENERATED_KEYS);
        ps.execute();
        ResultSet rs = ps.getGeneratedKeys();

        int generatedKey = 0;

        if (rs.next()) {
            generatedKey = rs.getInt(1);
        }

        System.out.println("Inserted Menu record's ID: " + generatedKey);

        dbConnection.close();

        return generatedKey;
    }
}

