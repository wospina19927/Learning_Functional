package functional_01;

public class Mutable_Inmutable_CarTest {

    public static void main (String[] args) {

        MutableCar car = new MutableCar();
        car.setMarca("toyota");
        car.setModelo("Hilux");
        car.setPrecio(100000000);

        InmutableCar carInmutable = new InmutableCar("KIA" ,"Picanto" , 30000000);

        System.out.println("//////////////MUTABLE//////////////////");

        System.out.println("Original -- " + car);
        changeObjectMutable(car);
        System.out.println("Manipulado -- " + car);

        System.out.println("//////////////INMUTABLE//////////////////");

        System.out.println("Original -- " + carInmutable);
        changeObjectInmutable(carInmutable);
        System.out.println("Manipulado -- " + carInmutable);

    }

    static void changeObjectMutable (MutableCar car) {
        car.setPrecio(100);
    }
    static void changeObjectInmutable (InmutableCar car) {
        new InmutableCar(car.getMarca() , car.getModelo() , 200);
    }
}
