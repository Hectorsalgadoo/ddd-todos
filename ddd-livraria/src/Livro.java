public class Livro {
    //Atributo tipo nomeAtributo;
    String titulo;
    String autor;
    double preco;
    Editora editora;
    int paginas;
    String resumo;
    TipoCapaEnum tipoCapa; //COMUM, DURA, PERSONALIZADA

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
        System.out.println("Livro: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Editora: " + editora.nome);
        System.out.println("Preço: " + preco);
        System.out.println("Tipo de capa: " + tipoCapa);
        System.out.println("-------------------------------------\n");
    }

    public String exibirTipoCapa(){
        return "";

    }
}
