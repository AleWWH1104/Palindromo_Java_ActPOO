import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.io.FileReader;

// un poco de ayuda de chat gpt
class Escritor{
    private List<String> palindromas;
    public void crear(String csv) {
        try {
            // Crear un objeto File para el archivo de salida
            File archivoSalida = new File("salida.txt"); // Puedes cambiar el nombre y ubicación si es necesario

            // Crear FileWriter y BufferedWriter para escribir en el archivo
            FileWriter escritorArchivo = new FileWriter(archivoSalida);
            BufferedWriter bufferEscritura = new BufferedWriter(escritorArchivo);

            // Escribir el contenido del CSV en el archivo
            bufferEscritura.write(csv);

            // Cerrar BufferedWriter y FileWriter para liberar recursos
            bufferEscritura.close();
            escritorArchivo.close();

            System.out.println("Contenido del CSV ha sido escrito en el archivo.");
        } catch (IOException e) {
            System.err.println("Error al escribir el archivo: " + e.getMessage());
        }
    }

    public void escribir(List<String> palindromas) {
        try {
            // Crear un objeto File para el archivo de salida
            File archivoSalida = new File("palindromas.txt"); // Puedes cambiar el nombre y ubicación si es necesario

            // Crear FileWriter y BufferedWriter para escribir en el archivo
            FileWriter escritorArchivo = new FileWriter(archivoSalida);
            BufferedWriter bufferEscritura = new BufferedWriter(escritorArchivo);

            // Escribir las palabras palindrómicas en el archivo
            for (String palabra : palindromas) {
                bufferEscritura.write(palabra);
                bufferEscritura.newLine(); // Agregar una nueva línea después de cada palabra
            }

            // Cerrar BufferedWriter y FileWriter para liberar recursos
            bufferEscritura.close();
            escritorArchivo.close();

            System.out.println("Palabras palindrómicas han sido escritas en el archivo.");
        } catch (IOException e) {
            System.err.println("Error al escribir el archivo: " + e.getMessage());
        }
    }
    public void mostrar(String csv) {
        try {
            // Crear un objeto File para el archivo de entrada (CSV)
            File archivoEntrada = new File(csv);

            // Crear FileReader y BufferedReader para leer el archivo
            FileReader lectorArchivo = new FileReader(archivoEntrada);
            BufferedReader bufferLectura = new BufferedReader(lectorArchivo);

            // Leer y mostrar el contenido del CSV en la consola
            String linea;
            while ((linea = bufferLectura.readLine()) != null) {
                System.out.println(linea);
            }

            // Cerrar BufferedReader y FileReader para liberar recursos
            bufferLectura.close();
            lectorArchivo.close();

        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}