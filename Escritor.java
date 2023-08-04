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
    
    // Variable para mantener el archivo de salida (Agrgada, no en UML)
    private File archivoSalida;

    public void crear(String csv) {
        // Crear un objeto File para el archivo de salida
        archivoSalida = new File("salida.csv");

        System.out.println("Archivo CSV ha sido creado.");
    }

    public void escribir(List<String> palindromas) {
        try {
            // Verificar el archivo
            if (archivoSalida == null) {
                System.err.println("Error: El archivo de salida no ha sido creado.");
                return;
            }

            // Crear FileWriter y BufferedWriter para escribir en el archivo
            FileWriter escritorArchivo = new FileWriter(archivoSalida);
            BufferedWriter bufferEscritura = new BufferedWriter(escritorArchivo);

            // Escribir las palabras en el archivo
            for (String palabra : palindromas) {
                bufferEscritura.write(palabra);
                bufferEscritura.newLine();
            }

            // Cerrar BufferedWriter y FileWriter
            bufferEscritura.close();
            escritorArchivo.close();

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

            // Cerrar BufferedReader y FileReader
            bufferLectura.close();
            lectorArchivo.close();

        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}