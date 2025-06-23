package DesafiosCodeBat.Classes;

public class StringDesafio {
    public static String stringDentro(String out, String in) {
        String parte1 = out.substring(0, 3);
        String parte2 = out.substring(3, 6);
        return parte1 + in + parte2;
    }

    public static String ultimoCaracter(String string) {
        String resultado = string.substring(string.length() - 2, string.length());
        return resultado + resultado + resultado;
    }

    public static String doisPrimeiros(String str) {
        String resultado;
        if (str.length() >= 2) {
            resultado = str.substring(0, 2);
        } else {
            resultado = str;
        }
        return resultado;
    }

    public static String primeiraMetade(String str) {
        String resultado = str.substring(0, str.length() / 2);
        return resultado;
    }

    public static String deletaPrimeiraEUltima(String str){
        String resultado = "";
        if (str.length() > 2) {
            resultado = str.substring(1,str.length() -1);
        }
        return resultado;
    }

    public static String doisDoMeio(String str){
        String resultado = str.substring(str.length()/2-1 , str.length()/2+1);
        return resultado;
    }

    public static boolean terminaComLy (String str){
        if (str.endsWith("ly")){
            return true;
        }
        return false;
    }
}
