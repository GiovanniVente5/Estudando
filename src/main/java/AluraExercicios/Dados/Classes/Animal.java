package AluraExercicios.Dados.Classes;

public class Animal {
    String nome;
    int quantPatas;

    public Animal(int quantPatas, String nome) {
        this.quantPatas = quantPatas;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantPatas() {
        return quantPatas;
    }

    public void setQuantPatas(int quantPatas) {
        this.quantPatas = quantPatas;
    }
}
