public class Bicicleta extends Veiculo{
    protected int numeroDeMarchas;

    public Bicicleta(int numeroDeMarchas, String marca){
        super(marca);
        this.numeroDeMarchas = numeroDeMarchas;
    }

    public int getNumeroDeMarchas() {
        return numeroDeMarchas;
    }
}
