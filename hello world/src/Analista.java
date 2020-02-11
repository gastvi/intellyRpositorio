public class Analista extends Funcionario {
    private String junior;
    private int tempoDeEmpresa;

    public Analista(String nivel ){
        this.junior = nivel;

    }
    public Analista(int tempo){
        this.tempoDeEmpresa = tempo;

    }
    public Analista(){

    }



    public String analisar (){
        return "estou analisando";
    }


    public String getJunior(){
        return junior;
    }
    public void setJunior(String novoJunior){
        this.junior = novoJunior;
    }
    public int getTempoDeEmpresa(){
        return tempoDeEmpresa;
    }
    public void setTempoDeEmpresa(int tempo){
        this.tempoDeEmpresa = tempo;
    }


}
