package AluraExercicios.Classes;

public class Produtos {
    String nome;
    double preco;

    public Produtos(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public static double precoMedio(Produtos[] produtos){
        double media = 0;
        for (Produtos pro : produtos){
            media += pro.getPreco();
        }
        media = media / produtos.length;
        return media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
