package br.com.zup.Exemplo8;

import java.util.ArrayList;
import java.util.List;

public class Coordenador extends Funcionario{
    private List <Professor> professoresSupervisionados = new ArrayList<>();

    public Coordenador() {

    }

    public Coordenador(String nome, String cpf, String numeroDeRegistro, String orgaoDeLotacao, double salario) {
        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);
    }

   public void adicionarProfessorSupervisionado(Professor professor){
        professoresSupervisionados.add(professor);
   }
   @Override
   public void aumentarSalario(){
       double novoSalario = (0.05 * getSalario()) + getSalario();
       setSalario(novoSalario);
   }

/*
* Outra forma de fazer
*
   @Override
   public double aumentarSalario(){
        double novoSalario = (getSalario() * 0.05) + getSalario();
        return novoSalario;
   }
 */

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();

        retorno.append("\n Nome: " +getNome());
        retorno.append("\n CPF: " +getCpf());
        retorno.append("\n Numero de registro: " + getNumeroDeRegistro());
        retorno.append("\n Orgão de lotação: " +getOrgaoDeLotacao());
        retorno.append("\n Salário: " +getSalario());
        retorno.append("\n Quantidade de professores que ele supervisiona: " +professoresSupervisionados.size());
        retorno.append("\n Professores supervisionados: " +professoresSupervisionados);

        return retorno.toString();
    }
}
