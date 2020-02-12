package banco;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Cliente objCliente = new Cliente(1531, 324 - 523 - 642 - 34, 347 - 274 - 62 - 74, "silva");
        ContaCorrente objcorrente = new ContaCorrente(500, objCliente, 400,
                21, 0);
        ContaPoupanca objPoupanca = new ContaPoupanca(500, objCliente, 0.1);
        Scanner senha = new Scanner(System.in);
        Scanner dinheiro = new Scanner(System.in);
        Scanner sim = new Scanner(System.in);


        System.out.println("numero da sua senha: " + objCliente.getNumeroCliente());
        System.out.println("");
        System.out.println("");
        System.out.println("quer fazer alguma alteração na sua conta corrente?");

        if (sim.next().equals("sim")) {
            System.out.println("dinheiro atual: " + objcorrente.getSaldo());


            System.out.println("quer depositar algum dinheiro na conta corrente?");
            if (sim.next().equals("sim")) {
                System.out.println("digite sua senha para poder depositar");
                for (int x = 0; x < 3; x++) {
                    if (senha.nextInt() == objCliente.getNumeroCliente()) {
                        System.out.println("senha aceita");
                        System.out.println("quanto você quer depositar");
                        objcorrente.deposito(dinheiro.nextDouble());
                        break;
                    } else {
                        System.out.println("senha errada");
                    }
                }
            }


            System.out.println("-------------------------------");
            System.out.println("-------------------------------");


            System.out.println("quer sacar algum dinheiro da conta corrente?");
            if (sim.next().equals("sim")) {
                System.out.println("digite sua senha para poder sacar");
                for (int x = 0; x < 3; x++) {
                    if (senha.nextInt() == objCliente.getNumeroCliente()) {
                        System.out.println("senha aceita");
                        System.out.println("quanto você quer sacar");
                        objcorrente.saque(dinheiro.nextDouble());
                        break;
                    } else {
                        System.out.println("senha errada");
                    }
                }
            }


            System.out.println("-------------------------------");
            System.out.println("-------------------------------");


            System.out.println("quer depositar algum cheque?");
            if (sim.next().equals("sim")) {
                System.out.println("digite sua senha para depositar algum cheque");
                for (int x = 0; x < 3; x++) {
                    if (senha.nextInt() == objCliente.getNumeroCliente()) {
                        System.out.println("senha aceita");
                        objcorrente.depositarCheque(28);
                        break;
                    } else {
                        System.out.println("senha errada");
                    }
                }
            }

            objcorrente.verificarConta();

        }


        System.out.println("-------------------------------");
        System.out.println("-------------------------------");
        /*
--------------------------------------------POUPANÇA--------------------------------------------------------------------
         */
        System.out.println("-------------------------------");
        System.out.println("-------------------------------");


        System.out.println("quer fazer alguma alteração na sua conta ponpança?");

        if (sim.next().equals("sim")) {
            System.out.println("dinheiro atual: " + objPoupanca.getSaldo());


            System.out.println("quer depositar algum dinheiro na conta poupança?");
            if (sim.next().equals("sim")) {
                System.out.println("digite sua senha para poder depositar");
                for (int x = 0; x < 3; x++) {
                    if (senha.nextInt() == objCliente.getNumeroCliente()) {
                        System.out.println("senha aceita");
                        System.out.println("quanto você quer depositar");
                        objPoupanca.deposito(dinheiro.nextDouble());
                        break;
                    } else {
                        System.out.println("senha errada");
                    }
                }
            }


            System.out.println("-------------------------------");
            System.out.println("-------------------------------");


            System.out.println("quer sacar algum dinheiro da conta corrente?");
            if (sim.next().equals("sim")) {
                System.out.println("digite sua senha para poder sacar");
                for (int x = 0; x < 3; x++) {
                    if (senha.nextInt() == objCliente.getNumeroCliente()) {
                        System.out.println("senha aceita");
                        System.out.println("quanto você quer sacar");
                        objPoupanca.saque(dinheiro.nextDouble());
                        break;
                    } else {
                        System.out.println("senha errada");
                    }
                }
            }


            System.out.println("-------------------------------");
            System.out.println("-------------------------------");


            System.out.println("quer recolher juros?");
            if (sim.next().equals("sim")) {
                System.out.println("digite sua senha para recolher juros");
                for (int x = 0; x < 3; x++) {
                    if (senha.nextInt() == objCliente.getNumeroCliente()) {
                        System.out.println("senha aceita");
                        objPoupanca.recolherJuros();
                        break;
                    } else {
                        System.out.println("senha errada");
                    }
                }
            }

            objPoupanca.verificarConta();
        }
    }

}
