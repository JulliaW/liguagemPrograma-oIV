package exerc01;

public final class PessoaFisica extends Pessoa {

    public String cpf;

    public PessoaFisica(String cpf, String nome, String telefone, String email,
            String endereco, float valorDesc) {
        super(nome, telefone, email, endereco, valorDesc);
        this.cpf = cpf;
    }
    
    @Override
    public void calcularDesconto(float percentual) {
       valorDesc = valorDesc - (valorDesc * ((percentual + 10)/100));
    }
    
    @Override
    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + endereco);
        System.out.println("Cpf: " + cpf);
        System.out.println("Valor Desconto: " + valorDesc);   
    }
}
