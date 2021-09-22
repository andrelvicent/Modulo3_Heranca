package br.com.zup.Exemplo1;

public class Funcionario{
    private String nome;
    private String cpf;
    private double salario;
    private String ctps;

    public Funcionario(String nome, String cpf, double salario, String ctps) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.ctps = ctps;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }
}
