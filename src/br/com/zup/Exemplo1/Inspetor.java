package br.com.zup.Exemplo1;

public class Inspetor extends Funcionario{
        private String areaDeInspecao;

    public Inspetor(String nome, String cpf, double salario, String ctps, String areaDeInspecao) {
        super(nome, cpf, salario, ctps);
        this.areaDeInspecao = areaDeInspecao;
    }

    public String getAreaDeInspecao() {
        return areaDeInspecao;
    }

    public void setAreaDeInspecao(String areaDeInspecao) {
        this.areaDeInspecao = areaDeInspecao;
    }
}
