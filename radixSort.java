

import java.util.Arrays;
import java.util.Vector;


//EL SIGUIENTE CODIGO FUE ADAPTADO DE https://github.com/eMahtab/radix-sort/tree/master/src/net/mahtabalam
public class radixSort<T> implements Comparator<T>{

    @Override
    public void sort(Vector<T> data, int n, int noUse) {
        if(data!= null){
            if(!data.isEmpty()){
                if(data.get(0).getClass().equals(Integer.class)){
                    int m = getMax(data, n);
                    for (int exp = 1; m / exp > 0; exp *= 10) {
                        Sort(data, n, exp);
                    }
                }
            }
        }
    } 
    private int getMax (Vector<T> arr, int n) {
        int mx = (int) arr.get(0);
        for (int i = 1; i < n; i++)
            if ((int)arr.get(i) > mx)
                    mx = (int)arr.get(i);
        return mx;
    }
    private void Sort(Vector<T> arr, int n, int exp) {
            int output[] = new int[n]; // output array
            int i;
            // count array size is 10, as we are dealing with base 10 numbers, so a number will only contain digits 0,1,2,3,4,5,6,7,8,9 
            int count[] = new int[10]; 
            Arrays.fill(count, 0);

            // Store count of occurrences in count[]
            for (i = 0; i < n; i++)
                    count[((int)arr.get(i) / exp) % 10] = count[((int)arr.get(i) / exp) % 10] + 1;


            // Change count[i] so that count[i] now contains
            // actual position of this digit in output[]
            for (i = 1; i < 10; i++)
                    count[i] = count[i] + count[i - 1];


            // Build the output array
            for (i = n - 1; i >= 0; i--) {
                    output[count[((int)arr.get(i) / exp) % 10] - 1] = (int)arr.get(i);
                    count[((int)arr.get(i) / exp) % 10]--;
            }
            Object value = null;
            // Copy the output array to arr[], so that arr[] now
            // contains sorted numbers according to current digit
            for (i = 0; i < n; i++){
                value = (Object) output[i];
                arr.set(i, (T) value);
            }
    }
    
}