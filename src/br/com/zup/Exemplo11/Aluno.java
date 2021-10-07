package br.com.zup.Exemplo11;

public class Aluno {
    // Sistema de gestão de uma universidade
    private String nome;
    private String cpf;
    private Turno turno;
    private Nivel nivel;

    public Aluno() {

    }

    public Aluno(String nome, String cpf, Turno turno) {
        this.nome = nome;
        this.cpf = cpf;
        this.turno = turno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }


    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", turno=" + turno +
                " "+
                '}';
    }
}
