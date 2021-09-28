package br.com.zup.Exemplo9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Imobiliaria {
    private List <Imovel> imoveis = new ArrayList<>();

    public void adicionarImovel(Imovel imovel){
        imoveis.add(imovel);
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Quantidade de imoveis: " +imoveis.size());
        retorno.append("Imoveis: ");
        retorno.append("\n " +imoveis);
        return retorno.toString();
    }
}
