import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class LeerArchivo {
    public static void main(String[] args) {
        ArrayList<String> palabras = new ArrayList<String>();
        try {
      File archivo = new File("Nombre");
      Scanner myReader = new Scanner(archivo);
      while (myReader.hasNextLine()) {
        palabras.add(myReader.nextLine());
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    }
}
