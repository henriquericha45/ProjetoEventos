package model;

public class Evento {
    private int id;
    private String nome;
    private String data;
    private String cidade;
    private String endereco;
    private double precoIngresso;
    private int quantidade;

    public Evento(int id, String nome, String data, String cidade, String endereco, double precoIngresso, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.data = data;
        this.cidade = cidade;
        this.endereco = endereco;
        this.precoIngresso = precoIngresso;
        this.quantidade = quantidade;
    }

    public Evento(String nome, String data, String cidade, String endereco, double precoIngresso, int quantidade) {
        this.nome = nome;
        this.data = data;
        this.cidade = cidade;
        this.endereco = endereco;
        this.precoIngresso = precoIngresso;
        this.quantidade = quantidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getPrecoIngresso() {
        return precoIngresso;
    }

    public void setPrecoIngresso(double precoIngresso) {
        this.precoIngresso = precoIngresso;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    
    
}
