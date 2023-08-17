package ExercicioContador;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o numero inicial da contagem");
            int numInical = sc.nextInt();
            System.out.println("Digite o numero final da contagem");
            int numFinal = sc.nextInt();
            Contador cont = new Contador();
            cont.contar(numInical, numFinal);
        } catch (ContadorException e) {
            System.out.println("Ocorreu um erro executar a função");
        }

    }
}
