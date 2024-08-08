package Functional_08;

public class FunctionalChaining {
    static class Calculadora {
        int result = 0;
        public Calculadora suma(Integer x) {
            result += x;
            return this;
        }

        public Calculadora resta(Integer x) {
            result -= x;
            return this;
        }

        public Calculadora multiplicacion(Integer x ) {
            result *=  x;
            return this;
        }

        public Calculadora mostrarResultado() {
            System.out.println("El resultado es : " + result);
            return this;
        }


    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora
                .suma(10)
                .resta(5)
                .multiplicacion(2)
                .suma(3)
                .mostrarResultado();
    }
}
