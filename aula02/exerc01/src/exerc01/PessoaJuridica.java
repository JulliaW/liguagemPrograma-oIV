package exerc01;

public final class PessoaJuridica extends Pessoa {
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
        System.out.println("Email: " + endereco);
        System.out.println("Cpf: " + cnpj);
        System.out.println("Valor Desconto: " + valorDesc);   
    }
}
