package techShop;

// Serviço de cobrança recorrente por período
public class Assinatura extends Produto {
    private int meses;

    public Assinatura(String codigo, String nome, double precoBase, int estoque, int meses) {
        super(codigo, nome, precoBase, estoque);
        this.meses = meses;
    }

    // Aplica 10% de desconto para planos a partir de 6 meses
    @Override
    public double calcularPrecoFinal() {
        double total = getPrecoBase() * meses;
        return (meses >= 6) ? total * 0.90 : total;
    }

    public int getMeses(){
        return meses;
    }
}