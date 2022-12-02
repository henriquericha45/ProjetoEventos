package view;

import java.util.Scanner;

public class MenuView {
    Scanner sc;
    public MenuView() {
        sc = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("################");
        System.out.println("#     Menu     #");
        System.out.println("################");
        System.out.println("1 - Cadastrar Evento");
        System.out.println("2 - Listar Evento");
        System.out.println("3 - Atualizar Evento");
        System.out.println("4 - Apagar Evento");
        System.out.println("5 - Sair");
    }

    public int getOption() {
        return sc.nextInt();
    }

    public void shutdown() {
        System.out.println("Saindo...");
    }

    public void notAvailableOption() {
        System.out.println("Opção inválida");
    }
}
