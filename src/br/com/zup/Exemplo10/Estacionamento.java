package br.com.zup.Exemplo10;

// Faça um sistema que gerencie um estacionamento
// O estacionamento deve permitir adicionar, remover ou consultar se um carro está no estabelecimento
// O sistema deverá exibir os carros do estacionamento

import java.util.ArrayList;
import java.util.List;

public class Estacionamento implements ModeloEstacionamento{
    private List<Carro> carros = new ArrayList<>();

    public void mostrarCarros() {
        for (Carro referencia : carros) {
            System.out.println(referencia);

        }
    }

    @Override
    public void adicionarCarro(Carro novoCarro){
        carros.add(novoCarro);
    }

    @Override
    public void consultarCarro(String placa){
        for (Carro referencia : carros) {
            if (referencia.getPlaca().equals(placa)) {
                System.out.println(referencia);
                System.out.println("Carro encontrado");
            }
        }

    }

    @Override
    public void removerCarro(String placa){
        Carro carroASerDeletado = null;

        for (Carro referencia: carros) {
            if (referencia.getPlaca().equals(placa)) {
                carroASerDeletado = referencia;
                System.out.println("Carro encontrado e deletado com sucesso. ");
            }
        }
        carros.remove(carroASerDeletado);
    }

}
