package br.com.fiap.models;

import java.util.Scanner;

public class Diaria extends Despesas{
    private double qtdDiaria;
    private String nomeHotel;


    public double getQtdDiaria() {
        return qtdDiaria;
    }
    public void setQtdDiaria(double qtdDiaria) {
        this.qtdDiaria = qtdDiaria;
    }
    public String getNomeHotel() {return nomeHotel;}
    public void setNomeHotel(String nomeHotel) {this.nomeHotel = nomeHotel;}


    @Override
    public void cadastrarDespesa() {
        super.cadastrarDespesa();
        Scanner leitor=new Scanner(System.in);
        System.out.printf("Nome do Hotel: ");
        nomeHotel= leitor.nextLine();
        System.out.println("Quantidade de diarias: ");
        qtdDiaria=leitor.nextInt();
    }

    @Override
    public void calcularDespesa() {
        setValorTotal(qtdDiaria*50);
    }

    @Override
    public void listarDespesa() {
        System.out.println("\nRelatorio de despesa");
        System.out.println("\n=======================");
        System.out.println("Descrição: "+getDescricao());
        System.out.println("\nNome do hotel: "+nomeHotel);
        System.out.println("\nQuantidade de diarias: "+qtdDiaria);
        System.out.println("\nO valor total da diaria foi de: "+getValorTotal());


    }
}
