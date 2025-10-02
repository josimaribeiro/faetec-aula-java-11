package br.com.faetec.view;

import java.util.Scanner;

public class AppMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("===== MENU DE OPÇÕES =====");
            System.out.println("1 - Executar Opção 1");
            System.out.println("2 - Executar Opção 2");
            System.out.println("3 - Executar Opção 3");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    executarOpcao1();
                    break;
                case 2:
                    executarOpcao2();
                    break;
                case 3:
                    executarOpcao3();
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

            System.out.println(); // linha em branco para separação
        }

        scanner.close();
    }

    // Métodos para cada opção
    public static void executarOpcao1() {
        System.out.println("Executando a Opção 1...");
        // lógica da opção 1 aqui
    }

    public static void executarOpcao2() {
        System.out.println("Executando a Opção 2...");
        // lógica da opção 2 aqui
    }

    public static void executarOpcao3() {
        System.out.println("Executando a Opção 3...");
        // lógica da opção 3 aqui
    }
}
