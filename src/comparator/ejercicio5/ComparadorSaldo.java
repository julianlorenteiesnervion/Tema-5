package comparator.ejercicio5;

import java.util.Comparator;

public class ComparadorSaldo implements Comparator<CuentaBancaria> {

	@Override
    public int compare(CuentaBancaria c1, CuentaBancaria c2) {
        return Double.compare(c2.getSaldo(), c1.getSaldo());
    }
	
}
