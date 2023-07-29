package com.livraria;

import java.util.ArrayList;
import java.util.List;

// CarrinhoDeCompras.java
public class CarrinhoDeCompras {
    private List<Livro> itens;

    public CarrinhoDeCompras() {
        itens = new ArrayList<>();
    }

    public void adicionarItem(Livro livro) {
        itens.add(livro);
    }

    public void removerItem(Livro livro) {
        itens.remove(livro);
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Livro livro : itens) {
            total += livro.getPreco();
        }
        return total;
    }

    public void exibirCarrinho() {
        System.out.println("Carrinho de Compras:");
        for (Livro livro : itens) {
            System.out.println(livro.getTitulo() + " - R$" + livro.getPreco());
        }
        System.out.println("Total da compra: R$" + calcularTotal());
    }
}

