package DesafiosCodeBat;

import DesafiosCodeBat.Classes.ArraysDesafios;
import DesafiosCodeBat.Classes.StringDesafio;
import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static java.awt.SystemColor.TEXT;

public class Executavel {
    public static void main(String[] args) {
        System.out.println(StringDesafio.stringDentro("<<<>>>", "Dentro"));
        System.out.println(StringDesafio.ultimoCaracter("oi"));
        System.out.println(StringDesafio.doisPrimeiros("abcde"));
        System.out.println(StringDesafio.primeiraMetade("OLA000"));
        System.out.println(StringDesafio.deletaPrimeiraEUltima("OLA"));
        System.out.println(StringDesafio.doisDoMeio("ooOIoo"));
        System.out.println("Termina com ly: " + StringDesafio.terminaComLy("testely"));
        int[] nums = {6, 9, 6};
        System.out.println("contem numero 6 - começo ou final: " + ArraysDesafios.numero6(nums));
        System.out.println("numero inicial e final iguais: " + ArraysDesafios.numerosIguais(nums));
//        System.out.println("Numeros maiores: " + ArraysDesafios.numeroMaior(nums));
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        System.out.println("Lista: " + ArraysDesafios.dobrando(lista));
        List<String> teste = new LinkedList<>();
        teste.add("teste");
        teste.add(1,"1");
        System.out.println(teste.get(0));
        System.out.println(teste.get(1));


    }
}
