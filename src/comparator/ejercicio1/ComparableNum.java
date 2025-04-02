package comparator.ejercicio1;

import java.util.Comparator;

public class ComparableNum implements Comparator<Integer> {

	/**
	 * Método compare para comparar si los dos números son menores, mayores o iguales
	 */
	@Override
	public int compare(Integer o1, Integer o2) {
		return o2 - o1;
	}

}
