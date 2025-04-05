package comparator.ejercicio3;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		List<Futbolista> futbolistas = new ArrayList<>();
        futbolistas.add(new Futbolista("Messi", 35, 700));
        futbolistas.add(new Futbolista("Cristiano", 38, 800));
        futbolistas.add(new Futbolista("Mbappé", 24, 400));
        futbolistas.add(new Futbolista("Neymar", 31, 300));
        futbolistas.add(new Futbolista("Suárez", 36, 450));
        
        // Ordenar por edad
        System.out.println("Futbolistas ordenados por edad (ascendente):");
        Collections.sort(futbolistas, new ComparadorEdad());
        for (Futbolista f : futbolistas) {
            System.out.println(f);
        }

        System.out.println();

        // Ordenar por goles
        System.out.println("Futbolistas ordenados por goles (de más a menos):");
        Collections.sort(futbolistas, new ComparadorGoles());
        for (Futbolista f : futbolistas) {
            System.out.println(f);
        }

	}

}
