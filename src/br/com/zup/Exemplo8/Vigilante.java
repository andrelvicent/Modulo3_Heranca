package br.com.zup.Exemplo8;

public class Vigilante extends Funcionario{
    private double adicionalNoturno;

    public Vigilante(String nome, String cpf, String numeroDeRegistro, String orgaoDeLotacao, double salario, double adicionalNoturno) {
        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);
        this.adicionalNoturno = adicionalNoturno;
    }

    public double getAdicionalNoturno() {
        return adicionalNoturno;
    }

    public void setAdicionalNoturno(double adicionalNoturno) {
        this.adicionalNoturno = adicionalNoturno;
    }
    @Override
    public void aumentarSalario(){
        double novoSalario = (0.15 * getSalario()) + getSalario() + adicionalNoturno;
        setSalario(novoSalario);
    }

    @Override
    public String toString() {
        return super.toString() + "Vigilante{" +
                "adicionalNoturno=" + adicionalNoturno +
                '}';
    }
}
