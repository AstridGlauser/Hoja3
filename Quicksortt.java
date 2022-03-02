import java.util.Vector;

public class Quicksortt<T> implements Comparator<T> {
    @Override
    public void sort(Vector<T> data, int izquierda, int derecha) {
        int i, j, pivote;
        i = izquierda;
        j = derecha;
        pivote = (int) data.get((izquierda + derecha) / 2);
        do {

            while ((int) data.get(i) < (int) pivote) {
                i++;
            }
            while ((int) data.get(j) > (int) pivote) {
                j--;
            }

            if (i <= j) {
                T aux = data.get(i);
                data.set(i, data.get(j));
                data.set(j, aux);

                i++;
                j--;

            }
        } while (i <= j);

        if (izquierda < j) {
            sort(data, izquierda, j);
        }
        if (i < derecha) {
            sort(data, i, derecha);
        }

    }

}
