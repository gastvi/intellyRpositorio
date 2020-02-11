package treinarjogador;

public class SessaoDeTreinamento {

    private int experiencia;
    private  JogadorDeFutebo jogadorDeFutebo;

    public SessaoDeTreinamento(int experiencia) {
        this.experiencia = experiencia;
    }

    public void treinarA(JogadorDeFutebo jogadorDeFutebo){
        experiencia = jogadorDeFutebo.getExperiencia();
        System.out.println("nome do jogar que vai treinar: " + jogadorDeFutebo.getNome());
        System.out.println("experiência atual:"+ experiencia);
        System.out.println("energia atual: "+jogadorDeFutebo.getEnergia());

        System.out.println("");

        System.out.println("treinamento de corrida: Valendo!!");
        jogadorDeFutebo.correr();
        System.out.println("energia atual: "+jogadorDeFutebo.getEnergia());

        System.out.println("");

        System.out.println("treinamento de chute ao gol: Valendo!!");
        jogadorDeFutebo.fazerGol();
        System.out.println("Alegria atual: "+jogadorDeFutebo.getAlegria());
        System.out.println("energia atual: "+jogadorDeFutebo.getEnergia());
        System.out.println("numeros de gols do jogardor: "+jogadorDeFutebo.getGols());

        System.out.println("");

        System.out.println("treinamento de corrida de novo: Valendo!!");
        jogadorDeFutebo.correr();
        System.out.println("energia atual: "+jogadorDeFutebo.getEnergia());

        System.out.println("");

        experiencia = experiencia + 1;
        System.out.println("experiência após treino:"+experiencia);

    }



    public int getExperiecia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public JogadorDeFutebo getJogadorDeFutebo() {
        return jogadorDeFutebo;
    }

    public void setJogadorDeFutebo(JogadorDeFutebo jogadorDeFutebo) {
        this.jogadorDeFutebo = jogadorDeFutebo;
    }
}
