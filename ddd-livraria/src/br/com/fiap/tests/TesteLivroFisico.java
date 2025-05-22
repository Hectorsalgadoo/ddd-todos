package br.com.fiap.tests;

import br.com.fiap.models.Carrinho;
import br.com.fiap.models.Editora;
import br.com.fiap.models.LivroDigital;
import br.com.fiap.models.LivroFisico;

public class TesteLivroFisico {
    public static void main(String[] args) {
        Editora novatec = new Editora();
        novatec.setNome("Novatec");
        novatec.setSite("www.novatec.com");
        novatec.setTelefone("11568958995");

        LivroFisico livroFisico = new LivroFisico();
        livroFisico.setTitulo("Livrox");
        livroFisico.setEditora(novatec);
        livroFisico.setAutor("Alguem");
        livroFisico.setEndereco("Avenida Paulista");
        livroFisico.setTaxaEntrega(14);
        livroFisico.setPreco(100);

        livroFisico.exibirLivro();
        System.out.println("Preço final R$ " + livroFisico.aplicarDesconto(15));
        LivroDigital ld =new LivroDigital();
        ld.setPreco(50);
        ld.setAudioLivro(true);
        ld.setTitulo("sem criarividade");
        ld.exibirLivro();

        if(livroFisico.ehMaisCaroQue(ld))
            System.out.println("o "+livroFisico.getTitulo()+);
        Carrinho carrinho = new Carrinho();
        carrinho.adicionarItem(livroFisico);
        carrinho.adicionarItem(ld);
    }
}
