package exerc02;

public class Triangulo implements IForma{
    public float base;
    public float altura;
    public String nome;
    public double area;

    public Triangulo(float base, float altura, String nome) {
        base = base;
        altura = altura;
        nome = nome;
    }
    
    @Override
    public void calcularArea() {
        area = (base * altura) / 2;
    }
    
    @Override
    public void imprimir() {
         System.out.println("Nome:" + nome);
         System.out.println("Base:" + base);
         System.out.println("Altura:" + altura);
         System.out.println("Área:" + area);
    }
    
}
