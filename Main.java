import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String rutaArchivoEntrada = "entrada.txt";

        //instancia de Lector y leer archivo
        Lector lector = new Lector();
        lector.leer(rutaArchivoEntrada);
        ArrayList<String> palabras = lector.palabras;

        // instancia de Analizador y obtener palabras
        Analizador analizador = new Analizador();
        ArrayList<String> palindromas = analizador.devolverPalindroma(palabras);

        //instancia de Escritor y escribir en el csv
        Escritor escritor = new Escritor();
        escritor.crear("salida.csv");
        escritor.escribir(palindromas);

        // Mostrar el contenido del archivo de entrada
        escritor.mostrar(rutaArchivoEntrada);

        // Agregar palabras ingresadas por el usuario al archivo CSV
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una palabra:");
        String palabra = scanner.nextLine();
        // ciclo while con ayuda de chat gpt
        while (!palabra.equals("salir")) {
            palabras.add(palabra); // agregar la palabra a la lista
            escritor.escribir(palabras); // Actualizar el CSV
            System.out.println(palabra + " se agrego al CSV");
            System.out.println("Ingrese otra palabra (o 'salir' para terminar):");
            palabra = scanner.nextLine();
        }

        // Analizar y mostrar los resultados en la consola
        // Generado con chatgpt
        System.out.println("**************************");
        System.out.println("Resultados del análisis:");
        for (String p : palabras) {
            boolean esPalindromo = analizador.palin(p, p.length() - 1, 0);
            System.out.println(p + " es palíndromo: " + esPalindromo);
        }

        scanner.close();
    }
}
