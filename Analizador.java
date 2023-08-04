import java.util.ArrayList;

public class Analizador {
    
    ArrayList<String> palindromas = new ArrayList<String>();    
    
    public ArrayList<String> devolverPalindroma(ArrayList<String> palabras){
        for (int i = 0; i < palabras.size(); i++){
            String palabra = palabras.get(i);
            int sizeWord = palabra.length();
            boolean palindromo = palin(palabra, sizeWord-1, 0);
            if (palindromo){
                palindromas.add(palabra);
            }
        }
        return palindromas;
    }

    public static boolean palin(String p, int f, int i) {
        if (i >= f) {
            return true;
        }
        if (p.charAt(i) == p.charAt(f)) {
            return palin(p, f - 1, i + 1);
        } else {
            return false;
        }
    }
}
