package retangulo;

public class Main {
    public static void main(String[] args){
        Retangulo rt = new Retangulo(5,5);

        System.out.println("Eh um quadrado: " + rt.isQuadrado());
        System.out.println("Area da figura: " + rt.calcularArea());
    }
}
