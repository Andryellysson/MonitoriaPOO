package techShop;

// Estrutura abstrata base para todos os itens comercializados
public abstract class Produto {
    private String codigo;
    private String nome;
    private double precoBase;
    private int estoque;

    // Valida se o preço base informado é positivo
    public Produto(String codigo, String nome, double precoBase, int estoque) {
        if (precoBase < 0) {
            throw new IllegalArgumentException("Preço base não pode ser negativo");
        }
        this.codigo = codigo;
        this.nome = nome;
        this.precoBase = precoBase;
        this.estoque = estoque;
    }

    // Cálculo específico do preço redefinido nas subclasses
    public abstract double calcularPrecoFinal();

    // Exibe o resumo chamando o cálculo de preço polimórfico
    public String exibirResumo() {
        return codigo + " " + nome + ": R$ " + calcularPrecoFinal();
    }

    // Decrementa o estoque após a confirmação do item
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
