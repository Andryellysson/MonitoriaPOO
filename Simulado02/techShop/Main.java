package techShop;

// Classe de execução para testar todos os cenários da loja
public class Main {
    public static void main(String[] args) {
        ClienteVip clienteVip = new ClienteVip("Andryellysson", "123.456.789-10", "andryellysson@mail.com", "62215-000", 0.10);

        ProdutoFisico teclado = new ProdutoFisico("F01", "Teclado", 100.0, 5, 0.8);
        ProdutoDigital ebook = new ProdutoDigital("D01", "E-book Java", 50.0, 999, 12);
        Assinatura streaming = new Assinatura("S01", "Streaming", 20.0, 999, 6);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        try {
            carrinho.adicionar(teclado, 1);
            carrinho.adicionar(ebook, 1);
            carrinho.adicionar(streaming, 1);
        } catch (EstoqueInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        // Pagamento via PIX finalizado com sucesso
        System.out.println("PIX");
        Pedido pedido1 = new Pedido(clienteVip, carrinho);
        pedido1.finalizar(new PagamentoPix());

        // Força a recusa por limite de cartão de crédito
        System.out.println("\nCartão");
        Pedido pedido2 = new Pedido(clienteVip, carrinho);
        pedido2.finalizar(new PagamentoCartao(6, 50.0));
    }
}