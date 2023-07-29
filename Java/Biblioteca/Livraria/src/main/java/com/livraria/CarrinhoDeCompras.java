package com.livraria;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Object> itens;

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
        for (Object item : itens) {
            if (item instanceof Livro) {
                Livro livro = (Livro) item;
                total += livro.getPreco();
            }
        }
        return total;
    }

    public void exibirCarrinho() {
        System.out.println("Carrinho de Compras:");
        for (Object item : itens) {
            if (item instanceof Livro) {
                Livro livro = (Livro) item;
                String tipoLivro = (livro instanceof LivroFisico) ? "Livro Físico" : "Ebook";
                System.out.println(tipoLivro + " - " + livro.getTitulo() + " - R$" + livro.getPreco());
            }
        }
        System.out.println("Total da compra: R$" + calcularTotal());
    }
}


