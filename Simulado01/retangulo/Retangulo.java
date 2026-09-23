package retangulo;

public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo(){
        this.largura = 1.0;
        this.altura = 1.0;
    }

    public Retangulo(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura(){
        return this.largura;
    }

    public void setLargura(double largura){
        if(largura > 0){
            this.largura = largura;
        }
    }

    public double getAltura(){
        return this.altura;
    }

    public void setAltura(double altura){
        if(altura > 0){
            this.altura = altura;
        }
    }

    public double calcularArea(){
        return this.largura * this.altura;
    }

    public boolean isQuadrado(){
        return this.largura == this.altura;
    }
}
