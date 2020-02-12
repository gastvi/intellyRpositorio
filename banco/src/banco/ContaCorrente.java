package banco;

public class ContaCorrente extends Conta {

  private double valorCheques;
  private int dataDeValidade;
  private double saldoCorrente;

    public ContaCorrente(double novoSaldo, Cliente nomeDoCliente, double valorCheques, int dataDeValidade, double saldoCorrente) {
        super(novoSaldo, nomeDoCliente);
        this.valorCheques = valorCheques;
        this.dataDeValidade = dataDeValidade;
        this.saldoCorrente = saldoCorrente;
    }

    public void depositarCheque(double dataAtual){
       if(dataDeValidade <= dataAtual){
           System.out.println("o cheque tá dentro da validade");
           System.out.println("valor do cheque: "+ valorCheques);
           System.out.println("descontando o cheque do saldo");
           saldoCorrente = getSaldo() - valorCheques;
           System.out.println("cheque descontado com sucesso");
           System.out.println("saldo atual: "+ saldoCorrente);
           setSaldo(saldoCorrente);
       } else {
           System.out.println("o cheque está fora da validade.");
       }

    }
}
