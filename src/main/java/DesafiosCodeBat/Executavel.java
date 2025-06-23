package DesafiosCodeBat;

import DesafiosCodeBat.Classes.ArraysDesafios;
import DesafiosCodeBat.Classes.StringDesafio;

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
        System.out.println("Numeros maiores: " + ArraysDesafios.numeroMaior(nums));
    }
}
