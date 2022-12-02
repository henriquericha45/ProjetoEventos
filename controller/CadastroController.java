package controller;

import dao.CadastroDAO;
import model.Evento;
import view.CadastroView;

public class CadastroController {
    
    public CadastroController() {
        CadastroView cadastroView = new CadastroView();

        Evento evento = new Evento(cadastroView.getNome(), cadastroView.getData(), cadastroView.getCidade(), cadastroView.getEndereco(), cadastroView.getPrecoIngresso(), cadastroView.getQuantidade());

        new CadastroDAO(evento);
        cadastroView.success();
    }
    
}
