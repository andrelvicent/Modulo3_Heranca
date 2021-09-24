package br.com.zup.Exemplo7;

public class Professores extends Funcionario{
    private String disciplina;

    public Professores(String nome, String senioridade, double salario, String disciplina) {
        super(nome, senioridade, salario);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
