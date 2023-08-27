package StreamAPi.FunctionalInterface;

import java.util.Arrays;
import java.util.List;

public class BinaryOperator {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1,2,4,5,6);
        int sumValues = values.stream().reduce(5,Integer:: min);
        System.out.println(sumValues);

    }

}
