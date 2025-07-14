package AluraExercicios.Dados.Classes;

public class Quadrado implements Forma{
    double lados;

    @Override
    public double calcularArea(){
        System.out.println("Area do quadrado: ");
        return lados * lados;
    }

    public Quadrado(double lados) {
        this.lados = lados;
    }

    public double getLados() {
        return lados;
    }

    public void setLados(double lados) {
        this.lados = lados;
    }
}
