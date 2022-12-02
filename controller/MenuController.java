package controller;

import view.MenuView;

public class MenuController {
    public MenuController() {
        MenuView menuView = new MenuView();
        boolean running = true;
        int option;
        while(running) {
            menuView.displayMenu();
            option = menuView.getOption();
            if(option == 1) {
                // cadastra evento
                new CadastroController();
            } else if(option == 2) {
                // lista eventos
                new ListarController();
            } else if(option == 3) {
                // atualiza evento
                new AtualizaController();
            } else if(option == 4) {
                // apaga evento
                new ApagaController();
            } else if(option == 5) {
                // encerra programa
                running = false;
                menuView.shutdown();
            } else {
                menuView.notAvailableOption();
            }

        }

    }
}
