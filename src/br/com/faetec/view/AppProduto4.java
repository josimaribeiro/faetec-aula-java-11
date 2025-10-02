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

        List<Produto> list = new ArrayList<>();
        String resposta = "S";

        while(true){
            

            System.out.println("Deseja continuar? (S/N): ");
            resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase("N")) {
                break;
            }

        }
        scanner.close();
    }
}
