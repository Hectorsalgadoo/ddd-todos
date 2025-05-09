package br.com.fiap.models;

public class Carrinho {

    public void adicionarItem(Livro livro){
        if(livro instanceof LivroFisico)
        valorTotal=+livro.getPreco();
        //if(livro instanceof SubClasse)
    }

    public void adicionarItem(LivroDigital livroDigital){
        //adiciono o livroDigital
    }
    public void adicionarItem(LibroBolso libroBolso){
        //adiciono o livroBolso
    }

    private double valorTotal;

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
