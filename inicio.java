
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
public class inicio {
    public static void main(String args[]) {
        int cantidad = 3000;
        String texto = "";
        for (int i = 0; i < cantidad; i++) {
            int numero = (int) (Math.random() * cantidad);
            texto += numero + " ";
        }
      
   
        try {

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("numer.txt"));
			bufferedWriter.write(texto);
			bufferedWriter.close();

        } catch (IOException exception) {
         System.out.println("ERROR");
         
        } 

    }
}
