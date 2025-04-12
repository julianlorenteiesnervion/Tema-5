package excepciones.ejercicio2.principal;

import excepciones.ejercicio2.clases.*;
import excepciones.ejercicio2.excepciones.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        try {
            System.out.print("Introduce el DNI del titular: ");
            String dni = reader.next();

            System.out.print("Introduce el nombre del titular: ");
            String nombre = reader.next();
            reader.nextLine();

            System.out.print("Introduce los apellidos del titular: ");
            String apellidos = reader.nextLine();

            System.out.print("Introduce el teléfono del titular: ");
            int telefono = reader.nextInt();

            Titular titular = new Titular(dni, nombre, apellidos, telefono);

            System.out.print("Introduce el saldo inicial: ");
            double saldo = reader.nextDouble();

            System.out.print("Introduce el porcentaje de transacción: ");
            double porcentaje = reader.nextDouble();

            CuentaCorriente cuenta = new CuentaCorriente(saldo, titular, porcentaje);
            System.out.println("\nCuenta creada correctamente:");
            System.out.println(cuenta);

        } catch (DniInvalidoException | NombreInvalidoException |
                 SaldoInicialInvalidoException e) {
            System.out.println(e);
        }
        
        
        reader.close();
    }
}
