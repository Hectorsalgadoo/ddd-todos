package br.com.fiap.teste;

import java.util.Scanner;

public class TesteLacos {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        int x=1;//inicialização
        while (x<=50){ // while(condicao)
            System.out.println(x);
            x++; //altera o valor da variavel de teste
        }

        int opcao=10;
        while (opcao!=0){
            System.out.println("Digite a opção desejada"+
                    "\n1- alimentação"+
                    "\n2 - Transporte"+
                    "\n3 - Diaria"+
                    "\n4- Analise de despesas"+
                    "\n0 - Sair");
            opcao = leitor.nextInt();
        }
        do {
            System.out.println("Digite a opção desejada"+
                    "\n1- alimentação"+
                    "\n2 - Transporte"+
                    "\n3 - Diaria"+
                    "\n4- Analise de despesas"+
                    "\n0 - Sair");
            opcao = leitor.nextInt();
        }while (opcao!=0);
    }
}
