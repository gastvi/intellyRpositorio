public class Main {

    public static void main(String[] args) {
         Devs objDevs = new Devs ();
         Analista objAnalista = new Analista();
         Atendente objAtendente = new Atendente();
         Devs objDevs2 = new Devs();
        Analista objAnalista2 = new Analista();
        Atendente objAtendente2 = new Atendente();


        System.out.println(objDevs.calcularSalario(2.5, 5.23));
        System.out.println(objDevs.programar());
        objDevs2.setSalario(34.98);
        System.out.println(objDevs2.getSalario());
        objDevs.setTi("desenvolverdor");
        System.out.println(objDevs.getTi());
        System.out.println("---------------------------------------------------------------------------------");


        System.out.println(objAnalista.calcularSalario(2.8, 12.5));
        System.out.println(objAnalista.analisar());
        objAnalista2.setSalario(32.98);
        System.out.println(objAnalista2.getSalario());
        objAnalista.setJunior("senior");
        System.out.println(objAnalista.getJunior());
        System.out.println("----------------------------------------------------------------------------------");


        System.out.println(objAtendente.calcularSalario(15.1, 12.67));
        System.out.println(objAtendente.atender());
        objAtendente2.setSalario(23.98);
        System.out.println(objAtendente2.getSalario());
        objAtendente.setSexo("femia");
        System.out.println(objAtendente.getSexo());
    }
}
