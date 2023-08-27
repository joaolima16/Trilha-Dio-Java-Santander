package StreamAPi.Challenges;

import java.util.Arrays;
import java.util.List;

public class Challenge_4 {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1,2,3,4,5,6,7,8,9,10,5,3,4);
        values.stream().filter(num -> num % 3 ==0)
        .forEach(System.out::println);
    }   
}
