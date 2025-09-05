package br.com.fiap.teste;

import br.com.fiap.dao.FilmeDao;
import br.com.fiap.models.Filmes;

import java.util.ArrayList;
import java.util.List;

public class TesteBuscarFilme {
    public static void main(String[] args) {
        List<Filmes> filmes =new ArrayList<>();
        FilmeDao dao=new FilmeDao();
        filmes=dao.listarFilme();

        System.out.println("Lista de filmes");
        System.out.println("=================");
        filmes.forEach(System.out::println);

    }
}
