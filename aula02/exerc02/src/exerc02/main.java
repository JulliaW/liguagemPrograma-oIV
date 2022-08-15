package exerc02;

public class main {

    public static void main(String[] args) {
        
        Triangulo triangulo = new Triangulo (3,10,"triângulo");
        
        triangulo.calcularArea();
        
        triangulo.imprimir();
        
        Quadrado quadrado = new Quadrado (8,"quadrado");
        
        quadrado.calcularArea();
        
        quadrado.imprimir();
        
        Circunferencia circunferencia = new Circunferencia (5,"circuferência");
        
        circunferencia.calcularArea();
        
        circunferencia.imprimir();
        
    }
    }
    
