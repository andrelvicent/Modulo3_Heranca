package br.com.zup.Exemplo11;

import java.util.List;
import java.util.Scanner;

public class Sistema {
    private static Scanner capturarDados(String mensagem){
        System.out.println(mensagem);
        return new Scanner(System.in);
    }
    public static void menu(){
        System.out.println("Digite 1 para cadastrar um aluno. ");
    }

    public static void menuTurnos(){
        List<Turno> turnos = ServicoAluno.mostrarTurnos();
        System.out.println("Lista de turnos disponíveis: ");

        // Exibindo a lista de turnos pro usuário
        for (int i = 0; i < turnos.size(); i++) {
            System.out.println(turnos.get(i));
        }
        // Outra forma
        for(Turno turnoReferencia : turnos){
            System.out.println(turnoReferencia);
        }
    }

   public static Aluno cadastrarAluno() throws Exception{
        String nome = capturarDados("Por favor, digite o nome do aluno").nextLine();
        String cpf = capturarDados("Por favor, digite o CPF do aluno: ").nextLine();
        menuTurnos();
        String turno = capturarDados("Por favor, digite o turno: ").nextLine();
        return ServicoAluno.cadastrarAluno(nome, cpf, turno);
    }
}
