
import java.util.Collection;
import java.util.Collections;
import java.util.Vector;



public class radixSort<T> implements Comparator<T>{

    @Override
    public void sort(Vector<T> data, int izquierda, int derecha) {
        int x,i,j;
        for(x = Integer.SIZE-1; x >= 0; x--){
            Vector<T> aux = new Vector<>((Collection<? extends T>) Collections.nCopies(data.size(), 0));
            j = 0;
            for( i = 0; i<data.size();i++){
                boolean move = (int)data.get(i) << x >= 0;//es x mayor a 0?, si lo es da true
                if(x== 0? !move: move){
                    aux.set(j, data.get(i));
                    j++;
                }else{
                    data.set((i-j), data.get(i));
                }
            }
            for (i = j; i < aux.size(); i++) {
                aux.set(i, data.get(i-j));
            }
            data = aux;
        } 
        
    }  
}