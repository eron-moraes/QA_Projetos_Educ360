package com.livraria;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        int opcao;
        do {
            System.out.println("\nBem vindo a nossa livraria");
            System.out.println("1- Escolher e digitar Livro fisico");
            System.out.println("2- Escolher e digitar Ebook");
            System.out.println("3- Exibir Carrinho de Compras");
            System.out.println("4- Sair");
           
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cadastrarLivroFisico();
                    break;
                case 2:
                    cadastrarEbook();
                    break;
                case 3:
                    exibirCarrinhoDeCompras();
                    break;
                case 4:
                    System.out.println("Obrigado por utilizar nossa livraria!");
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente!");
            }
        } while (opcao != 4);
    }

    private static void cadastrarLivroFisico() {
        System.out.print("Digite o titulo do livro fisico: ");
        scanner.nextLine();
        String titulo = scanner.nextLine();
        System.out.print("Digite o preco do livro fisico: ");
        double preco = scanner.nextDouble();

        LivroFisico livroFisico = new LivroFisico(titulo, preco);
        carrinho.adicionarItem(livroFisico);
        System.out.println("Livro fisico cadastrado com sucesso!");
    }

    private static void cadastrarEbook() {
        System.out.print("Digite o titulo do ebook: ");
        scanner.nextLine();
        String titulo = scanner.nextLine();
        System.out.print("Digite o preco do ebook: ");
        double preco = scanner.nextDouble();

        Ebook ebook = new Ebook(titulo, preco);
        carrinho.adicionarItem(ebook);
        System.out.println("Ebook cadastrado com sucesso!");
    }

    private static void exibirCarrinhoDeCompras() {
        carrinho.exibirCarrinho();
    }
}
