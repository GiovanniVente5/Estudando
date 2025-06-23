package AluraExercicios.Arrays.Classes;

public class Cachorro extends Animal{
    String barulho;

    public Cachorro(int quantPatas, String nome, String barulho) {
        super(quantPatas, nome);
        this.barulho = barulho;
    }

    public void barulho(){
        System.out.println(this.barulho);
    }

    public String getBarulho() {
        return barulho;
    }

    public void setBarulho(String barulho) {
        this.barulho = barulho;
    }
}
