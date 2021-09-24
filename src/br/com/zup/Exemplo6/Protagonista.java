package br.com.zup.Exemplo6;

public class Protagonista extends Ator{
    private double plr;

    public Protagonista(String nome, String papel, double salario, double plr) {
        super(nome, papel, salario);
        this.plr = plr;
    }

    public double getPlr() {
        return plr;
    }

    public void setPlr(double plr) {
        this.plr = plr;
    }

    @Override
    public double calcularSalario(){
        double salarioLiquido = ((this.getSalario() + this.plr) - this.getImposto());
        return salarioLiquido;
    }

}
