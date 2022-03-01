import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.util.Vector;
public class inicio {
    public static void main(String args[]) {
        int cantidad = 3000;
        String texto = "";
	Vector<Integer> info = new Vector<Integer>();
        for (int i = 0; i < cantidad; i++) {
            int numero = (int) (Math.random() * cantidad);
            texto += numero + "\n";
        }
      
        
        try {
            
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("numer.txt"));
			bufferedWriter.write(texto);
			bufferedWriter.close();
                        
        } catch (IOException exception) {
         System.out.println("ERROR");
         
        } 

        try{
        FileReader Datos = new FileReader("numer.txt");
        BufferedReader Lector = new BufferedReader(Datos);
        String x = "";
        while (x != null) {
            x = Lector.readLine();//se lee linea por linea
            if (x == null) {
                Lector.close();//para al no encontrar informacion
                
                break;
            }
                info.add(Integer.parseInt(x));//agrega al vector info
        }
    }
        catch (Exception e) {
            System.out.println("Algo salio mal");//capta la excepcion
        }
    }
}