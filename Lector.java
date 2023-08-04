import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Lector {

    ArrayList<String> palabras = new ArrayList<String>();

    public void leer(String path) {
        
        try {
      File archivo = new File(path);
      Scanner myReader = new Scanner(archivo);
      while (myReader.hasNextLine()) {
        String[] palabrasSinComa = myReader.nextLine().split(",");
        for (int i = 0; i < palabrasSinComa.length; i++){
            palabras.add(palabrasSinComa[i]);
        }
        
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    }
}
