package functional_02_03;

import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

public class PowTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese Un Número Entero a Potenciar : ");
        // Faltó validar que solo ingresen enteros
        int num = sc.nextInt();

        Function<Integer,Double> pow = x -> Math.pow(num , num);
        Predicate<Integer> testNum = n -> n % 2 == 0 ;


        int result = pow.apply(num).intValue();
        System.out.println("El Resultado es : " + result);
        System.out.println("El Número es : " + (testNum.test(result) ? "Par" : "Impar"));
    }
}
