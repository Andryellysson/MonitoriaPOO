package techShop;

// Exceção não checada para falhas no processamento da cobrança
public class PagamentoRecusadoException extends RuntimeException {
    public PagamentoRecusadoException(String mensagem) {
        super(mensagem);
    }
}
