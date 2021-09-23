package br.com.zup.Exemplo5;

public class Administrador extends Colaborador{
    private double ajudaDeCusto;

    public Administrador(String nome, double imposto, double salario, double ajudaDeCusto) {
        super(nome, imposto, salario);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public double calcularSalario(){
        double salarioLiquido = ajudaDeCusto + (getSalario() - getImposto());
        return salarioLiquido;
    }
}
