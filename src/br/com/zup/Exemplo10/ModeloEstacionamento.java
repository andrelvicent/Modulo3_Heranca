package br.com.zup.Exemplo10;

public interface ModeloEstacionamento {
    // Criar um contrato na qual o estacionamento deverá seguir

    public abstract void adicionarCarro(Carro novoCarro);
    public abstract void removerCarro(String placa);
    public abstract void consultarCarro(String placa);


}
