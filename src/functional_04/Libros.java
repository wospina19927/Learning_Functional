package functional_04;

public final class Libros {
    private final String nombre;
    private final String autor;
    private final Integer puntaje;

    public Libros(String nombre, String autor, Integer puntaje) {
        this.nombre = nombre;
        this.autor = autor;
        this.puntaje = puntaje;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public Integer getPuntaje() {
        return puntaje;
    }

    @Override
    public String toString() {
        return "Libros{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", puntaje=" + puntaje +
                '}';
    }
}
