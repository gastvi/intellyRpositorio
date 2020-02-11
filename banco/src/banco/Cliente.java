package banco;

public class Cliente {

    private int senha;
    private String cpf;
    private String nome;


public Cliente(int novaSenha, String novoCpf, String novoNome){
    this.senha = novaSenha;
    this.cpf = novoCpf;
    this.nome = novoNome;
}


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) { this.nome = nome; }

}
