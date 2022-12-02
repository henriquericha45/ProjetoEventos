package controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import dao.AtualizaDAO;
import model.Evento;
import view.AtualizaView;

public class AtualizaController {

    public AtualizaController() {
        AtualizaView atualizaView = new AtualizaView();
        
        int id = atualizaView.getId();



        String nome = atualizaView.getNome();
        String data = atualizaView.getData();
        String cidade = atualizaView.getCidade();
        String endereco = atualizaView.getEndereco();
        double precoIngresso = atualizaView.getPrecoIngresso();
        int quantidade = atualizaView.getQuantidade();

       AtualizaDAO atualizaDAO = new AtualizaDAO();

       boolean idExiste = false;

        ResultSet rs = atualizaDAO.listaIdsExistentes();

        if(rs == null) {
            atualizaView.semEventos();
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
            atualizaDAO.atualizaEvento(new Evento(id, nome, data, cidade, endereco, precoIngresso, quantidade));
            atualizaView.success();
        } else {
            atualizaView.idNaoExiste();
        }
        



        

    }
}
