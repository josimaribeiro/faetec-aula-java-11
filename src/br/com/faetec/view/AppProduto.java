package br.com.faetec.view;

import br.com.faetec.model.Produto;

public class AppProduto {


    public static void main(String[] args) {

        // criar os objetos
        Produto produto1 = new Produto(789, "Mouse");
        Produto produto2 = new Produto(375, "Teclado");
        Produto produto3 = new Produto(286, "Gabinete");
        Produto produto4 = new Produto(199, "CD-ROM");
        // definir os preços ?
        produto1.setPreco(10.99);
        produto2.setPreco(38.99);
        produto3.setPreco(70.80);
        produto4.setPreco(80.00);

        // exibir os objetos
        System.out.println(produto1);
        System.out.println(produto2);
        System.out.println(produto3);
        System.out.println(produto4);

    }

}





