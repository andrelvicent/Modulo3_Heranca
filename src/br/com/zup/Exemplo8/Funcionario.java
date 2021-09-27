package br.com.zup.Exemplo8;

public class Funcionario {
    private String nome;
    private String cpf;
    private String numeroDeRegistro;
    private String orgaoDeLotacao;
    private double salario;

    public Funcionario() {

    }

    public Funcionario(String nome, String cpf, String numeroDeRegistro, String orgaoDeLotacao, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.numeroDeRegistro = numeroDeRegistro;
        this.orgaoDeLotacao = orgaoDeLotacao;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumeroDeRegistro() {
        return numeroDeRegistro;
    }

    public void setNumeroDeRegistro(String numeroDeRegistro) {
        this.numeroDeRegistro = numeroDeRegistro;
    }

    public String getOrgaoDeLotacao() {
        return orgaoDeLotacao;
    }

    public void setOrgaoDeLotacao(String orgaoDeLotacao) {
        this.orgaoDeLotacao = orgaoDeLotacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void aumentarSalario(){
        double novoSalario = (0.1 * salario) + salario;
        this.salario = novoSalario;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Nome: " +nome);
        retorno.append("CPF: " +cpf);
        retorno.append("Numero de registro: " + numeroDeRegistro);
        retorno.append("Orgão de lotação: " +orgaoDeLotacao);
        retorno.append("Salário: " +salario);
        return retorno.toString();
    }
}
