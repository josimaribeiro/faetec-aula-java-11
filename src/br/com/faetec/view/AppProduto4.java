package br.com.faetec.view;

import br.com.faetec.model.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class AppProduto4 {


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Produto> listaProduto = new ArrayList<>();
        String resposta = "S";

        while (true) {
            System.out.println("Digite o id do item : ");
            int id = scanner.nextInt();
            System.out.println("Digite a descrição do item : ");
            String descricao = scanner.next();
            System.out.println("Digite o preco : ");
            double preco = scanner.nextDouble();

            Produto p = new Produto(id,descricao,preco);

            listaProduto.add(p);


            System.out.println("Deseja continuar? (S/N): ");
            resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase("N")) {
                break;
            }
        }
        scanner.close();
        for(Produto p : listaProduto ){
            System.out.println(p);
        }
    }
}
