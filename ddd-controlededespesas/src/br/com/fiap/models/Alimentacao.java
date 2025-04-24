package br.com.fiap.models;

public class Alimentacao extends Despesas {
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

    }

    @Override
    public double calcularDespesa() {

        valorTotal= quantidadeRefeicao*18;
        return valorTotal;
    }

    @Override
    public void listarDespesa() {

    }
}
