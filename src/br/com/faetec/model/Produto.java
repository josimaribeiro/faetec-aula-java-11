package br.com.faetec.model;

public class Produto {

    private int id;
    private String descricao;
    private double preco;

    public Produto() {
        System.out.println("Construtor vazio usado");
    }

    public Produto(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Produto(int id, String descricao, double preco) {
        System.out.println("Construtor completo");
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }
}
