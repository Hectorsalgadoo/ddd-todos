package br.com.fiap.teste;

import br.com.fiap.dao.FilmeDao;
import br.com.fiap.enums.GeneroEnum;
import br.com.fiap.models.Filmes;

import java.util.Scanner;

public class TesteInsetFilme {
    public static void main(String[] args) {

        Scanner leitor=new Scanner(System.in);
        Scanner leitortexto=new Scanner(System.in);

        Filmes filmes=new Filmes();
        FilmeDao dao=new FilmeDao();


        System.out.println("Digite o codigo do filme");
        filmes.setId_filme(leitor.nextLong());
        System.out.println("Digite o nome do filme");
        filmes.setTx_nome(leitor.nextLine());
        System.out.println("Digite a duração do filme");
        filmes.setNr_duracao(leitor.nextInt());
        System.out.println("Selecione o tipo do filme: " +
                "1 - açao\t2 - Aventura\t3 - Comedia\t4-Drama \t5-FIcção cientifica\t" +
                "6-Terror\t7-Suspence\t8-Romance\t9-Fantasia\t10-Guerra\t" +
                "11-Faroeste\t12-Animação\t13-Musical\t14-Policial\t15Docmentario-");
        int op = leitor.nextInt();
        switch (op){
            case 1: filmes.setTp_genero(GeneroEnum.ACAO);break;
            case 2: filmes.setTp_genero(GeneroEnum.AVENTURA);break;
            case 3: filmes.setTp_genero(GeneroEnum.COMEDIA);break;
            case 4: filmes.setTp_genero(GeneroEnum.DRAMA);break;
            case 5: filmes.setTp_genero(GeneroEnum.FICCAO_CIENTIFICA);break;
            case 6: filmes.setTp_genero(GeneroEnum.TERROR);break;
            case 7: filmes.setTp_genero(GeneroEnum.SUSPENSE);break;
            case 8: filmes.setTp_genero(GeneroEnum.ROMANCE);break;
            case 9: filmes.setTp_genero(GeneroEnum.FANTASIA);break;
            case 10: filmes.setTp_genero(GeneroEnum.GUERRA);break;
            case 11: filmes.setTp_genero(GeneroEnum.FAROESTE);break;
            case 12: filmes.setTp_genero(GeneroEnum.ANIMACAO);break;
            case 13: filmes.setTp_genero(GeneroEnum.MUSICAL);break;
            case 14: filmes.setTp_genero(GeneroEnum.POLICIAL);break;
            case 15: filmes.setTp_genero(GeneroEnum.DOCUMENTARIO);break;
        }
        System.out.println("Selhecione a classificação indicativa");



    }
}
