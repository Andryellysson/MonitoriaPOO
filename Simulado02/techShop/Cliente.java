package techShop;

// Representa o comprador e gerencia os pontos de fidelidade
public class Cliente extends Pessoa {
    private String endereco;
    private int pontosFidelidade;

    public Cliente(String nome, String cpf, String email, String endereco) {
        super(nome, cpf, email);
        this.endereco = endereco;
        this.pontosFidelidade = 0;
    }

    // Acumula pontos no programa de fidelidade
    public void adicionarPontos(int pontos) {
        this.pontosFidelidade += pontos;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public int getPontosFidelidade(){
        return pontosFidelidade;
    }
}
