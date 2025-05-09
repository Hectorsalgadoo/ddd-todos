package br.com.fiap.models;

import br.com.fiap.interfaces.Exemplar;

public class Revista implements Exemplar {
    private String nome;
    private String descricao;
    private double preco;
    private Editora editora;

    @Override
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public void exibirLivro() {

    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }
}
