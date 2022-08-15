package aula01;

public class PessoaFisica extends Pessoa {
    public String cpf;

    public PessoaFisica(String cpf, String nome, String telefone, 
            String email, String endereco, float valorDesc) {
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
        System.out.println("Email: " + email);
        System.out.println("Endereco: " + endereco);
        System.out.println("Valor: " + valorDesc);
        System.out.println("CPF: " + cpf);
    }
    
}
