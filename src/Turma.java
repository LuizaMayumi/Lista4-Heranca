public class Turma extends Aluno {
    protected String nomeDaTurma;
    protected Aluno[] Alunos;
    private int contador;

    public Turma(String nomeDaTurma, int capacidade){
        super("");
        this.nomeDaTurma = nomeDaTurma;
        this.Alunos = new Aluno[capacidade];
    }

    public void adicionarAluno(Aluno aluno){
        for (int i = 0; i <= contador; i++) {
            Alunos[i] = aluno;
            contador += 1;
        }
    }

    public void listarAlunos(){
        for (int i = 0; i < Alunos.length; i++) {
            System.out.println(Alunos[i]);
        }

    }

}
