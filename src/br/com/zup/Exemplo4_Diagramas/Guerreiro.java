package br.com.zup.Exemplo4_Diagramas;

public class Guerreiro extends Heroi{
    private double poderAtaque;

    public Guerreiro(String nome, double vida, double poderAtaque) {
        super(nome, vida);
        this.poderAtaque = poderAtaque;
    }

    public double getPoderAtaque() {
        return poderAtaque;
    }

    public void setPoderAtaque(double poderAtaque) {
        this.poderAtaque = poderAtaque;
    }

    public double aplicarDano(){
        return poderAtaque;
    }
}
