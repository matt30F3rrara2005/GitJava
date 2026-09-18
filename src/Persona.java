public class Persona {

    private String nome;
    private String cognome;
    private int codiceFiscale;
    private int dataNascita;

    public Persona() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(int codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public int getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(int dataNascita) {
        this.dataNascita = dataNascita;
    }
}
