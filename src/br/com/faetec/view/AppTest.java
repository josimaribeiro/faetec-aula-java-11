package br.com.faetec.view;

import java.util.Scanner;

public class AppTest {

    public static void main(String[] args) {

        //nextLine() (já citado) – Lê uma linha inteira de texto,
        // incluindo espaços. Ele lê tudo até que o usuário pressione "Enter".
        Scanner scanner = new Scanner(System.in);
        String linha = scanner.nextLine();
        System.out.println("Você digitou: " + linha);


        //next() (já citado) – Lê até o primeiro espaço ou quebra de linha.
        // Ele só captura a próxima palavra, ignorando espaços extras.


        String palavra = scanner.next();
        System.out.println("Você digitou: " + palavra);

    }

}
