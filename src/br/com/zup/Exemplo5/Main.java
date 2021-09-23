package br.com.zup.Exemplo5;

import java.awt.desktop.AppReopenedEvent;

public class Main {
    public static void main(String[] args) {
        Administrador administrador = new Administrador("André Xablau", 50, 100, 10);
        Programador programador = new Programador("André Batman", 40, 90, "Java");
        Vigilante vigilante = new Vigilante("André Vigilante", 30, 100, 20, 20);

        double salarioVigilante = vigilante.calcularSalario();
        double salarioProgramador = programador.calcularSalario();
        double salarioAdministrador = administrador.calcularSalario();

        System.out.println("O salario do " +vigilante.getNome() + " é: R$ " +salarioVigilante);
        System.out.println("O salario do " +programador.getNome() + " é: R$ " +salarioProgramador);
        System.out.println("O salario do " +administrador.getNome() + " é: R$ " +salarioAdministrador);


    }
}
