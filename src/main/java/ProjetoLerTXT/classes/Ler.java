package ProjetoLerTXT.classes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ler {
    String caminho;


    public Ler(String caminho) {
        this.caminho = caminho;
    }

    public String lendo() throws IOException {
        String linha = "";
        BufferedReader bf = new BufferedReader(new FileReader(caminho));
        while ((linha = bf.readLine()) != null){
            return linha;
        }
        return linha;
    }
}
