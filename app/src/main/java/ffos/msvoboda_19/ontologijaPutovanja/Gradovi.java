package ffos.msvoboda_19.ontologijaPutovanja;

public class Gradovi {

    private int sifra;
    private String nazivDrzave;
    private String nazivGrada;
    private String godina;
    private String biljeska;

    public Gradovi(int sifra, String nazivDrzave, String nazivGrada, String godina, String biljeska) {
        this.sifra = sifra;
        this.nazivDrzave = nazivDrzave;
        this.nazivGrada = nazivGrada;
        this.godina = godina;
        this.biljeska = biljeska;
    }

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

    public String getNazivDrzave() {
        return nazivDrzave;
    }

    public void setNazivDrzave(String nazivDrzave) {
        this.nazivDrzave = nazivDrzave;
    }

    public String getNazivGrada() {
        return nazivGrada;
    }

    public void setNazivGrada(String nazivGrada) {
        this.nazivGrada = nazivGrada;
    }

    public String getGodina() {
        return godina;
    }

    public void setGodina(String godina) {
        this.godina = godina;
    }

    public String getBiljeska() {
        return biljeska;
    }

    public void setBiljeska(String biljeska) {
        this.biljeska = biljeska;
    }
}

