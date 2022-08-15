package aula01;

public class Pessoa {
    public String nome;
    public String telefone;
    public String email;
    public String endereco;
    public float valorDesc;

    public Pessoa(String nome, String telefone, String email, String endereco, float valorDesc) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.valorDesc = valorDesc;
    }
    
    public void calcularDesconto(float percentual) {
        valorDesc = valorDesc - (valorDesc * (percentual/100));
    }
    
    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email);
        System.out.println("Endereco: " + endereco);
        System.out.println("Valor: " + valorDesc);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public float getValorDesc() {
        return valorDesc;
    }

    public void setValorDesc(float valorDesc) {
        this.valorDesc = valorDesc;
    }
        
}
