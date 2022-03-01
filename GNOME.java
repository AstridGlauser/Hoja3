
import java.util.ArrayList;
import java.util.Vector;


public class GNOME<T> implements Comparator<T> {
    @Override
    public void sort(Vector<T> data) {
        if(data.isEmpty()){
        
        }else{
            if(data.get(0).getClass().equals(Integer.class)){
            for (int i = 1; i < data.size();) {
                if((int)data.get(i)>= (int) data.get(i-1)){
                    i++;
                } else {
                    T value2 = data.get(i);
                    T Value1 = data.get(i-1);
                    data.set(i,  Value1);
                    data.set(i-1, value2);
                    i--;
                }
                if(i == 0){
                i = 1;
                }
            }
            }
        
        }
    }
   
}
