package functional_04;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Supplier_Consumer {

    public static void main(String[] args) {


        Supplier<List<Libros>> getLibros = () -> {
            List<Libros> libros = new ArrayList<>();
            libros.add(new Libros("Aprendiendo React" , "Carlos Zaustre" , 5));
            libros.add(new Libros("Aprendiendo Javascript" , "Marco Tataleto" , 8));
            libros.add(new Libros("Aprendiendo Java" , "Jorge Carvajal" , 7));

            return libros;
        };

        Predicate<Integer> testPuntaje = n -> n >= 7;

        UnaryOperator<String> mostrarLibrosRecomendado = nombreLibro -> "El Libro : " + nombreLibro + " , Es Recomendado !!";


        Consumer<List<Libros>> validadorLibros = (libros) -> {
            libros.forEach(libro ->{
                if(testPuntaje.test(libro.getPuntaje())){
                    System.out.println(mostrarLibrosRecomendado.apply(libro.getNombre()));
                }
            });
        };

        validadorLibros.accept(getLibros.get());
    }
}
