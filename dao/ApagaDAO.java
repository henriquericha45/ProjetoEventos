package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ApagaDAO {
    private Conexao conexao;

    public ApagaDAO() {
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

    public void apagaEvento(int id) {

        PreparedStatement ps;
        String query = "DELETE FROM evento WHERE id = ?";

        try {
            ps = conexao.getConnection().prepareStatement(query);
            ps.setInt(1, id);
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    
}
