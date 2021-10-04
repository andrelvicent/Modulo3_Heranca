package br.com.zup.Exemplo10;

public interface ModeloEstacionamento {
    // Implementar adicionar carro
    // Remover carro
    // Consultar se o carro está no estacionamento

    public abstract void adicionarCarro(Carro novoCarro);
    public abstract void removerCarro(String placa);
    public abstract void consultarCarro(String placa);


}
