package StreamAPi.FunctionalInterface;

import java.util.Arrays;
import java.util.List;

public class Predicate {
    public static void main(String[] args) {
        List<String> values = Arrays.asList("teste", "TESTE2","teste3");
        values.stream()
        .filter(p -> p.length() > 5);
        
    }
}
