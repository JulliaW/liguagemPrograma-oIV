package exerc03;

public class ContaCorrente extends Conta implements IConta {

    public double valor;
    
    public ContaCorrente(int numero, String agencia, String titular,
            double saldo, double valor) {
        super(numero, agencia, titular, saldo);
        valor = valor;
    }

      @Override
    public void depositar() {
        saldo = valor + saldo;
    }

    @Override
    public void sacar() {
         saldo = valor - saldo;
    }

    @Override
    public void investimento() {
        saldo = saldo + (saldo * 0.03);
    }

    @Override
    public void imprimir() {
        System.out.println("Número: " + numero);
        System.out.println("Agencia: " + agencia);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }
}
