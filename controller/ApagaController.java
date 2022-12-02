package controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import dao.ApagaDAO;
import view.ApagaView;

public class ApagaController {
    
    public ApagaController() {
        ApagaView apagaView = new ApagaView();
        ApagaDAO apagaDAO = new ApagaDAO();

        int id = apagaView.getId();

        boolean idExiste = false;

        ResultSet rs = apagaDAO.listaIdsExistentes();

        if(rs == null) {
            apagaView.error();
        } else {
            try {
                while(rs.next()) {
                    if(rs.getInt("id") == id) {
                        idExiste = true;
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(idExiste) {
            apagaDAO.apagaEvento(id);
            apagaView.success();
        } else {
            apagaView.idNaoExiste();
        }
    }
}
