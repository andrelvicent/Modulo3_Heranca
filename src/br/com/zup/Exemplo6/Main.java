package br.com.zup.Exemplo6;

public class Main {
    public static void main(String[] args) {
        Protagonista protagonista = new Protagonista("Adam Sendler", "Cardiologista do hospital", 4000,8000 );
        Figurante figurante = new Figurante("André", "Pessoas que correm no metro", 500);

        protagonista.setImposto(5000);
        figurante.setImposto(40);
        figurante.setIngressosGratis(80);

        double salarioLiquido_protagonista = protagonista.calcularSalario();
        double salarioLiquido_figurante = figurante.calcularSalario();


        System.out.println(salarioLiquido_protagonista);
        System.out.println(salarioLiquido_figurante);
        System.out.println("Qtd. de ingressos" +figurante.getIngressosGratis());
    }
}
