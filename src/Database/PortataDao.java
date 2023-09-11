package Database;

import Core.Portata;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class PortataDao {

    public void insertPortata(Portata portata) throws SQLException {
        DatabaseDao dbDao = new DatabaseDao();
        Connection dbConnection = dbDao.getConnetion();

        Statement statement = dbConnection.createStatement();

        String insertQueryMenu = "INSERT INTO portata (nome, prezzo, descrizione, calorie, idMenu) " +
                                 "VALUES ('" + portata.getName() + "', '" + portata.getPrice() + "', '" + portata.getDescription()+ "', '" + portata.getCalories() + "', '" + portata.getIdMenu() + "')";

        statement.executeUpdate(insertQueryMenu);

        dbConnection.close();
    }

}
