public class Devs extends Funcionario {
    private String Ti;
    private int anosDetrabalho;

    public Devs(String cargo ){
        this.Ti = cargo;

    }
    public Devs(int anos){
        this.anosDetrabalho = anos;

    }
    public Devs(){

    }



    public String programar(){
        return "estou trabalhando";
    }

    public String getTi() {
        return  Ti;
    }
    public void setTi(String  novoTi){
        this.Ti = novoTi;
    }
    public int getAnosDetrabalho() {
        return  anosDetrabalho;
    }
    public void setAnosDetrabalho(int anos){
        this.anosDetrabalho = anos;
    }
}
