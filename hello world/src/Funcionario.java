public class Funcionario {
    private double salario;

    public Double calcularSalario(double horasTrabalhadas, double valorTrabalhado){
        return horasTrabalhadas*valorTrabalhado;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double novoSalario){
        this.salario = novoSalario;
    }
}
