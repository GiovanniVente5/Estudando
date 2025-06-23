package AluraExercicios.Arrays.Classes;

public class ContaBancaria {
    String dono;
    double saldo;

    @Override
    public String toString() {
        return "Dono: " + dono + "\nSaldo: " + saldo;
    }

    public ContaBancaria(String dono, double saldo) {
        this.dono = dono;
        this.saldo = saldo;
    }

    public static ContaBancaria maiorSaldo (ContaBancaria[] contas){
        ContaBancaria conta = contas[0];
        for (ContaBancaria contaBancaria : contas){
            if (contaBancaria.saldo > conta.saldo){
                conta = contaBancaria;
            }
        }
        return conta;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
