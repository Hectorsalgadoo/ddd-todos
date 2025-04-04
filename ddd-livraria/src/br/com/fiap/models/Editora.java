package br.com.fiap.models;

public class Editora {
    private String nome;
    public String site;
    public String telefone;

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
}
