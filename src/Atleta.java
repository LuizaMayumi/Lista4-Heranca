public class Atleta extends Pessoa {
    protected String esporte;

    public Atleta(String esporte, String nome) {
        super(nome);
        this.esporte = esporte;

    }

    public String getEsporte() {
        return esporte;
    }
}
