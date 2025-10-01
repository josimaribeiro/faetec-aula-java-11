package br.com.faetec.model;

import java.util.Objects;

public class Product {
    private int id;
    private String descricao;
    // Alterado para double, conforme solicitado
    private double preco; 
    private int qtdEstoque;

    // Construtor
    public Product(int id, String descricao, double preco, int qtdEstoque) {
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }

    // --- Getters e Setters ---
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
        if (preco >= 0) {
             this.preco = preco;
        } else {
             System.out.println("Erro: Preço não pode ser negativo.");
        }
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        if (qtdEstoque >= 0) {
             this.qtdEstoque = qtdEstoque;
        } else {
             System.out.println("Erro: Quantidade em estoque não pode ser negativa.");
        }
    }
    
    // --- Métodos de Operação ---
    
    /**
     * Adiciona uma quantidade ao estoque.
     * @param quantidade A quantidade a ser adicionada.
     */
    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.qtdEstoque += quantidade;
            System.out.println("Estoque de " + descricao + " atualizado. Novo estoque: " + qtdEstoque);
        } else {
            System.out.println("A quantidade a adicionar deve ser positiva.");
        }
    }

    /**
     * Remove uma quantidade do estoque.
     * @param quantidade A quantidade a ser removida.
     * @return true se a remoção foi bem-sucedida, false caso contrário.
     */
    public boolean removerEstoque(int quantidade) {
        if (quantidade > 0 && this.qtdEstoque >= quantidade) {
            this.qtdEstoque -= quantidade;
            System.out.println("Estoque de " + descricao + " atualizado. Novo estoque: " + qtdEstoque);
            return true;
        } else if (quantidade > this.qtdEstoque) {
            System.out.println("Estoque insuficiente para " + descricao + ". Disponível: " + this.qtdEstoque);
            return false;
        } else {
             System.out.println("A quantidade a remover deve ser positiva.");
             return false;
        }
    }
    
    // Sobrescreve o método toString()
    @Override
    public String toString() {
        // Usando String.format para garantir 2 casas decimais no preço, como em dinheiro.
        return String.format("Produto [ID: %d, Descrição: %s, Preço: R$%.2f, Estoque: %d]", 
                               id, descricao, preco, qtdEstoque);
    }

    // Sobrescreve equals e hashCode (Boa Prática para coleções e comparação)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}