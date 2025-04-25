package br.com.fiap.models;

import java.util.Scanner;

public class  Alimentacao extends Despesas {
    private Scanner leitor;
    private String nomeRestaurante;
    private int quantidadeRefeicao;


    public String getNomeRestaurante() {
        return nomeRestaurante;
    }
    public void setNomeRestaurante(String nomeRestaurante) {
        this.nomeRestaurante = nomeRestaurante;
    }
    public int getQuantidadeRefeicao() {
        return quantidadeRefeicao;
    }
    public void setQuantidadeRefeicao(int quantidadeRefeicao) {
        this.quantidadeRefeicao = quantidadeRefeicao;
    }


    @Override
    public void cadastrarDespesa() {
        super.cadastrarDespesa();
        System.out.printf("Nome do Restaurante: ");
        nomeRestaurante=leitor.nextLine();
        System.out.println("Quantidade de refeição: ");
        quantidadeRefeicao=leitor.nextInt();

    }

    @Override
    public double calcularDespesa() {

        valorTotal= quantidadeRefeicao*18;
        return valorTotal;
    }

    @Override
    public void listarDespesa() {
        System.out.println("Relatorio de despesa");
        System.out.println("=======================");
        System.out.println("O nome do restaurante e: "+nomeRestaurante);
        System.out.println("A quantidade de refieição foi de "+quantidadeRefeicao);
        System.out.println("O valor total da refeição foi de: "+valorTotal);
    }
}
