package Functional_05;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.function.BinaryOperator;
import java.util.function.Function;


public class Functional_05 {

    public static void main(String[] args) {

        Function<Integer,BigDecimal> convertBigDecimal = num -> new BigDecimal(String.valueOf(num));

        BinaryOperator<BigDecimal> division = (num1,num2) -> num1.divide(num2,2, RoundingMode.DOWN);
        /* todo : pedir números por teclado
                  validar entradas
        */

        System.out.println(division.apply(convertBigDecimal.apply(10),convertBigDecimal.apply(5)));
    }
}
