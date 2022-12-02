package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ListarDAO {
    private Conexao conexao;

    public ListarDAO() {
        conexao = new Conexao();
    }

    public ResultSet listarEventos() {
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
    
}
