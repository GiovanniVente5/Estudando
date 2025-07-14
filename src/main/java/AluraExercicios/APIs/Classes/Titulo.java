package AluraExercicios.APIs.Classes;

public class Titulo {
    String titulo;
    int anoLancamento;
    int duracaoEmMin;
    String genero;
    double notaImdb;

    public Titulo(String titulo, int anoLancamento, int duracaoEmMin, String genero, double notaImdb) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.duracaoEmMin = duracaoEmMin;
        this.genero = genero;
        this.notaImdb = notaImdb;
    }

    public Titulo(TituloOmdb tituloOmdb) {
        this.titulo = tituloOmdb.title();
        this.anoLancamento = Integer.valueOf(tituloOmdb.year().substring(0,3));
        this.duracaoEmMin = Integer.valueOf(tituloOmdb.runtime().substring(0,3));
        this.genero = tituloOmdb.genre();
        this.notaImdb = Double.valueOf(tituloOmdb.imdbrating());

    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + "\nNota IMDB: " + notaImdb + "\nDuração em Min: " + duracaoEmMin + "\nGenero: "+ genero + "\nAno de lançamento: "+ anoLancamento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getDuracaoEmMin() {
        return duracaoEmMin;
    }

    public void setDuracaoEmMin(int duracaoEmMin) {
        this.duracaoEmMin = duracaoEmMin;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getNotaImdb() {
        return notaImdb;
    }

    public void setNotaImdb(double notaImdb) {
        this.notaImdb = notaImdb;
    }
}
