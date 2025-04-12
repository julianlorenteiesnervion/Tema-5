package comparator.ejercicio5;

import java.util.Comparator;

public class ComparadorApellidosNombre implements Comparator<Titular> {

	@Override
    public int compare(Titular titular1, Titular titular2) {
        int resultado = titular1.getApellidos().compareTo(titular2.getApellidos());
        if (resultado == 0) {
            resultado = titular1.getNombre().compareTo(titular2.getNombre());
        }
        return resultado;
    }
	
}
