public class Bevanda {
    String nome;
    double prezzo;
    String descrizione;

    public Bevanda(String nome, double prezzo, String descrizione) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.descrizione = descrizione;
    }

    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
}
