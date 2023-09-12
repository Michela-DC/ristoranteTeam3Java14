package Database;

import Core.Menu;
import Core.Portata;
import PortateEntity.Antipasto;

import java.sql.*;

public class PortataDao {

    public Integer insertPortataAndGetPortataId(Portata portata) throws SQLException {
        DatabaseDao dbDao = new DatabaseDao();
        Connection dbConnection = dbDao.getConnetion();

        String insertQueryMenu = "INSERT INTO portata (nome, prezzo, descrizione, calorie, idMenu) " +
                "VALUES ('" + portata.getName() + "', '" + portata.getPrice() + "', '" + portata.getDescription()+ "', '" + portata.getCalories() + "', '" + portata.getIdMenu() + "')";

        PreparedStatement ps = dbConnection.prepareStatement(insertQueryMenu, Statement.RETURN_GENERATED_KEYS);
        ps.execute();
        ResultSet rs = ps.getGeneratedKeys();

        int generatedKey = 0;

        if (rs.next()) {
            generatedKey = rs.getInt(1);
        }

        System.out.println("Inserted Portata record's ID: " + generatedKey);

        dbConnection.close();

        return generatedKey;
    }

    public void insertAntipasto(Antipasto antipasto) throws SQLException {
        DatabaseDao dbDao = new DatabaseDao();
        Connection dbConnection = dbDao.getConnetion();
        Statement statement = dbConnection.createStatement();

        int isProduzionePropria = antipasto.isProduzionePropria() ? 1 : 0;

        String insertQueryMenu = "INSERT INTO antipasto (is_produzione_propria, idPortata, idMenu) " +
                                 "VALUES ('" + isProduzionePropria + "', '" + antipasto.getIdPortata() + "', '" + antipasto.getIdMenu() + "')";

        statement.executeUpdate(insertQueryMenu);

        System.out.println("Inserito antipasto record's name: " + antipasto.getName());

        dbConnection.close();
    }
}
