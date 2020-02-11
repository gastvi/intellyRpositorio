package banco;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        Cliente objCliente = new Cliente(1531, "412.523.634-24","jonas");
       Conta objConta = new Conta(100.50, objCliente);
        Scanner senha = new Scanner(System.in);
        Scanner dinheiro = new Scanner(System.in);


        System.out.println("saldo da conta atual do "+ objConta.getCliente().getNome() +": " + objConta.getSaldo());


        System.out.println("digite sua senha para poder depositar");
     if(senha.nextInt() == 1531 ) {
         System.out.println("senha aceita");
         System.out.println("quanto você quer depositar");
         objConta.deposito(dinheiro.nextDouble());
     }else {
         System.out.println("senha errada");
     }




        System.out.println("-------------------------------");
        System.out.println("-------------------------------");



        System.out.println("digite sua senha para poder sacar");
        if(senha.nextInt() == 1531 ) {
            System.out.println("senha aceita");
            System.out.println("quanto você quer sacar");
            objConta.saque(dinheiro.nextDouble());

        } else {
            System.out.println("senha errada");
        }
    }
}
