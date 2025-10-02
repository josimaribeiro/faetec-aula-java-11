package br.com.faetec.view;


import br.com.faetec.model.Produto;

import java.util.Locale;
import java.util.Scanner;

public class AppProduto2 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Produto[] produtos = new Produto[4];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < produtos.length; i++) {

            produtos[i] = new Produto();

            System.out.println("Digite o id do item : " + (i+1) );
            produtos[i].setId(scanner.nextInt());
            System.out.println("Digite a descrição do item : ");
            produtos[i].setDescricao(scanner.next());
            System.out.println("Digite o preco : ");
            produtos[i].setPreco(scanner.nextFloat());


        }
        scanner.close();

        for (int i = 0; i < produtos.length; i++) {
            System.out.println(produtos[i]);
        }

    }
}
