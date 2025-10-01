package br.com.faetec.view;

import br.com.faetec.model.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppProduct {

    public static void main(String[] args) {
        
        // 1. Criar os objetos produto1, 2, 3 e 4 e atribuir valores
        System.out.println("--- 1. Criação dos Produtos e Atribuição de Valores ---");
        
        // Valores atribuídos usando 'double'
        Product produto1 = new Product(1, "Notebook Gamer", 5500.00, 10);
        Product produto2 = new Product(2, "Mouse Sem Fio", 120.50, 55);
        Product produto3 = new Product(3, "Monitor Ultrawide", 1899.99, 5);
        Product produto4 = new Product(4, "Teclado Mecânico", 450.00, 20);

        // 2. Chamar o método toString() de cada produto
        System.out.println("\n--- 2. Chamada do toString() ---");
        System.out.println("Produto 1: " + produto1);
        System.out.println("Produto 2: " + produto2);
        System.out.println("Produto 3: " + produto3);
        System.out.println("Produto 4: " + produto4);
        
        System.out.println("\n--- 3. Teste de Operações Inventadas ---");
        // Teste de operações inventadas
        produto1.removerEstoque(2); // Venda de 2 notebooks
        produto2.adicionarEstoque(10); // Recebimento de mais 10 mouses
        produto3.removerEstoque(10); // Tentativa de remover mais do que tem (deve falhar)
        
        // 4. Testar um ArrayList com os 4 produtos
        System.out.println("\n--- 4. Uso de ArrayList com os 4 Produtos ---");
        List<Product> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);
        listaDeProdutos.add(produto4);
        
        System.out.println("Produtos no ArrayList:");
        for (Product p : listaDeProdutos) {
            System.out.println("- " + p);
        }
        
        // 5. List dentro de um while permitindo incluir vários (Simulação simples com Scanner)
        System.out.println("\n--- 5. Inclusão Dinâmica de Produtos ---");
        Scanner scanner = new Scanner(System.in);
        int proximoId = 5; // Começa após o ID 4
        String resposta = "S";
        
        while (resposta.equalsIgnoreCase("S")) {
            System.out.print("Deseja incluir um novo produto? (S/N): ");
            resposta = scanner.nextLine();
            
            if (resposta.equalsIgnoreCase("S")) {
                System.out.print("Descrição do novo produto: ");
                String descricao = scanner.nextLine();
                
                try {
                    System.out.print("Preço do produto: ");
                    // Lê o preço como double
                    double preco = Double.parseDouble(scanner.nextLine()); 
                    
                    System.out.print("Quantidade em estoque: ");
                    int qtdEstoque = Integer.parseInt(scanner.nextLine());

                    Product novoProduto = new Product(proximoId++, descricao, preco, qtdEstoque);
                    listaDeProdutos.add(novoProduto);
                    System.out.println("Produto '" + descricao + "' adicionado com sucesso!");
                } catch (NumberFormatException e) {
                    System.out.println("ERRO: Preço ou Estoque inválido. Produto não adicionado.");
                    proximoId--; 
                }
            }
        }

        // 6. Invente algumas operações (Filtrar produtos caros, calcular valor total do estoque)
        System.out.println("\n--- 6. Operações Avançadas com a Lista ---");
        
        // A) Filtrar produtos com preço superior a R$ 500,00
        double precoLimite = 500.00;
        List<Product> produtosCaros = listaDeProdutos.stream()
            .filter(p -> p.getPreco() > precoLimite)
            .collect(Collectors.toList());
        
        System.out.printf("Produtos com Preço > R$%.2f:%n", precoLimite);
        produtosCaros.forEach(p -> System.out.printf(" > %s (R$%.2f)%n", p.getDescricao(), p.getPreco()));
        
        // B) Calcular o valor total em estoque (Preço * Quantidade)
        double valorTotalEstoque = listaDeProdutos.stream()
            .mapToDouble(p -> p.getPreco() * p.getQtdEstoque())
            .sum();

        System.out.printf("\nValor TOTAL do Estoque da Empresa: R$%.2f%n", valorTotalEstoque);

        scanner.close();
    }
}