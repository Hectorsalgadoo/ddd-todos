package br.com.fiap.models;
import java.util.Scanner;

public abstract class Despesas {
    private Scanner leitor;
    protected String descricao;
    protected double valorTotal;


    protected Despesas(){
        Scanner leitor=new Scanner(System.in);
    }


    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }


    public void cadastrarDespesa(){
        valorTotal=0;
        System.out.printf("descreva a despesa: ");
        descricao= leitor.nextLine();
    }

    public abstract double calcularDespesa();

    public abstract void listarDespesa();
}
