package Functional_09;

import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

import static Functional_07.ReferenceOperator.getList;

public class FunctionalStreams {
    public static void main(String[] args) {

        List<String> listNames = getList("emilsen" , "daniela" , "maria victoria");


        BiFunction<String , List<String>, Optional<List<String>>> getFilterList = (search,list) -> {
            List<String> listFilter = list.stream()
                    .filter(f -> f.toLowerCase().contains(search.toLowerCase()))
                    .collect(Collectors.toList());
            return listFilter.isEmpty() ? Optional.empty() : Optional.of(listFilter);
        };


        Optional<List<String>> list= getFilterList.apply("a", listNames);

        printList(list);

    }

    static void printList(Optional<List<String>> list){
        if(list.isPresent()){
            list.get().forEach(System.out::println);
        }else{
            System.out.println("No Se Encontrarón Coincidencias");
        }
    }
}
