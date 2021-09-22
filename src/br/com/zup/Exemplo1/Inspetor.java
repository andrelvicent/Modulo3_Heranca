package br.com.zup.Exemplo1;

public class Inspetor extends Funcionario{
        private String areaDeInspecao;

    public Inspetor(String nome, double salario, String ctps, String cpf, String areaDeInspecao) {
        super(nome, salario, ctps, cpf);
        this.areaDeInspecao = areaDeInspecao;
    }

    public String getAreaDeInspecao() {
        return areaDeInspecao;
    }

    public void setAreaDeInspecao(String areaDeInspecao) {
        this.areaDeInspecao = areaDeInspecao;
    }


}
