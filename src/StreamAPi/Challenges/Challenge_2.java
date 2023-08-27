package StreamAPi.Challenges;

import java.util.Arrays;
import java.util.List;

public class Challenge_2 {
    public static void main(String[] args) {
         List<Integer> values = Arrays.asList(1,2,3,4,5,6,7,8,9,10,5,3,4);
         int sumValues = values.stream().filter( num -> num %2 ==0)
         .reduce(0, Integer::sum);
         System.out.println(sumValues);
         
    }
}
