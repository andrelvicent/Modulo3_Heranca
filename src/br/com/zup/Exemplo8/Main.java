package br.com.zup.Exemplo8;


public class Main {
    public static void main(String[] args) {
        /*
        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);
        this.nivelDeGraduacao = nivelDeGraduacao;
        this.disciplinaMinistrada = disciplinaMinistrada;
        this.qtd_alunos = qtd_alunos;
        this.qtd_turmas = qtd_turmas;
         */

        Professor prof = new Professor("André", "555555521-55", "2365321", "Filial de Uberlândia", 500, "Mestrado", "Java", 100, 2);
        Professor prof2 = new Professor("Vinicius", "66666666621-55", "2365328", "Filial de Uberlândia", 500, "Graduacao", "Objective C", 200, 4);
        Coordenador coordenador = new Coordenador("Barbara", "012345678-99", "987654321", "Matriz", 1000);

        System.out.println(prof2);
        prof2.aumentarSalario();
        System.out.println(prof2);

    }

}
