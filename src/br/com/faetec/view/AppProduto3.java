package br.com.faetec.view;

import br.com.faetec.model.Produto;

import java.util.Locale;
import java.util.Scanner;

public class AppProduto3 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Produto[] produtos = new Produto[4];

        for (int i = 0; i <produtos.length ; i++) {
            System.out.println("Digite o id do item : ");
            int id = scanner.nextInt();
            System.out.println("Digite a descrição do item : ");
            String descricao =scanner.next();
            System.out.println("Digite o preco : ");
            double preco =scanner.nextDouble();
            produtos[i] = new Produto(id,descricao,preco);
        }
        scanner.close();

        for (int i = 0; i < produtos.length; i++) {
            System.out.println(produtos[i]);
        }
        // enhanced for = for aprimorado
        System.out.println("___________________");
        // para cada objeto do tipo Produto
        // dentro do array produtos, crie uma variável p que representa
        //  o objeto  e execute o codigo de exibição
        for(Produto p : produtos){
            System.out.println(p);
        }

    }

}
