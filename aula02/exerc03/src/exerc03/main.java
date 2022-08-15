package exerc03;

public class main {   
   
    public static void main(String[] args) {
               
        ContaCorrente deposito = new ContaCorrente(122, "4758-0", "Jullia", 1000, 20);
        
        deposito.depositar();
        
        deposito.imprimir();
        
        ContaPoupanca saque = new ContaPoupanca(123, "5789-0", "Jullia", 10000, 1000);
        
        saque.sacar();
        
        saque.imprimir();
        
        ContaCorrente investimento = new ContaCorrente(122, "4758-0", "Jullia", 1000, 700);
        
        investimento.investimento();
        
        investimento.imprimir();
        
        
    }    
}
