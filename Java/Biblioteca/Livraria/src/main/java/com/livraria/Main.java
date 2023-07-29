package com.livraria;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

    public static void main(String[] args) {
        exibirMenuPrincipal();
    }

    private static void exibirMenuPrincipal() {
        int opcao;
        do {
            System.out.println("\nMenu Principal");
            System.out.println("1. Cadastrar Livro");
            System.out.println("2. Cadastrar Ebook");
            System.out.println("3. Exibir Carrinho de Compras");
            System.out.println("4. Sair");
            System.out.print("Faca sua escolha: ");
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
                    System.out.println("Obrigado por utilizar nosso sistema!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);
    }

    private static void cadastrarLivroFisico() {
        System.out.print("Digite o título do livro físico: ");
        scanner.nextLine(); // Consumir a quebra de linha deixada pelo nextInt()
        String titulo = scanner.nextLine();
        System.out.print("Digite o preço do livro físico: ");
        double preco = scanner.nextDouble();

        LivroFisico livroFisico = new LivroFisico(titulo, preco);
        carrinho.adicionarItem(livroFisico);
        System.out.println("Livro físico cadastrado com sucesso!");
    }

    private static void cadastrarEbook() {
        System.out.print("Digite o título do ebook: ");
        scanner.nextLine(); // Consumir a quebra de linha deixada pelo nextInt()
        String titulo = scanner.nextLine();
        System.out.print("Digite o preço do ebook: ");
        double preco = scanner.nextDouble();

        Ebook ebook = new Ebook(titulo, preco);
        carrinho.adicionarItem(ebook);
        System.out.println("Ebook cadastrado com sucesso!");
    }

    private static void exibirCarrinhoDeCompras() {
        carrinho.exibirCarrinho();
    }
}
