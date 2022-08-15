package aula01;

public class PessoaJuridica extends Pessoa{
    public String cnpj;

    public PessoaJuridica(String cnpj, String nome, String telefone, 
            String email, String endereco, float valorDesc) {
        super(nome, telefone, email, endereco, valorDesc);
        this.cnpj = cnpj;
    }
    
    @Override
    public void calcularDesconto(float percentual) {
        valorDesc = valorDesc - (valorDesc * ((percentual + 20)/100));
    }
    
    @Override
    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email);
        System.out.println("Endereco: " + endereco);
        System.out.println("Valor: " + valorDesc);
        System.out.println("CPF: " + cnpj);
    }
}
