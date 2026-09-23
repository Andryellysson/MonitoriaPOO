package composicao;

public class Livro {
    private String titulo;
    private double preco;
    private Autor autor;

    public Livro(String titulo, double preco, Autor autor){
        this.titulo = titulo;
        this.preco = preco;
        this.autor = autor;
    }

    public void exibirDetalhes(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Nome: " + this.autor.getNome());
        System.out.println("Preço: " + this.preco);
    }
}
