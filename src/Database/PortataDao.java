package Database;

import Core.Portata;
import PortateEntity.*;

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

        Integer isProduzionePropria = antipasto.isProduzionePropria() ? 1 : 0;

        String insertQueryMenu = "INSERT INTO antipasto (is_produzione_propria, idPortata, idMenu) " +
                                 "VALUES ('" + isProduzionePropria + "', '" + antipasto.getIdPortata() + "', '" + antipasto.getIdMenu() + "')";

        statement.executeUpdate(insertQueryMenu);

        System.out.println("Inserito antipasto record's name: " + antipasto.getName());

        dbConnection.close();
    }

 public void insertSecondo(SecondoPiatto secondoPiatto) throws SQLException {
        DatabaseDao dbDao = new DatabaseDao();
        Connection dbConnection = dbDao.getConnetion();
        Statement statement = dbConnection.createStatement();

        String origineDellaCarne = secondoPiatto.getOrigineDellaCarne();

        String insertQueryMenu = "INSERT INTO secondo (origine_della_carne, idPortata, idMenu) " +
                "VALUES (' " + origineDellaCarne + " ', '" + secondoPiatto.getIdPortata() + "', '" + secondoPiatto.getIdMenu() + "')";

     statement.executeUpdate(insertQueryMenu);

     System.out.println("Inserito secondo record's name: " + secondoPiatto.getName());

     dbConnection.close();


    }



    public void insertBevanda(Bevanda bevanda) throws SQLException {
        DatabaseDao dbDao = new DatabaseDao();
        Connection dbConnection = dbDao.getConnetion();
        Statement statement = dbConnection.createStatement();

        Double tassoAlcolico = bevanda.getTassoAlcolico();

        String insertQueryMenu = "INSERT INTO bevanda (tasso_alcolico, idPortata, idMenu) " +
                "VALUES (' " + tassoAlcolico + " ', '" + bevanda.getIdPortata() + "', '" + bevanda.getIdMenu() + "')";

        statement.executeUpdate(insertQueryMenu);

        System.out.println("Inserito bevanda record's name: " + bevanda.getName());

        dbConnection.close();


    }


    public void insertContorno(Contorno contorno) throws SQLException {
        DatabaseDao dbDao = new DatabaseDao();
        Connection dbConnection = dbDao.getConnetion();
        Statement statement = dbConnection.createStatement();

        Boolean OlioAlPeperoncino = contorno.getOlioAlPeperoncino();
        String note = contorno.getNote();

        String insertQueryMenu = "INSERT INTO contorno (olio_al_peperoncino, note,idPortata, idMenu) " +
                "VALUES (' " + OlioAlPeperoncino + " ',' " + note + " ', '" + contorno.getIdPortata() + "', '" + contorno.getIdMenu() + "')";

        statement.executeUpdate(insertQueryMenu);

        System.out.println("Inserito contorno record's name: " + contorno.getName());

        dbConnection.close();


    }

    public void insertDessert(Dessert dessert) throws SQLException {
        DatabaseDao dbDao = new DatabaseDao();
        Connection dbConnection = dbDao.getConnetion();
        Statement statement = dbConnection.createStatement();

        String semifreddo = dessert.getNomePasticceria();
        Double percentualeZuccheri = dessert.getPercentualeZuccheri();


        String insertQueryMenu = "INSERT INTO contorno (semifreddo,percentuale_zuccheri,idPortata, idMenu) " +
                "VALUES (' " + semifreddo + " ',' " + percentualeZuccheri + " ', '" + dessert.getIdPortata() + "', '" + dessert.getIdMenu() + "')";

        statement.executeUpdate(insertQueryMenu);

        System.out.println("Inserito contorno record's name: " + dessert.getName());

        dbConnection.close();


    }





}
