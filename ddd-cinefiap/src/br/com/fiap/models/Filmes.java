package br.com.fiap.models;

import br.com.fiap.enums.ClassificacaoIndicativaEnum;
import br.com.fiap.enums.GeneroEnum;
import oracle.sql.NUMBER;

import java.time.LocalTime;

public class Filmes {

    private Long id_filme;
    private String tx_nome;
    private int nr_duracao;
    private GeneroEnum tp_genero;
    private ClassificacaoIndicativaEnum tp_classificacao;
    private int nr_ano;
    private String tx_capa;
    private String tx_diretor;
    private String tx_elenco;
    private String tx_descricao;
    public double nr_avaliacao;

    public String toString() {
        return "\nid do filme: " + id_filme +
                "\nNome:" + tx_nome +
                "\nDuração: " + nr_duracao +
                "\nGenero: " + tp_genero +
                "\nClassificação: " + tp_classificacao  +
                "\nAno de lançamento: " + nr_ano +
                "\nCapa" + tx_capa +
                "\nDiretor " +tx_diretor +
                "\nElenco " + tx_elenco +
                "\nDescrição " + tx_descricao +
                "\nAvaliação" + nr_avaliacao +
                "\n===================================";
    }

    public Long getId_filme() {
        return id_filme;
    }

    public void setId_filme(Long id_filme) {
        this.id_filme = id_filme;
    }

    public String getTx_nome() {
        return tx_nome;
    }

    public void setTx_nome(String tx_nome) {
        this.tx_nome = tx_nome;
    }

    public int getNr_duracao() {
        return nr_duracao;
    }

    public void setNr_duracao(int nr_duracao) {
        this.nr_duracao = nr_duracao;
    }

    public GeneroEnum getTp_genero() {
        return tp_genero;
    }

    public void setTp_genero(GeneroEnum tp_genero) {
        this.tp_genero = tp_genero;
    }

    public ClassificacaoIndicativaEnum getTp_classificacao() {
        return tp_classificacao;
    }

    public void setTp_classificacao(ClassificacaoIndicativaEnum tp_classificacao) {
        this.tp_classificacao = tp_classificacao;
    }

    public int getNr_ano() {
        return nr_ano;
    }

    public void setNr_ano(int nr_ano) {
        this.nr_ano = nr_ano;
    }

    public String getTx_capa() {
        return tx_capa;
    }

    public void setTx_capa(String tx_capa) {
        this.tx_capa = tx_capa;
    }

    public String getTx_diretor() {
        return tx_diretor;
    }

    public void setTx_diretor(String tx_diretor) {
        this.tx_diretor = tx_diretor;
    }

    public String getTx_elenco() {
        return tx_elenco;
    }

    public void setTx_elenco(String tx_elenco) {
        this.tx_elenco = tx_elenco;
    }

    public String getTx_descricao() {
        return tx_descricao;
    }

    public void setTx_descricao(String tx_descricao) {
        this.tx_descricao = tx_descricao;
    }

    public double getNr_avaliacao() {
        return nr_avaliacao;
    }

    public void setNr_avaliacao(double nr_avaliacao) {
        this.nr_avaliacao = nr_avaliacao;
    }
}
