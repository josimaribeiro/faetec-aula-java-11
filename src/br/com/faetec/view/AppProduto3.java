package br.com.faetec.view;

import br.com.faetec.model.Produto;

import java.util.Locale;
import java.util.Scanner;

public class AppProduto3 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o id do item : ");
        int id = scanner.nextInt();
        System.out.println("Digite a descrição do item : ");
        String descricao =scanner.next();
        System.out.println("Digite o preco : ");
        double preco =scanner.nextFloat();












        scanner.close();
    }

}
