package ProjetoLerTXT.classes;

import java.util.*;

public class ContagemLetras {
    public static String contagem(String str) {
        StringBuilder sb = new StringBuilder();
        String[] letras = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        HashMap<String,Integer> map = new HashMap<>();
        for (String i : letras){
            map.put(i,0);
        }

        for (int i = 0; i < str.length(); i++) {
            for (String x : letras) {
                if (str.substring(i, i + 1).equalsIgnoreCase(x)) {
                    map.put(x,map.get(x) + 1);
                }
            }
        }

        for (String i : map.keySet()){
            if (!map.get(i).equals(0)){
                sb.append("Letra: " + i + " = " + map.get(i) + " vezes\n");
            }
        }

        return sb.toString();
    }
}
