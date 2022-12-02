package view;

import java.util.Scanner;

public class ApagaView {
    Scanner sc;

    public ApagaView() {
        sc = new Scanner(System.in);
    }

    public int getId() {
        System.out.println("Digite o id do evento que deseja apagar? ");
        int id = sc.nextInt();
        return id;
    }

    public void success() {
        System.out.println("Evento apagado com sucesso!");
    }

    public void idNaoExiste() {
        System.out.println("Id não existe!");
    }

    public void error() {
        System.out.println("Erro ao apagar evento!");
    }
}
