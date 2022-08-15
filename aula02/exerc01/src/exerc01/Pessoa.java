package exerc01;

public abstract class Pessoa implements IPessoa{
    public String nome;
    public String telefone;
    public String email;
    public String endereco;
    public float valorDesc;

    public Pessoa(String nome, String telefone, String email, String endereco, float valor) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.valorDesc = valorDesc;
    }
    
}