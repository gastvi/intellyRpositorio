package treinarjogador;

public class Main {

    public static void main(String[] args) {
        JogadorDeFutebo objJogador1 = new JogadorDeFutebo("Jonas",95,0,0,2);
        JogadorDeFutebo objJogador2 = new JogadorDeFutebo("joão",80,10,0,0);
        SessaoDeTreinamento objTreino = new SessaoDeTreinamento(0);

        objTreino.treinarA(objJogador1);
        System.out.println("");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("");
        objTreino.treinarA(objJogador2);


    }
}
