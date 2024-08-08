package Functional_06;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.BiFunction;

public class Functional_SAM {
    public static void main(String[] args) {

        BiFunction<Integer, LocalDate, String> validarEdad = (edad, fechaN) -> {
            int dif = Period.between(fechaN, LocalDate.now()).getYears();
            return edad == dif ? "Corresponde" : "No corresponde";
        };

        TriFunction<String, Integer, LocalDate, String> mostrarEdad = (nombre, edad, fechaN) -> "la fecha de Nacimiento de: " + nombre + ", " + validarEdad.apply(edad, fechaN) + " a la edad Ingresada";


        System.out.println(mostrarEdad.apply("Luis Eduardo", 71, LocalDate.of(1953, 7, 26)));

    }

    @FunctionalInterface
    interface TriFunction <T , U , V , R> {
        R apply(T t , U u , V v);
    }
}
