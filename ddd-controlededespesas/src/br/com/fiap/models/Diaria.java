package br.com.fiap.models;

public class Diaria extends Despesas{
    private double qtdDiaria;

    public double getQtdDiaria() {
        return qtdDiaria;
    }

    public void setQtdDiaria(double qtdDiaria) {
        this.qtdDiaria = qtdDiaria;
    }

    @Override
    public void cadastrarDespesa() {

    }

    @Override
    public double calcularDespesa() {
        valorTotal=qtdDiaria*50;
        return valorTotal;
    }

    @Override
    public void listarDespesa() {

    }
}
