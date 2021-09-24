package br.com.zup.Exemplo6;

public class Figurante extends Ator {
    private int ingressosGratis = 10;

    public Figurante(String nome, String papel, double salario) {
        super(nome, papel, salario);
    }

    public Figurante(String nome, String papel, double salario, int ingressosGratis) {
        super(nome, papel, salario);
        this.ingressosGratis = ingressosGratis;
    }

    public int getIngressosGratis() {
        return ingressosGratis;
    }

    public void setIngressosGratis(int ingressosGratis) {
        this.ingressosGratis = ingressosGratis;
    }
}
