package com.livraria;

//Main.java
public class Main {
 public static void main(String[] args) {
     LivroFisico livroFisico = new LivroFisico("Livro1", 49.90);
     Ebook ebook = new Ebook("Ebook1", 19.99);

     CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
     carrinho.adicionarItem(livroFisico);
     carrinho.adicionarItem(ebook);

     carrinho.exibirCarrinho();
 }
}

