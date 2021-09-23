package br.com.zup.Exemplo4_Diagramas;

public class Voador extends Inimigo{
    private double danoTiro;

    public Voador(String nome, double vida, double danoTiro) {
        super(nome, vida);
        this.danoTiro = danoTiro;
    }

    public double getDanoTiro() {
        return danoTiro;
    }

    public void setDanoTiro(double danoTiro) {
        this.danoTiro = danoTiro;
    }

    public double aplicarDano(){
        return danoTiro;
    }
}
