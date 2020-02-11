package treinarjogador;

public class  JogadorDeFutebo {

   private String  nome;
   private int energia;
   private int alegria;
   private int gols;
   private int experiencia;

    public JogadorDeFutebo(String nome, int energia, int alegria, int gols, int experiencia) {
        this.nome = nome;
        this.energia = energia;
        this.alegria = alegria;
        this.gols = gols;
        this.experiencia = experiencia;
    }


    public void fazerGol(){
        if(this.energia >= 5) {
            energia = energia - 5;
            alegria = alegria + 10;
            gols = gols + 1;
            System.out.println("GOOOOOOOOOOOOOOOOOL!!!!");
        } else {
            System.out.println("sem energia para esse treinamento!!");
        }
    }

    public void correr(){
        if(this.energia >= 10 ) {
            energia = energia - 10;
            System.out.println("Cansei!");
        }else {
            System.out.println("sem energia para esse treinamento!!");
        }
    }




    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getAlegria() {
        return alegria;
    }

    public void setAlegria(int alegria) {
        this.alegria = alegria;
    }

    public int getGols() {
        return gols;
    }

    public void setGols(int gols) {
        this.gols = gols;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
}
