package aula01;

public class main {

    public static void main(String[] args) {
        PessoaJuridica jullia = new PessoaJuridica("987654-1","Jullia","(16)99999-9999","jullia.weber@gmail.com","Rua da Subida, 120",100);
        
        jullia.calcularDesconto(10);
        
        jullia.imprimir();
    }
}
