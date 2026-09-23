package analiseCodigo;

public class Produto {
    public String nome;
    private static double preco;
    final int codigo;

    public Produto(String nome) {
        codigo = "A100"; // codigo é int, mas "A100" é String
        nome = nome;     // era para ser this.nome = nome;
    }

    public static void aplicarDesconto(double porcentagem) {
        preco = preco - (preco * (porcentagem / 100));
        System.out.println("Produto: " + nome); // método static não pode acessar atributo de instância
    }

    public void setCodigo(int novoCodigo) {
        this.codigo = novoCodigo; // codigo é final, não pode ser alterado
    }

    public void getPreco() {
        return preco; // método void não retorna valor
    }

    public static void main(String[] args) {
        Produto p1 = new Produto("Teclado");
        p1.preco = 150.0;
        p1.codigo = 500; // codigo é final e foi inicializado no construtor

        double valor = p1.getPreco(); // o método é void, não retorna double
        System.out.println("Valor: " + valor);

        Produto.aplicarDesconto(10);
    }
}