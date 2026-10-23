package techShop;

// Contrato para produtos que necessitam de transporte e prazo
public interface Entregavel {
    double calcularFrete(String cep);
    int prazoEntregaDias();
}