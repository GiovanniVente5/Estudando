package Desafios;

import Desafios.Classes.StringDesafio;
import com.sun.security.jgss.GSSUtil;

public class Executavel {
    public static void main(String[] args) {
        System.out.println(StringDesafio.stringDentro("<<<>>>","Dentro"));
        System.out.println(StringDesafio.ultimoCaracter("oi"));
        System.out.println(StringDesafio.doisPrimeiros("abcde"));
        System.out.println(StringDesafio.primeiraMetade("OLA000"));
        System.out.println(StringDesafio.deletaPrimeiraEUltima("OLA"));
        System.out.println(StringDesafio.doisDoMeio("ooOIoo"));
        System.out.println(StringDesafio.terminaComLy("testely"));
    }
}
