public class Atendente extends Funcionario {
    private String sexo;


    public String atender(){
        return "estou atendendo";
    }


    public String getSexo(){
        return sexo;
    }
    public void setSexo(String novoSexo){
        this.sexo = novoSexo;
    }

}
