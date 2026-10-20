package techShop;

public class Pedido {
    private Cliente cliente;
    private CarrinhoDeCompras carrinho;

    public Pedido(Cliente cliente, CarrinhoDeCompras carrinho) {
        this.cliente = cliente;
        this.carrinho = carrinho;
    }

    public void finalizar(Pagamento pagamento) {
        try {
            double subtotal = carrinho.calcularTotal() + carrinho.calcularFreteTotal(cliente.getEndereco());

            if (cliente instanceof ClienteVip) {
                double desconto = ((ClienteVip) cliente).getPercentualDesconto();
                subtotal -= (subtotal * desconto);
            }

            double valorFinal = pagamento.calcularValorFinal(subtotal);
            pagamento.exibirComprovante(subtotal);

            int pontosGanhos = (int) (valorFinal / 10.0);
            cliente.adicionarPontos(pontosGanhos);

        } catch (PagamentoRecusadoException e) {
            System.out.println("Pagamento recusado: " + e.getMessage());
        } finally {
            System.out.println("Pedido encerrado");
        }
    }
}
