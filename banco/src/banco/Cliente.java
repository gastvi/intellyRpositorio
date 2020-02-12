package banco;

public class Cliente {

    private int numeroCliente;
    private int cpf;
    private int rg;
    private String sobrenome;


    public Cliente(int numeroCliente, int cpf, int rg, String sobrenome) {
        this.numeroCliente = numeroCliente;
        this.cpf = cpf;
        this.rg = rg;
        this.sobrenome = sobrenome;
    }


    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}
