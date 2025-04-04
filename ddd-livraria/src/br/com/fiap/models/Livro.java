package br.com.fiap.models;


import br.com.fiap.enums.TipoCapaEnum;

public class Livro {
    //Atributo tipo nomeAtributo;
    private String titulo;
    private String autor;
    private double preco;
    private Editora editora;
    private int paginas;
    private String resumo;
    private TipoCapaEnum tipoCapa; //COMUM, DURA, PERSONALIZADA


    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public double getPreco(){
        return preco;
    }

    public Editora getEditora(){
        return editora;
    }

    public int getPaginas(){
        return paginas;
    }
    public String getResumo(){
        return resumo;
    }
    public TipoCapaEnum getTipoCapa(){
        return tipoCapa;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public void setTipoCapa(TipoCapaEnum tipoCapa) {
        this.tipoCapa = tipoCapa;
    }

    //Construtor
    // sobre carga de metodos -> metodos com mesmo nome porem mesma assinatura
    public Livro(){
        tipoCapa = TipoCapaEnum.COMUM;
    }

    public Livro(Editora editora){
        this.editora = editora;
        tipoCapa = TipoCapaEnum.COMUM;
    }

    public Livro(String titulo, String autor, double preco, Editora editora, int paginas, String resumo, TipoCapaEnum tipoCapa) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
        this.editora = editora;
        this.paginas = paginas;
        this.resumo = resumo;
        this.tipoCapa = tipoCapa;
    }

    //Método para exibir o livro
    public void exibirLivro(){
        System.out.println("br.com.fiap.models.Livro: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("br.com.fiap.models.Editora: " + editora.getNome());
        System.out.println("Preço: " + preco);
        System.out.println("Tipo de capa: " + tipoCapa);
        System.out.println("-------------------------------------\n");
    }

    public String exibirTipoCapa(){
        return "";

    }
}
