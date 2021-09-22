package br.com.zup.Exemplo2;

public class Main {
    public static void main(String[] args) {
        Guerreiros guerreiro = new Guerreiros("Thor", "Raio", "Armadura", 100, "Martelo");
        Voadores inimigoVoador = new Voadores("Anivia", "Azul", "Gelo", 800, 50);

        // Atribuindo o retorno do método na variável danoAplicado
        int danoAplicado = inimigoVoador.aplicarDano();

        // Aplicando dano no guerreiro
        guerreiro.perderVida(danoAplicado);

        // Exibe a vida do inimigo
        System.out.println(inimigoVoador.getVida());

        // Atribuindo o retorno do método na variável danoDoGuerreiro
        int danoDoGuerreiro = guerreiro.aplicaDano();

        // Aplicando dano no inimigo
        inimigoVoador.perderVida(danoDoGuerreiro);

        // Exibe a vida do inimigo
        System.out.println(inimigoVoador.getVida());

        // Aplicando dano no inimigo
        inimigoVoador.perderVida(danoDoGuerreiro);

        // Exibe a vida do inimigo
        System.out.println(inimigoVoador.getVida());


    }
}
