package br.com.fiap.dao;

import br.com.fiap.enums.ClassificacaoIndicativaEnum;
import br.com.fiap.enums.GeneroEnum;
import br.com.fiap.models.Filmes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FilmeDao {
    private Connection conexao;


    public void cadastrarFilme(Filmes filme){
        conexao = ConnectionFactory.obterConexao();
        PreparedStatement comandoSQL = null;
        try{
            String sql = "INSERT INTO TBL_filme (id_filme, tx_nome," +
                    " nr_duracao, tp_genero, tp_classificacao, nr_ano, tx_capa,tx_diretor," +
                    " tx_elenco,tx_descricao,nr_avaliacao) \n" +
                    "VALUES (?, ?, ?, ?, ?, ?, ? ,? ,? ,? ,?)";

            comandoSQL = conexao.prepareStatement(sql);
            comandoSQL.setLong(1, filme.getId_filme());
            comandoSQL.setString(2, filme.getTx_nome());
            comandoSQL.setInt(3, filme.getNr_duracao());
            comandoSQL.setString(4, filme.getTp_genero().toString());
            comandoSQL.setString(5, filme.getTp_classificacao().toString());
            comandoSQL.setInt(6, filme.getNr_ano());
            comandoSQL.setString(7, filme.getTx_capa());
            comandoSQL.setString(8, filme.getTx_diretor());
            comandoSQL.setString(9, filme.getTx_elenco());
            comandoSQL.setString(10, filme.getTx_descricao());
            comandoSQL.setDouble(11, filme.getNr_avaliacao());
            comandoSQL.executeUpdate();
            comandoSQL.close();
            conexao.close();

        }catch (SQLException e){
            e.printStackTrace();
        }
    }


    //buscar todos os filmes caastrados
    public List<Filmes> listarFilme(){
        List<Filmes> listaFilme = new ArrayList<>();
        conexao = ConnectionFactory.obterConexao();
        PreparedStatement ps= null;
        try{
            ps = conexao.prepareStatement("SELECT * FROM tbl_filme order by tx_nome ");
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Filmes filme =new Filmes();
                filme.setId_filme(rs.getLong(1));
                filme.setTx_nome(rs.getString(2));
                filme.setNr_duracao(rs.getInt(3));
                filme.setTp_genero(GeneroEnum.valueOf(rs.getString(4)));
                filme.setTp_classificacao(ClassificacaoIndicativaEnum.valueOf(rs.getString(5)));
                filme.setNr_ano(rs.getInt(6));
                filme.setTx_capa(rs.getString(7));
                filme.setTx_diretor(rs.getString(8));
                filme.setTx_elenco(rs.getString(9));
                filme.setTx_descricao(rs.getString(10));
                filme.setNr_avaliacao(rs.getDouble(11));
                listaFilme.add(filme);

            }
            ps.close();
            conexao.close();

        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        return listaFilme;
    }
}
