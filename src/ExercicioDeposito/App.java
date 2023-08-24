package ExercicioDeposito;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double valor = 0;
        while (true) {

            valor = scanner.nextDouble();
            if (valor > 0) {
                System.out.printf("Deposito realizado com sucesso! \n Saldo atual: R$ %.2f", valor);
                break;
            } else if (valor == 0) {
                System.out.println("Encerrando o programa...");
                break;
            } else {
                System.out.println("Valor invalido! Digite um valor maior que zero.");
                
            }

        }
        scanner.close();
    }
}
