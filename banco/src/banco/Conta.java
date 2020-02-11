package banco;

public class Conta {


    private Cliente cliente;
    private double saldo;


    public Conta(double novoSaldo, Cliente nomeDoCliente) {
        this.saldo = novoSaldo;
        this.cliente = nomeDoCliente;
    }

    public double deposito(double deposito) {
        if(deposito > 0) {
            saldo = saldo + deposito;
            System.out.println("deposito feito com sucessos");
            System.out.println("saldo da conta atual"+": " + saldo);
        } else{
            System.out.println("valor invalido para deposito");
            System.out.println("saldo da conta atual"+": " + saldo);
        }
        return saldo;
    }

    public double saque(double saque) {
        if (saldo >= saque) {
            saldo = saldo - saque;
            System.out.println("saque feito com sucesso");
            System.out.println("saldo da conta atual"+": " + saldo);
        } else {
            System.out.println("seu saldo é inferior ao saque que quer realizar");
            System.out.println("saldo da conta atual"+": " + saldo);
        }
        return saldo;
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
