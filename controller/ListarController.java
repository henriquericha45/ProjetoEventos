package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dao.ListarDAO;
import model.Evento;
import view.ListarView;

public class ListarController {
    private ArrayList<Evento> eventos;
    
    public ListarController() {
        this.eventos = new ArrayList<Evento>();
        ResultSet rs = new ListarDAO().listarEventos();
        ListarView listarView = new ListarView();
        if(rs == null) {
            listarView.displayListingError();
        } else {
            try {
                while(rs.next()) {
                    int id = rs.getInt("id");
                    String nome = rs.getString("nome");
                    String data = rs.getString("data");
                    String cidade = rs.getString("cidade");
                    String endereco = rs.getString("endereco");
                    double preco = rs.getDouble("preco");
                    int quantidade = rs.getInt("quantidade");
    
                    Evento evento = new Evento(id, nome, data, cidade, endereco, preco, quantidade);
                    eventos.add(evento);
    
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            listarView.displayEventos(eventos);
        }
    }
}
