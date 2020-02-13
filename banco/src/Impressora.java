import java.util.ArrayList;
import java.util.List;

public class Imprimiveis {

    List<Imprimivel> lista = new ArrayList<Imprimivel>();


    public void imprimirTudo(){
        for(int x=0;x<lista.size();x++){
            lista.get(x);
        }
    }


   public void adicionarImprimivel(Imprimivel umImprimivel){
        lista.add(umImprimivel);
    }
}
