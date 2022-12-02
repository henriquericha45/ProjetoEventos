package view;

import java.util.Scanner;

public class AtualizaView {
    Scanner sc;

    public AtualizaView() {
        sc = new Scanner(System.in);
    }

    public int getId() {
        System.out.println("Digite o id do evento que deseja atualizar? ");
        int id = sc.nextInt();
        return id;
    }

    public String getNome() {
        System.out.println("Digite o novo nome do evento: ");
        String nome = sc.next();
        return nome;
    }

    public String getData() {
        System.out.println("Digite a nova data do evento: ");
        String data = sc.next();
        return data;
    }

    public String getCidade() {
        System.out.println("Digite a nova cidade do evento: ");
        String cidade = sc.next();
        return cidade;
    }

    public String getEndereco() {
        System.out.println("Digite o novo endereço do evento: ");
        String endereco = sc.next();
        return endereco;
    }

    public double getPrecoIngresso() {
        System.out.println("Digite o novo preço do ingresso: ");
        double preco = sc.nextDouble();
        return preco;
    }

    public int getQuantidade() {
        System.out.println("Digite a nova quantidade de ingressos: ");
        int quantidade = sc.nextInt();
        return quantidade;
    }

    public void success() {
        System.out.println("Evento atualizado com sucesso!");
    }

    public void semEventos() {
        System.out.println("Não há eventos para atualizar! ");
    }

    public void idNaoExiste() {
        System.out.println("O id do evento não existe! ");
    }
}
