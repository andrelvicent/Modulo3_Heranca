package br.com.zup.Exemplo10;

public class Main {
    public static void main(String[] args) {
        Estacionamento shopping = new Estacionamento();

        Carro obj_1 = new Carro("ABC897", "Azul", "Ford ka", "Ford");
        Carro obj_2 = new Carro("ABD898", "Vermelha", "Ford ka", "Ford");
        Carro obj_3 = new Carro("ABE197", "Branco", "Ford ka", "Ford");

        shopping.adicionarCarro(obj_1);
        shopping.adicionarCarro(obj_2);
        shopping.adicionarCarro(obj_3);
        shopping.mostrarLista();
        shopping.consultarCarro("ABE197");
        shopping.removerCarro("ABE197");

        shopping.mostrarLista();
    }
}
