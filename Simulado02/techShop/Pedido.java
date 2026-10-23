package techShop;

// Consolida o pedido, aplica descontos VIP, atribui pontos e trata excepções
public class Pedido {
    private Cliente cliente;
    private CarrinhoDeCompras carrinho;

    public Pedido(Cliente cliente, CarrinhoDeCompras carrinho) {
        this.cliente = cliente;
        this.carrinho = carrinho;
    }

    // Método finalizar estritamente conforme os 5 passos da Questão 6
    public void finalizar(Pagamento pagamento) {
        try {
            // Calcula o subtotal (itens + frete para o CEP do cliente)
            double subtotal = carrinho.calcularTotal() + carrinho.calcularFreteTotal(cliente.getEndereco());

            // Se o cliente for ClienteVip, aplica o percentualDesconto dele sobre o subtotal
            if (cliente instanceof ClienteVip) {
                ClienteVip vip = (ClienteVip) cliente;
                subtotal -= subtotal * vip.getPercentualDesconto();
            }

            // Calcula o valor final com a forma de pagamento e chama exibirComprovante
            double valorFinal = pagamento.calcularValorFinal(subtotal);
            pagamento.exibirComprovante(subtotal);

            // Adiciona ao cliente 1 ponto de fidelidade a cada R$ 10,00 pagos
            int pontosGanhos = (int) (valorFinal / 10);
            cliente.adicionarPontos(pontosGanhos);

        } catch (PagamentoRecusadoException e) {
            // Captura PagamentoRecusadoException imprimindo a mensagem"
            System.out.println("Pagamento recusado: " + e.getMessage());
        } finally {
            // Imprime essa mensagem em qualquer caso
            System.out.println("Pedido encerrado");
        }
    }
}