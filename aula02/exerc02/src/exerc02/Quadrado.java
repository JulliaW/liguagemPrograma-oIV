package exerc02;

public class Quadrado implements IForma {
    public float lado;
    public String nome;
    public double area;

    public Quadrado(float lado, String nome) {
        lado = lado;
        nome = nome;
    }

     @Override
    public void calcularArea() {
        area = lado * lado ;
    }
    
    @Override
    public void imprimir() {
         System.out.println("Nome:" + nome);
         System.out.println("Lado:" + lado);
         System.out.println("Área:" + area);
    }
}
