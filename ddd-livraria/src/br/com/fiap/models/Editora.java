package br.com.fiap.models;

public class Editora {
    private String nome;
    private String site;
    private String telefone;

    /*
    * Construtor -> descreve como o objeto sera criado
    * deve ter obrigatoriamente o nome da classe
    * nao tem retorno
    * no momento em que cira um construtor o padrao deixa de existir
    * */

    public Editora(String nome){
        this.nome=nome;
    }

    public Editora(){

    }

    public void exibirEditora(){
        System.out.println("br.com.fiap.models.Editora " + nome);
        System.out.println("Site: " + site);
        System.out.println("Telefone: " + telefone);
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
