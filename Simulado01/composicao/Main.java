package composicao;

public class Main {
    public static void main(String[] args){
        Autor at = new Autor("Andryellysson", "Brasil");
        Livro lv = new Livro("Naquele Tempo", 67, at);

        lv.exibirDetalhes();
    }
}
