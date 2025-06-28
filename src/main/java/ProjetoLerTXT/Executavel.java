package ProjetoLerTXT;

import ProjetoLerTXT.classes.ContagemLetras;
import ProjetoLerTXT.classes.Ler;

import javax.swing.*;
import java.io.IOException;
import java.util.*;
import java.util.stream.Stream;

public class Executavel {
    public static void main(String[] args) throws IOException {
        Ler ler = new Ler("C:\\Users\\paido\\OneDrive\\Área de Trabalho\\TXTteste.txt");
        JOptionPane.showMessageDialog(null,ContagemLetras.contagem(ler.lendo()));
    }
}
