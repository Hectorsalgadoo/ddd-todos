package br.com.fiap.teste;
//diagrams.io-- draw.io

import br.com.fiap.models.*;

import java.util.Scanner;

public class Principal {
    public static void subMenu(){
        System.out.println("Digite a opção desejada"+
                "\n1- alimentação"+
                "\n2 - Transporte"+
                "\n3 - Diaria"+
                "\n4- Analise de despesas"+
                "\n0 - Sair");
    }
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        Scanner leitorNumerico=new Scanner(System.in);
        int op=0, opSub=0;
        Alimentacao alimentacao=new Alimentacao();
        Transporte transporte=new Transporte();
        Diaria diaria=new Diaria();
        GerenciadorDespesa despesa=new GerenciadorDespesa()


        do {
            System.out.println("Digite a opção desejada"+
                    "\n1- alimentação"+
                    "\n2 - Transporte"+
                    "\n3 - Diaria"+
                    "\n4- Analise de despesas"+
                    "\n0 - Sair");
            op=leitorNumerico.nextInt();

            switch (op){
                case 1:{
                    do {
                        subMenu();
                        opSub=leitorNumerico.nextInt();
                        switch (opSub){
                            case 1 -> alimentacao.cadastrarDespesa();
                            case 2 -> alimentacao.calcularDespesa();
                            case 3 -> alimentacao.listarDespesa();
                            case 4-> gerenciador.analisarDespesa(alimentacao)
                        }
                    }while (opSub!=0);
                }
            }
        }while (op!=0);
        System.out.println("despesa total da viagem: R$ "+gerenciador.getTotalDespesa);

    }
}
