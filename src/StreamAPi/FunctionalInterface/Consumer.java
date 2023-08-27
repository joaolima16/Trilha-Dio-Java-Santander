package StreamAPi.FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Consumer {
    public static void main(String[] args) {
        List<Integer> lsValues = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho do array");
        int size = sc.nextInt();

        for(int i = 0; i<size; i++){
            System.out.println("Digite o valor da posição :" + i);
            int value = sc.nextInt();
            lsValues.add(value);
        }
        lsValues.stream().forEach(num -> {
            if(num%2 == 0){
                System.out.println("Valores pares: " + num );
            }
            else{
                System.out.println("Valores impares: " + num);
            }
        });
    }
}
