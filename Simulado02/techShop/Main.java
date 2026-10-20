package techShop;

public class Main {
    public static void main(String[] args) {
        try {
            ClienteVip clienteVip = new ClienteVip("Andryellysson Lopes", "123.456.789-10", "andryellyssonlopes@gmail.com", "62215-000", 0.10);

            Produto p1 = new ProdutoFisico("F05", "Mouse Gamer", 150.0, 15, 0.5);
            Produto p2 = new ProdutoDigital("D05", "E-book de Programação em Java", 60.0, 500, 150);
            Produto p3 = new Assinatura("A05", "Game Pass", 40.0, 500, 12);

            CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
            carrinho.adicionar(p1, 1);
            carrinho.adicionar(p2, 1);
            carrinho.adicionar(p3, 1);

            Pedido pedido = new Pedido(clienteVip, carrinho);

            System.out.println("Pix\n");
            Pagamento pix = new PagamentoPix();
            pedido.finalizar(pix);

            System.out.println("\nCartão Recusado\n");
            Pagamento cartao = new PagamentoCartao(6, 50.0);
            pedido.finalizar(cartao);

        } catch (EstoqueInsuficienteException e) {
            System.out.println("Erro ao montar o carrinho: " + e.getMessage());
        }
    }
}