package banco;

public class ContaPoupanca extends Conta {

    private double juros;

    public ContaPoupanca(double novoSaldo, Cliente nomeDoCliente, double juros) {
        super(novoSaldo, nomeDoCliente);
        this.juros = juros;
    }

    public void recolherJuros(){
        System.out.println(getSaldo());
        double saldoPoupanca = super.getSaldo();
        double temp;
        System.out.println("juros da conta: "+this.juros);
        System.out.println("saldo atual:"+ saldoPoupanca);
        temp = this.juros * saldoPoupanca;
        System.out.println("juros atual para pagar: " + temp);
        saldoPoupanca = saldoPoupanca - temp;
        System.out.println("juros pago");
        System.out.println("saldo atual:" + saldoPoupanca);
        setSaldo(saldoPoupanca);

    }



}
