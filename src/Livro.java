public class Livro extends Produto {
    protected String autor;

    public Livro(String autor, String nome, double preco) {
        super(nome, preco);
        this.autor = autor;
    }

    public void exibirDetalhes(){
        System.out.println("Nome do livro: " + getNome() + "\nPreco: " + getPreco() + "\nAutor: " + autor);
    }
}
