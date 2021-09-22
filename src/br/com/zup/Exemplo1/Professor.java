package br.com.zup.Exemplo1;

public class Professor extends Funcionario{
    private String cienciaDeEstudo;
    private String disciplina;

    public Professor(String nome, String cpf, double salario, String ctps, String cienciaDeEstudo, String disciplina) {
        super(nome, cpf, salario, ctps);
        this.cienciaDeEstudo = cienciaDeEstudo;
        this.disciplina = disciplina;
    }

    public String getCienciaDeEstudo() {
        return cienciaDeEstudo;
    }

    public void setCienciaDeEstudo(String cienciaDeEstudo) {
        this.cienciaDeEstudo = cienciaDeEstudo;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
