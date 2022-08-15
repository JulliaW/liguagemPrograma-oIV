package exerc02;

public class Circunferencia implements IForma {
    public float raio;
    public String nome;
    public double area;

    public Circunferencia(float raio, String nome) {
        raio = raio;
        nome = nome;
    }

  @Override
    public void calcularArea() {
        area = raio * raio * 3.14;
    }
    
    @Override
    public void imprimir() {
         System.out.println("Nome:" + nome);
         System.out.println("Lado:" + raio);
         System.out.println("Área:" + area);
    }
    
}
