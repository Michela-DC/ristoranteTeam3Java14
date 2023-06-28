import java.util.Map;
import java.util.TreeMap;

public class MenuItem {
    double prezzo;
    String descrizione;

    public MenuItem(double prezzo, String descrizione) {
        this.prezzo = prezzo;
        this.descrizione = descrizione;
    }

    public double getPrezzo(){
        return prezzo;
    }

    public String getDescrizione(){
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public static void printMenu(Map<String, MenuItem> piatti) {
        TreeMap<String, MenuItem> piattiOrdinati = new TreeMap<>(piatti);

        int maxChiaveLength = 0;
        for (String chiave : piattiOrdinati.keySet()) {
            maxChiaveLength = Math.max(maxChiaveLength, chiave.length());
        }

        String formatString = "%-" + (maxChiaveLength + 5) + "s%s";

        for (Map.Entry<String, MenuItem> entry : piattiOrdinati.entrySet()) {
            String nomeDelPiatto = entry.getKey();
            MenuItem caratteristichePiatto = entry.getValue();
            System.out.printf("-"+ formatString, nomeDelPiatto.toUpperCase() + ":   ", caratteristichePiatto.getPrezzo() + "€");
            System.out.println("\n " + caratteristichePiatto.getDescrizione());
        }
    }
}
