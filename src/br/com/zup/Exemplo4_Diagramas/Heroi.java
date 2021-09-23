package br.com.zup.Exemplo4_Diagramas;

public class Heroi {
    // Atributos
    private String nome;
    private double vida;

    // Metodos construtores
    public Heroi() {

    }

    public Heroi(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    // Metodos descritos

    public void trocarNome(String nome){
        this.nome = nome;
    }

    public void receberDano(double dano){
        this.vida = this.vida - dano;
    }

    public double exibirVida(){
        return this.vida;
    }

}
