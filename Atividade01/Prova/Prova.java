package Prova;

public class Prova {
    private String nome;
    private int matricula;
    private char[] resultado = new char[6];

    public Prova(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    public int getMatricula(){
        return this.matricula;
    }

    public void respostaAluno(char[] resposta) {
        this.resultado = resposta;
    }

    public int acertos(char[] gabarito) {
        int qtd = 0;
        for (int i = 0; i < gabarito.length; i++){
            if (this.resultado[i] == gabarito[i]){
                qtd++;
            }
        }
        return qtd;
    }

    public int nota(char[] gabarito){
        int nota = 0;

        for (int i = 0; i < 3; i++){
            if (this.resultado[i] == gabarito[i]){
                nota++;
            }
        }

        for(int j = 3; j < 6; j++){
            if (this.resultado[j] == gabarito[j]){
                nota+=2;
            }
        }
        return nota;
    }

    public static class Main {
        public static void main(String[] args) {
            Prova aluno1 = new Prova("Andryellysson", 123);
            Prova aluno2 = new Prova("Alan", 456);

            char[] respostasAluno1 = {'A', 'B', 'C', 'D', 'A', 'B'};
            char[] respostasAluno2 = {'A', 'B', 'A', 'D', 'A', 'C'};

            aluno1.respostaAluno(respostasAluno1);
            aluno2.respostaAluno(respostasAluno2);

            char[] gabarito = {'A', 'B', 'C', 'D', 'A', 'A'};

            System.out.println(aluno1.getNome() + " acertou: " + aluno1.acertos(gabarito));
            System.out.println(aluno1.getNome() + " nota: " + aluno1.nota(gabarito));

            System.out.println(aluno2.getNome() + " acertou: " + aluno2.acertos(gabarito));
            System.out.println(aluno2.getNome() + " nota: " + aluno2.nota(gabarito));
        }
    }
}