package ProjetoLerTXT;

import ProjetoLerTXT.classes.ContagemLetras;
import ProjetoLerTXT.classes.Ler;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Executavel {
    public static void main(String[] args) throws IOException {
        Ler ler = new Ler("C:\\Users\\paido\\OneDrive\\Área de Trabalho\\TXTteste.txt");
        System.out.println(ler.lendo());

        System.out.println(ContagemLetras.contagem(ler.lendo()));

    }
}
