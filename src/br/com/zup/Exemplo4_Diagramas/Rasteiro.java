package br.com.zup.Exemplo4_Diagramas;

public class Rasteiro extends Inimigo{
    private double danoEspinhos;

    public Rasteiro(String nome, double vida, double danoEspinhos) {
        super(nome, vida);
        this.danoEspinhos = danoEspinhos;
    }

    public double getDanoEspinhos() {
        return danoEspinhos;
    }

    public void setDanoEspinhos(double danoEspinhos) {
        this.danoEspinhos = danoEspinhos;
    }

    public double aplicarDano(){
        return danoEspinhos;
    }

}
