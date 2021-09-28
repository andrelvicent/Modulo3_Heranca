package br.com.zup.Exemplo8;

public class FuncionarioAdministrativo extends Funcionario{
    private String funcaoAdministrativa;
    private String senioridade;


    public FuncionarioAdministrativo(String nome, String cpf, String numeroDeRegistro, String orgaoDeLotacao, double salario, String funcaoAdministrativa, String senioridade) {
        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);
        this.funcaoAdministrativa = funcaoAdministrativa;
        this.senioridade = senioridade;
    }

    public String getFuncaoAdministrativa() {
        return funcaoAdministrativa;
    }

    public void setFuncaoAdministrativa(String funcaoAdministrativa) {
        this.funcaoAdministrativa = funcaoAdministrativa;
    }

    public String getSenioridade() {
        return senioridade;
    }

    public void setSenioridade(String senioridade) {
        this.senioridade = senioridade;
    }

    @Override
    public String toString() {
        return "FuncionarioAdministrativo{" +
                "funcaoAdministrativa='" + funcaoAdministrativa + '\'' +
                ", senioridade='" + senioridade + '\'' +
                '}';
    }
}
