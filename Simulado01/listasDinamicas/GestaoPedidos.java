package listasDinamicas;
import java.util.ArrayList;

public class GestaoPedidos {

    private ArrayList<String> pedidos;

    public GestaoPedidos() {
        this.pedidos = new ArrayList<>();
    }

    public void adicionarPedido(String item) {
        this.pedidos.add(item);
    }

    public String proximoPedido() {
        if (this.pedidos.isEmpty()) {
            return "Fila Vazia";
        }

        return this.pedidos.remove(0);
    }

    public int quantidadePendentes() {
        return this.pedidos.size();
    }

    public void listarPedidos() {
        for (String pedido : this.pedidos) {
            System.out.println(pedido);
        }
    }
}