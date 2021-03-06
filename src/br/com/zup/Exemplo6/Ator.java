package br.com.zup.Exemplo6;

public abstract class Ator {
    private String nome;
    private String papel;
    private double salario;
    private double imposto;

    public Ator() {

    }

    public Ator(String nome) {
        this.nome = nome;
    }

    public Ator(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public Ator(String nome, String papel, double salario) {
        this.nome = nome;
        this.papel = papel;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPapel() {
        return papel;
    }

    public void setPapel(String papel) {
        this.papel = papel;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularSalario(){
        double salarioLiquido = this.salario - this.imposto;
        return salarioLiquido;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
}
