package Voar;

public class Superman implements Voador {

private int experiencia;

    @Override
    public void voar() {
        int experienciaTotal = 0;
experienciaTotal += experiencia;
        System.out.println("Estou voando como um campeão");
        System.out.println("experiência total: " + experienciaTotal);
    }
}
