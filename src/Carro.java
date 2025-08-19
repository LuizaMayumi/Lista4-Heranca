public class Carro extends Veiculo{
    protected int numeroDePortas;
    
    public Carro(int numeroDePortas, String marca){
        super(marca);
        this.numeroDePortas = numeroDePortas;
    }

    public int getnumeroDePortas() {
        return numeroDePortas;
    }
}
