package br.com.zup.Exemplo11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            Sistema.cadastrarAluno();
            Sistema.cadastrarAluno();
            ServicoAluno.listarAlunos();

        }catch (Exception erro){
            System.out.println(erro.getMessage());
        }
    }
}
