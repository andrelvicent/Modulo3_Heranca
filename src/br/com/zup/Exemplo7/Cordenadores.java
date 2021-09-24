package br.com.zup.Exemplo7;


import java.util.ArrayList;
import java.util.List;

public class Cordenadores extends Funcionario{
    private List<Professores> professoresSupervisionados = new ArrayList<>();

    public Cordenadores(String nome, String senioridade, double salario) {
        super(nome, senioridade, salario);
    }

    public void adicionarProfessor(Professores prof){
        professoresSupervisionados.add(prof);
    }

    public void exibirProfessoresSupervisionados(){
        for (Professores referencia:professoresSupervisionados) {
            System.out.println("O nome do professor é: " +referencia.getNome());
        }
    }

    public void removerProfessor(){

    }
}
