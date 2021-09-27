package br.com.zup.Exemplo8;

public class Professor extends Funcionario{
    private String nivelDeGraduacao;
    private String disciplinaMinistrada;
    private int qtd_alunos;
    private int qtd_turmas;

    public Professor() {

    }

    public Professor(String nome, String cpf, String numeroDeRegistro, String orgaoDeLotacao, double salario, String nivelDeGraduacao, String disciplinaMinistrada, int qtd_alunos, int qtd_turmas) {
        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);
        this.nivelDeGraduacao = nivelDeGraduacao;
        this.disciplinaMinistrada = disciplinaMinistrada;
        this.qtd_alunos = qtd_alunos;
        this.qtd_turmas = qtd_turmas;
    }

    public String getNivelDeGraduacao() {
        return nivelDeGraduacao;
    }

    public void setNivelDeGraduacao(String nivelDeGraduacao) {
        this.nivelDeGraduacao = nivelDeGraduacao;
    }

    public String getDisciplinaMinistrada() {
        return disciplinaMinistrada;
    }

    public void setDisciplinaMinistrada(String disciplinaMinistrada) {
        this.disciplinaMinistrada = disciplinaMinistrada;
    }

    public int getQtd_alunos() {
        return qtd_alunos;
    }

    public void setQtd_alunos(int qtd_alunos) {
        this.qtd_alunos = qtd_alunos;
    }

    public int getQtd_turmas() {
        return qtd_turmas;
    }

    public void setQtd_turmas(int qtd_turmas) {
        this.qtd_turmas = qtd_turmas;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();

        retorno.append("\n Nome: " +getNome());
        retorno.append("\n CPF: " +getCpf());
        retorno.append("\n Numero de registro: " + getNumeroDeRegistro());
        retorno.append("\n Orgão de lotação: " +getOrgaoDeLotacao());
        retorno.append("\n Salário: " +getSalario());
        retorno.append("\n Nível de graduação: " +nivelDeGraduacao);
        retorno.append("\n Disciplina ministrada: " +disciplinaMinistrada);
        retorno.append("\n Quantidade de alunos: " +qtd_alunos);
        retorno.append("\n Quantidade de turmas: " +qtd_turmas);

        return retorno.toString();
    }
}
