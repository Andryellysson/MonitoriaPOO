package techShop;

// Cliente especial com percentual de desconto exclusivo
public class ClienteVip extends Cliente {
    private double percentualDesconto;

    public ClienteVip(String nome, String cpf, String email, String endereco, double percentualDesconto) {
        super(nome, cpf, email, endereco);
        this.percentualDesconto = percentualDesconto;
    }

    // Reaproveita a saída da superclasse adicionando o selo VIP
    @Override
    public String toString() {
        return super.toString() + " | VIP (" + (percentualDesconto * 100) + "%)";
    }

    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(double percentualDesconto){
        this.percentualDesconto = percentualDesconto;
    }
}