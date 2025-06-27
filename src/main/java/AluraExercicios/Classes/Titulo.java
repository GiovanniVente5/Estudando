package AluraExercicios.Classes;


public class Titulo implements Comparable<Titulo> {
    String nome;


    public Titulo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int compareTo(Titulo titulo) {
        if (!this.nome.equalsIgnoreCase(titulo.getNome())) {
            return nome.compareTo(titulo.getNome());
        }
        return 0;
    }


}
