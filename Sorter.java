
import java.util.Vector;

/*
Clase que recibe como parametro el tipo de sort a Usar, es decir la instancia
*/
public class Sorter<T> {

    private Comparator comparador;

    Sorter(Comparator comparador) {// recibe la clase del tipo de ordenamiento
        this.comparador = comparador;
    }

    public void ordenar(Vector<T> toSort,int izquierda,int derecha) {// ejecutar el ordenamiento
        long startTime = System.nanoTime();// hora de inicio en miliseconds
        comparador.sort(toSort);
        long endTime = System.nanoTime();// momento de finalizacion
        long sortTime = (long) ((long) (endTime - startTime) / 1e6);// obtener el tiempo de tardado para el sorteado
        System.out.println("Tiempo empleado para el ordenado : " + String.valueOf(sortTime) + "ms");// mostrar el tiempo
                                                                                                    // empleado para el
                                                                                                    // ordenamiento
    }
}
/*
 * _____ _____ _____ _____ _____ _______
 * /\ \ /\ \ /\ \ /\ \ /\ \ /::\ \
 * /::\ \ /::\ \ /::\ \ /::\____\ /::\ \ /::::\ \
 * /::::\ \ /::::\ \ \:::\ \ /:::/ / /::::\ \ /::::::\ \
 * /::::::\ \ /::::::\ \ \:::\ \ /:::/ / /::::::\ \ /::::::::\ \
 * /:::/\:::\ \ /:::/\:::\ \ \:::\ \ /:::/ / /:::/\:::\ \ /:::/~~\:::\ \
 * /:::/__\:::\ \ /:::/__\:::\ \ \:::\ \ /:::/ / /:::/__\:::\ \ /:::/ \:::\ \
 * /::::\ \:::\ \ /::::\ \:::\ \ /::::\ \ /:::/ / /::::\ \:::\ \ /:::/ / \:::\ \
 * /::::::\ \:::\ \ /::::::\ \:::\ \ /::::::\ \ /:::/ / _____ /::::::\ \:::\ \
 * /:::/____/ \:::\____\
 * /:::/\:::\ \:::\ \ /:::/\:::\ \:::\____\ /:::/\:::\ \ /:::/____/ /\ \
 * /:::/\:::\ \:::\____\ |:::| | |:::| |
 * /:::/ \:::\ \:::\____\/:::/ \:::\ \:::| | /:::/ \:::\____\|:::| /
 * /::\____\/:::/ \:::\ \:::| ||:::|____| |:::| |
 * \::/ \:::\ /:::/ /\::/ |::::\ /:::|____|/:::/ \::/ /|:::|____\ /:::/ /\::/
 * |::::\ /:::|____| \:::\ \ /:::/ /
 * \/____/ \:::\/:::/ / \/____|:::::\/:::/ //:::/ / \/____/ \:::\ \ /:::/ /
 * \/____|:::::\/:::/ / \:::\ \ /:::/ /
 * \::::::/ / |:::::::::/ //:::/ / \:::\ \ /:::/ / |:::::::::/ / \:::\ /:::/ /
 * \::::/ / |::|\::::/ //:::/ / \:::\ /:::/ / |::|\::::/ / \:::\__/:::/ /
 * /:::/ / |::| \::/____/ \::/ / \:::\__/:::/ / |::| \::/____/ \::::::::/ /
 * /:::/ / |::| ~| \/____/ \::::::::/ / |::| ~| \::::::/ /
 * /:::/ / |::| | \::::::/ / |::| | \::::/ /
 * /:::/ / \::| | \::::/ / \::| | \::/____/
 * \::/ / \:| | \::/____/ \:| | ~~
 * \/____/ \|___| ~~ \|___|
 * 
 */
