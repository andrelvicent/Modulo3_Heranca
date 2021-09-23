package br.com.zup.Exemplo4_Diagramas;

public class Main {
    public static void main(String[] args) {
        Guerreiro guerreiro = new Guerreiro("Garen", 800, 65);
        Rasteiro rasteiro = new Rasteiro("Rammus", 200, 35);

        double danoDoInimigo = rasteiro.aplicarDano();
        double danoDoHeroi = guerreiro.aplicarDano();

        // Testando o dano do Rammus
        System.out.println("Vida do " +guerreiro.getNome() +guerreiro.exibirVida());
        guerreiro.receberDano(danoDoInimigo);
        guerreiro.receberDano(danoDoInimigo);
        guerreiro.receberDano(danoDoInimigo);
        guerreiro.receberDano(danoDoInimigo);
        guerreiro.receberDano(danoDoInimigo);
        guerreiro.receberDano(danoDoInimigo);
        System.out.println("Vida do " +guerreiro.getNome() +guerreiro.exibirVida());

        // Testando o dano do Garen
        rasteiro.receberDano(danoDoHeroi);
        System.out.println("Vida do " +rasteiro.getNome() + rasteiro.exibirVida());
        rasteiro.receberDano(danoDoHeroi);
        rasteiro.receberDano(danoDoHeroi);
        rasteiro.receberDano(danoDoHeroi);
        System.out.println("Vida do " +rasteiro.getNome() + rasteiro.exibirVida());


    }
}
