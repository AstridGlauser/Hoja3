

import java.lang.Integer;
import java.util.ArrayList;
import java.util.Vector;

import javax.sound.sampled.SourceDataLine;

public class BubbleSort<T> implements Comparator<T>{
    @Override
    public void sort(Vector<T> datos){
        for(int i = 0; i<(datos.size()-1);i++){
            for(int j = 0;j<(datos.size()-1);j++){
                if((int)datos.get(j)>= (int) datos.get(j+1)){//Si numero actual es mayor al numero siguiente
                    T aux1 = datos.get(j);
                    T aux2 = datos.get(j+1);
                    datos.set(j, aux1);
                    datos.set(j+1, aux2);
                    
                }
            }

        }
    }
   

    
    
}