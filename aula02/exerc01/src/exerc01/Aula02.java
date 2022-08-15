package exerc01;

public class Aula02 {
    
    public static void main(String[] args) {
        PessoaJuridica jullia = new PessoaJuridica("12212-1", "Jullia", "(16)99999-9999", "jullia.weber@gmail.com", "Rua da subida, 190", 20);
        
        jullia.calcularDesconto(10);
        
        jullia.imprimir();
    }    
}
