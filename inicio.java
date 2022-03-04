
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;
public class inicio {
    public static void main(String args[]) {
        int cantidad = 0;
        String texto = "";
	Vector<Integer> info = new Vector<Integer>();
        Scanner reader = new Scanner(System.in);
        //Menu
        System.out.println("Bienvenido al sistema de ordenado");
        System.out.println("1. Ingresar cantidad de numeros a ordenar");
        System.out.println("2. Ordenado de 3000 numeros");
        boolean flag = true; //repetir la solicitud de numeros a usar
        int opcion = 0;
        while(flag){
        try{
        opcion = reader.nextInt();
        switch(opcion) {
            case 1 ->{
                boolean isValid = false;
                while(!isValid){
                    try{
                        System.out.println("Ingrese Cantidad");
                        cantidad = reader.nextInt();
                        isValid = true;//es valida la entrada salir del loop
                        flag = false;
                   }catch(InputMismatchException e){
                        System.out.println("Caraccter invalido");
                    }
                }
            }
            case 2 ->{
            cantidad = 3000;
            flag = false;//es valida la entrada salir del loop
            }
            
        
        }
        }catch(InputMismatchException e){
            System.out.println("Caraccter invalido");
        }
        
        }
        
        
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
        
        /*
        Seleccion del tipo de Sort
        */
        System.out.println("Seleccione el tipo de sort");
        System.out.println("1. GnomeSort");
        System.out.println("2. MergeSort");
        System.out.println("3. QuickSort");
        System.out.println("4. RadixSort");
        System.out.println("5. BubbleSort");
        boolean run = true;//bandera para ver si realiz[o una eleccion valida, asi finalizar el programa
        while(run){
            try{
                int opt = reader.nextInt();
                Sorter st;
                switch(opt){
                    case 1 ->{
                        System.out.println("ArrayDesordenado");
                        st = new Sorter(new GNOME());
                        st.ordenar(info,0,0);
                        run = false;
                        saveSorted(info);
                        System.out.println("ArrayOrdenado");
                        st.ordenar(info,0,0);
                    }
                    case 2 ->{
                        System.out.println("Nothing here, coming soon");
                    
                    }
                    case 3 ->{//quicksort
                        System.out.println("ArrayDesordenado");
                        st = new Sorter(new Quicksort());
                        st.ordenar(info,0,info.size()-1);
                        run = false;
                        saveSorted(info);
                        System.out.println("ArrayOrdenado");
                        st.ordenar(info,0,info.size()-1);
                    }
                    case 4 ->{
                        System.out.println("ArrayDesordenado");
                        st = new Sorter(new radixSort());
                        st.ordenar(info,0,0);
                        run = false;
                        saveSorted(info);
                        System.out.println("ArrayOrdenado");
                        st.ordenar(info,0,0);
                    }
                    case 5 ->{//bulble
                        System.out.println("ArrayDesordenado");
                        st = new Sorter(new BubbleSort());
                        st.ordenar(info,0,0);
                        run = false;
                        saveSorted(info);
                        System.out.println("ArrayOrdenado");
                        st.ordenar(info,0,0);
                    
                    }
                //aca va el resto :v 
                }
            }catch(InputMismatchException e){
                System.out.println("Caraccter invalido");
            }
        }
        
        System.out.println("puede consultar el archivo con los numeros ordenados y desordenados en la carpeta donde tiene los archivos Java");
        //archivo ya ordenado
        
    }
    private static void saveSorted(Vector<Integer> a){
    
         try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("numerSorrted.txt"));
            for (int i = 0; i < a.size(); i++) {    
            bufferedWriter.write(String.valueOf(a.get(i)) + "\n");
            } 
            bufferedWriter.close();
                        
        } catch (IOException exception) {
         System.out.println("ERROR");
         
        
        }
        
    
    }

}

