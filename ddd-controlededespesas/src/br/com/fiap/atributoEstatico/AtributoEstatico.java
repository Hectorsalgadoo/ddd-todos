package br.com.fiap.atributoEstatico;

public class AtributoEstatico {
    public int quantidade;
    public static int qtdStatic;

    public AtributoEstatico(){
        quantidade++;
        qtdStatic++;
    }
    public void exibir(){
        System.out.println("quantidade"+ quantidade);
        System.out.println("quantidade estatico"+qtdStatic);
    }
}
