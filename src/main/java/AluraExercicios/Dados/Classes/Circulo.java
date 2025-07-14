package AluraExercicios.Dados.Classes;

public class Circulo implements Forma{
    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        System.out.println("Area do circulo: ");
        return raio * raio * Math.PI;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
