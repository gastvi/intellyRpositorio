package banco;

public class Conta {


    private Cliente cliente;
    private double saldo;


    public Conta(double novoSaldo, Cliente nomeDoCliente) {
        this.saldo = novoSaldo;
        this.cliente = nomeDoCliente;
    }

    public void deposito(double deposito) {
        if(deposito > 0) {
            this.saldo = this.saldo + deposito;
            System.out.println("deposito feito com sucessos");
        } else{
            System.out.println("valor invalido para deposito");
        }
        System.out.println("saldo da conta atual: " + this.saldo);
    }

    public double saque(double saque) {
        if (this.saldo >= saque) {
            this.saldo = this.saldo - saque;
            System.out.println("saque feito com sucesso");
            System.out.println("saldo da conta atual"+": " + this.saldo);
        } else {
            System.out.println("seu saldo é inferior ao saque que quer realizar");
            System.out.println("saldo da conta atual"+": " + this.saldo);
        }
        return this.saldo;
    }

    public void verificarConta(){
        System.out.println("dinheiro atual: "+ this.saldo);
    }





    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
