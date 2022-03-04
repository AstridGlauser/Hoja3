import java.util.Vector;

public class Quicksort<T> implements Comparator<T> {
    @Override
    public void sort(Vector<T> data, int izquierda, int derecha) {
        
        if(data!=null){//Programación defensiva
         if(data.isEmpty()){//Programación defensiva
        
        }else{
        if(data.get(0).getClass().equals(Integer.class)){//Programación defensiva
        int i, j, pivote;//inicilización de las variables
        //elemento menor al pivote a la derecha
        //elemento mayor al pivote a la izquierda
        i = izquierda;
        j = derecha;
        pivote = (int) data.get((izquierda + derecha) / 2);//divide el arreglo en 2 para hacer mas sencillo el ordenamiento 
        while (i <= j) {
            while ((int) data.get(i) < (int) pivote) {
                i++;//incrementa contador i, buscando un numero mayor al  pivote
            }
            while ((int) data.get(j) > (int) pivote) {
                j--;//disminuye el contador j ,buscando numero menor  pivote
            }

            if (i <= j) {// aqui se realiza el intercambio de posiciones
                T aux = data.get(i);//corresponde al numero mayor al pivote
                data.set(i, data.get(j));
                data.set(j, aux);

                i++;
                j--;

            }
        }

        if (izquierda < j) {//recursivo
            sort(data, izquierda, j);
        }
        if (i < derecha) {
            sort(data, i, derecha);
        }

    }

}
}
}
}
//adaptado de https://www.youtube.com/watch?v=N7f51HsrHWc&t=550s
