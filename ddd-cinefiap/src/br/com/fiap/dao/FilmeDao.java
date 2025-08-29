package br.com.fiap.dao;

import br.com.fiap.models.Filmes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
}
