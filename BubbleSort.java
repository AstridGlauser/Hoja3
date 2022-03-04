

import java.lang.Integer;
import java.util.ArrayList;
import java.util.Vector;

import javax.sound.sampled.SourceDataLine;

public class BubbleSort<T> implements Comparator<T>{
    @Override
    public void sort(Vector<T> datos, int a, int b){
        for(int i = 0; i<(datos.size()-1);i++){
            for(int j = i+1;j<(datos.size());j++){
                if((int)datos.get(i)>= (int) datos.get(j)){//Si numero actual es mayor al numero siguiente
                    T aux1 = datos.get(j);
                    T aux2 = datos.get(i);
                    datos.set(j, aux2);
                    datos.set(i, aux1);
                    
                }
            }

        }
    }
   

    
    
}