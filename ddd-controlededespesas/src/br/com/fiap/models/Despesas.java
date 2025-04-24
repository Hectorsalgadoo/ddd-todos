package br.com.fiap.models;

public abstract class Despesas {
    protected String descricao;
    protected double valorTotal;

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

    public abstract void cadastrarDespesa();

    public abstract double calcularDespesa();

    public abstract void listarDespesa();
}
