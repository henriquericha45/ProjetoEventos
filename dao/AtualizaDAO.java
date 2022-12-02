package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Evento;

public class AtualizaDAO {
    private Conexao conexao;

    public AtualizaDAO() {
        conexao = new Conexao();
    }

    public ResultSet listaIdsExistentes() {
        String query = "SELECT * FROM evento";
        PreparedStatement ps;
        ResultSet rs;

        try {
            ps = conexao.getConnection().prepareStatement(query);
            rs = ps.executeQuery();

            return rs;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void atualizaEvento(Evento evento) {
        PreparedStatement ps;
        String query = "UPDATE evento SET nome = ?, data = ?, cidade = ?, endereco = ?, preco = ?, quantidade = ? WHERE id = ?";
    
        try {
            ps = conexao.getConnection().prepareStatement(query);
            
            ps.setString(1, evento.getNome());
            ps.setString(2, evento.getData());
            ps.setString(3, evento.getCidade());
            ps.setString(4, evento.getEndereco());
            ps.setDouble(5, evento.getPrecoIngresso());
            ps.setInt(6, evento.getQuantidade());
            ps.setInt(7, evento.getId());
    
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
