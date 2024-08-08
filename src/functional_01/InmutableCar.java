package functional_01;

public  final class  InmutableCar {
    private final String marca;
    private final String modelo;
    private final int precio;

    public InmutableCar(String marca, String modelo, int precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "InmutableCar{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                '}';
    }
}
