package br.com.zup.Exemplo9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Imobiliaria imobiliaria = new Imobiliaria();

        int opcaoMenu = 0;
        boolean menu = true;

        while (menu){
            System.out.println("BEM VINDE A IMOBILIARIA VOCÊ SEM CASA MINHA FELICIDADE");
            System.out.println("Digite 1 - Para cadastrar um imóvel. ");
            System.out.println("Digite 2 - Para exibir os imóveis cadastrados. ");
            System.out.println("Digite 3 - Para sair");

            opcaoMenu = leitor.nextInt();
            leitor.nextLine();

            switch (opcaoMenu){
                case 1:
                    System.out.println("Digite o endereço do imóvel: ");
                    String endereco = leitor.nextLine();
                    System.out.println("Digite o valor do aluguel: ");
                    double valorAluguel = leitor.nextDouble();
                    leitor.nextLine();

                    System.out.println("Digite o nome do funcionario responsável: ");
                    String nomeDoFuncionario = leitor.nextLine();
                    System.out.println("Digite o CPF do funcionário: ");
                    String cpfDoFuncionario = leitor.nextLine();
                    System.out.println("Digite o número da carteira de trabalho: ");
                    String ctpsFuncionario = leitor.nextLine();

                    Funcionario funcionario = new Funcionario(nomeDoFuncionario, cpfDoFuncionario, ctpsFuncionario);

                    Imovel imovel = new Imovel(endereco, valorAluguel, funcionario);
                    imobiliaria.adicionarImovel(imovel);

                    System.out.println("Por favor, digite a quantidade de moradores: ");
                    int quantidadeDeMoradores = leitor.nextInt();
                    leitor.nextLine();

                    if (quantidadeDeMoradores == 0){
                        break;
                    }else if (quantidadeDeMoradores > 0){

                        for (int i = 0; i < quantidadeDeMoradores; i++) {
                            System.out.println("Digite o nome do morador: ");
                            String nomeDoMorador = leitor.nextLine();
                            System.out.println("Digite o CPF do morador: ");
                            String cpfMorador = leitor.nextLine();
                            System.out.println("Digite o telefone: ");
                            String telefoneMorador = leitor.nextLine();
                            System.out.println("Digite a renda do morador: ");
                            double rendaDoMorador = leitor.nextDouble();
                            leitor.nextLine();
                            Morador morador = new Morador(nomeDoMorador, cpfMorador, telefoneMorador, rendaDoMorador);
                            imovel.adicionarMorador(morador);
                        }
                        break;
                    }
                case 2:
                    System.out.println(imobiliaria);
                    break;
                case 3:
                    System.out.println("Obrigado e volte sempre");
                    menu = false;
            }
        }

    }
}
