package techShop;

import java.util.ArrayList;
import java.util.List;

// Gerencia os itens selecionados e os cálculos de subtotal/frete
public class CarrinhoDeCompras {
    private List<Produto> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    // Sobrecarga que valida a disponibilidade do estoque antes de adicionar
    public void adicionar(Produto p) throws EstoqueInsuficienteException {
        adicionar(p, 1);
    }

    public void adicionar(Produto p, int quantidade) throws EstoqueInsuficienteException {
        if (quantidade > p.getEstoque()) {
            throw new EstoqueInsuficienteException(p.getNome(), p.getEstoque());
        }
        for (int i = 0; i < quantidade; i++) {
            this.itens.add(p);
        }
    }

    // Soma o preço final de cada item do carrinho
    public double calcularTotal() {
        double soma = 0;
        for (Produto p : itens) {
            soma += p.calcularPrecoFinal();
        }
        return soma;
    }

    // Calcula o frete apenas para produtos que implementam a interface Entregavel
    public double calcularFreteTotal(String cep) {
        double somaFrete = 0;
        for (Produto p : itens) {
            if (p instanceof Entregavel) {
                somaFrete += ((Entregavel) p).calcularFrete(cep);
            }
        }
        return somaFrete;
    }

    public List<Produto> getItens() { return itens; }
}
