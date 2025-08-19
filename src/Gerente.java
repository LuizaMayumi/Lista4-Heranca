public class Gerente extends Funcionario {
    protected String departamento;

    public Gerente(String departamento, String nome, double salario){
        super(nome, salario);
        this.departamento = departamento;
    }

    public String getDepartamento(){
        return departamento;
    }
}
