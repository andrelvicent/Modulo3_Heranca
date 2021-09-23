package br.com.zup.Exemplo4_Diagramas;

public class Main {
    public static void main(String[] args) {
        Guerreiro guerreiro = new Guerreiro("Garen", 800, 65);
        Rasteiro rasteiro = new Rasteiro("Rammus", 200, 35);

        // Testando o dano do Rammus
        System.out.println("Vida do " +guerreiro.getNome() +guerreiro.exibirVida());
        guerreiro.receberDano(rasteiro.aplicarDano());
        guerreiro.receberDano(rasteiro.aplicarDano());
        guerreiro.receberDano(rasteiro.aplicarDano());
        guerreiro.receberDano(rasteiro.aplicarDano());
        guerreiro.receberDano(rasteiro.aplicarDano());
        guerreiro.receberDano(rasteiro.aplicarDano());
        System.out.println("Vida do " +guerreiro.getNome() +guerreiro.exibirVida());

        // Testando o dano do Garen
        rasteiro.receberDano(guerreiro.aplicarDano());
        System.out.println("Vida do " +rasteiro.getNome() + rasteiro.exibirVida());
        rasteiro.receberDano(guerreiro.aplicarDano());
        rasteiro.receberDano(guerreiro.aplicarDano());
        rasteiro.receberDano(guerreiro.aplicarDano());
        System.out.println("Vida do " +rasteiro.getNome() + rasteiro.exibirVida());


    }
}
