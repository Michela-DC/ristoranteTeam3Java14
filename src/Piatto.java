import java.util.Map;
import java.util.TreeMap;

public class Piatto {
    int prezzo;
    String descrizione;

    public Piatto(int prezzo, String descrizione) {
        this.prezzo = prezzo;
        this.descrizione = descrizione;
    }

    public int getPrezzo(){
        return prezzo;
    }

    public String getDescrizione(){
        return descrizione;
    }

    public static void printMenu(Map<String, Piatto> piatti) {
        TreeMap<String, Piatto> piattiOrdinati = new TreeMap<>(piatti);

        int maxChiaveLength = 0;
        for (String chiave : piattiOrdinati.keySet()) {
            maxChiaveLength = Math.max(maxChiaveLength, chiave.length());
        }

        String formatString = "%-" + (maxChiaveLength + 5) + "s%s";

        for (Map.Entry<String, Piatto> entry : piattiOrdinati.entrySet()) {
            String nomeDelPiatto = entry.getKey();
            Piatto caratteristichePiatto = entry.getValue();
            System.out.printf("-"+ formatString, nomeDelPiatto.toUpperCase() + ":   ", caratteristichePiatto.getPrezzo() + "€");
            System.out.println("\n" + caratteristichePiatto.getDescrizione());
        }
    }
}
