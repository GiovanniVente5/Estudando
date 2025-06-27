package ProjetoLerTXT.classes;

import java.lang.reflect.Array;

public class ContagemLetras {
    public static String contagem (String str){
        String[] letras = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        StringBuilder sb = new StringBuilder();

        int contagem = 0;
        for (int i = 0; i < str.length(); i++) {
            for (String x : letras){
                if (str.substring(i,i+1).equalsIgnoreCase(x)){
                    sb.append(x);
                    contagem ++;
                }
            }
        }
        System.out.println(contagem);
        return sb.toString();
    }
}
