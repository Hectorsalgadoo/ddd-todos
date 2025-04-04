// Hector Salgado Soria Rm565498
public class Anime {

    String nome;
    int classificacaoIndicativa;
    String genero;
    String autor;
    int qtdEpisodios;
    int numeroTemporadas;
    String mensagem;

    //construtor
    public Anime (String nome, int classificacaoIndicativa){
        this.nome=nome;
        this.classificacaoIndicativa=classificacaoIndicativa;
    }


    public Anime(){}

    public int mediaEpisodioPorTemporada(){
        return qtdEpisodios/numeroTemporadas;
    }

    public String exibirClassificacao(){
        String mensagem;
                if(classificacaoIndicativa < 10)
                    mensagem="Livre para todos os publicos";
                else if(classificacaoIndicativa == 10)
                    mensagem="Não e recomendado para menores de 10 anos";
                else if(classificacaoIndicativa==12)
                    mensagem="Nao e recomendado para menores de 12 anos";
                else if(classificacaoIndicativa==14)
                    mensagem="Nao e recomendado para menores de 14 anos";
                else if (classificacaoIndicativa==16)
                    mensagem="Nao e recomendado para menores de 16 anos";
                else
                     mensagem="Nao e recomendado para menores de 18 anos";

                return mensagem;
    }

    public void exibirDadosAnime(){
         mensagem = ("Nome de anime: " +nome + "\nDe acordo com o ministério da justiça esse anime é " +exibirClassificacao()+ "\nA média de episódios por temporada é " +mediaEpisodioPorTemporada());
    }


}
