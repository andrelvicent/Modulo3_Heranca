package br.com.zup.Exemplo10;

public class Carro extends Veiculo {
    private int numeroDePortas;

    public Carro(String placa, String cor, String modelo, String marca) {
        super(placa, cor, modelo, marca);
    }

    public double getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    @Override
    public String toString() {
        return "Carro{" + super.toString() +
                "numeroDePortas=" + numeroDePortas +
                '}';
    }
}
