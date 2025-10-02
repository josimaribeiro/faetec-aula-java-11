package br.com.faetec.view;


import br.com.faetec.model.Produto;

import java.util.Scanner;

public class AppProduto2 {


    public static void main(String[] args) {

        Produto[] produtos = new Produto[4];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i <produtos.length ; i++) {

            System.out.println("Digite o id : ");
            produtos[i].setId(scanner.nextInt());
            System.out.println("Digite a descrição : ");
            produtos[i].setDescricao(scanner.next());

            System.out.println("Digite o preco : ");
            produtos[i].setPreco(scanner.nextFloat());



        }



        scanner.close();


    }

}
