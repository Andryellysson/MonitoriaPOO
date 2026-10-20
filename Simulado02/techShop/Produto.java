package techShop;

public abstract class Produto {
    private String codigo;
    private String nome;
    private double precoBase;
    private int estoque;

    public Produto(String codigo, String nome, double precoBase, int estoque) {
        if (precoBase < 0) {
            throw new IllegalArgumentException("Preço base não pode ser negativo");
        }
        this.codigo = codigo;
        this.nome = nome;
        this.precoBase = precoBase;
        this.estoque = estoque;
    }

    public abstract double calcularPrecoFinal();

    public String exibirResumo() {
        return codigo + " " + nome + ": R$ " + calcularPrecoFinal();
    }

    public void baixarEstoque(int quantidade) {
        this.estoque -= quantidade;
    }

    public String getCodigo(){
        return codigo;
    }

    public String getNome(){
        return nome;
    }

    public double getPrecoBase(){
        return precoBase;
    }

    public int getEstoque(){
        return estoque;
    }
}
