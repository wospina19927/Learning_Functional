package Functional_07;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class ReferenceOperator {

    public static void main(String[] args) {
        List<LocalDate> dates = getList( LocalDate.of(2024, 8, 1) , LocalDate.of(2025, 9, 11));
        dates.forEach(ReferenceOperator::setText);
    }


    public static<T> List<T> getList(T... elements){
        return Arrays.asList(elements);
    }

    static void setText(LocalDate date) {
        System.out.println("La fecha es " + date.getDayOfMonth() + " de " + String.valueOf(date.getMonth()).toLowerCase() + " del " + date.getYear());
    }
}
