package view;

import java.util.List;

import model.Evento;

public class ListarView {

    public void displayEventos(List<Evento> eventos) {
        String line = "-------------------------------------";
        
        for(Evento evento : eventos) {
            System.out.println(line);
            System.out.println("Id: " + evento.getId());
            System.out.println("Nome: " + evento.getNome());
            System.out.println("Data: " + evento.getData());
            System.out.println("Cidade: " + evento.getCidade());
            System.out.println("Endereço: " + evento.getEndereco());
            System.out.println("Preço do ingresso: " + evento.getPrecoIngresso());
            System.out.println("Quantidade de ingressos: " + evento.getQuantidade());
        }
        System.out.println(line);

    }

    public void displayListingError() {
        System.out.println("Erro ao listar os eventos! ");
    }
    
}
