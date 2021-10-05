package br.com.zup.Exemplo10;

public class Main {
    public static void main(String[] args) {

        // Instanciando estacionamento
        Estacionamento shopping = new Estacionamento();

        // Instanciando Carros
        Carro obj_1 = new Carro("ABC897", "Azul", "Ford ka", "Ford");
        Carro obj_2 = new Carro("ABD898", "Vermelha", "Ford ka", "Ford");
        Carro obj_3 = new Carro("ABE197", "Branco", "Ford ka", "Ford");

        // Adicionando carros na lista
        shopping.adicionarCarro(obj_1);
        shopping.adicionarCarro(obj_2);
        shopping.adicionarCarro(obj_3);
        // Exibindo lista de carros
        shopping.mostrarCarros();

        // Consultando se um carro está na lista
        shopping.consultarCarro("ABE197");

        // Removendo carro da lista
        shopping.removerCarro("ABE197");

        shopping.mostrarCarros();
    }
}
