package listasDinamicas;

public class Main {
    public static void main(String[] args) {

        GestaoPedidos gt = new GestaoPedidos();

        gt.adicionarPedido("Pastel");
        gt.adicionarPedido("Coxinha");
        gt.adicionarPedido("Joelho Misto");

        System.out.println("Pedido removido: " + gt.proximoPedido());
        System.out.println("Pedidos pendentes: " + gt.quantidadePendentes());
    }
}
