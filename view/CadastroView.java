package view;

import java.util.Scanner;

public class CadastroView {
    Scanner sc;

    public CadastroView() {
        sc = new Scanner(System.in);
    }

    public String getNome() {
        System.out.println("Digite o nome do evento: ");
        return sc.nextLine();
    }

    public String getData() {
        System.out.println("Digite a data do evento: ");
        return sc.nextLine();
    }

    public String getCidade() {
        System.out.println("Digite a cidade do evento: ");
        return sc.nextLine();
    }

    public String getEndereco() {
        System.out.println("Digite o endereço do evento: ");
        return sc.nextLine();
    }

    public double getPrecoIngresso() {
        System.out.println("Digite o preço do ingresso: ");
        return sc.nextDouble();
    }

    public int getQuantidade() {
        System.out.println("Digite a quantidade de ingressos: ");
        return sc.nextInt();
    }

    public void success() {
        System.out.println("Evento cadastrado com sucesso!");
    }

}
