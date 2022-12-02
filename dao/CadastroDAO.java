package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Evento;

public class CadastroDAO {
    private Conexao conexao;
    private PreparedStatement ps;

    public CadastroDAO(Evento evento) {
        conexao = new Conexao();
    
        String query = "INSERT INTO evento (nome, data, cidade, endereco, preco, quantidade) VALUES (?, ?, ?, ?, ?, ?)";
    
        try {
            ps = conexao.getConnection().prepareStatement(query);
            
            ps.setString(1, evento.getNome());
            ps.setString(2, evento.getData());
            ps.setString(3, evento.getCidade());
            ps.setString(4, evento.getEndereco());
            ps.setDouble(5, evento.getPrecoIngresso());
            ps.setInt(6, evento.getQuantidade());
    
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
