
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExAlfabetica {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        double valor = 0;
    do{ 
      System.out.println("Valor invalido! Digite um valor maior que zero.");
      valor = scanner.nextDouble();
    }
    while(valor<=0);


    if (valor > 0) {
        //TODO: Imprimir a mensagem de sucesso, formatando o saldo atual (vide Exemplos).
    } else if (valor == 0) {
        //TODO: Imprimir a mensagem de valor inválido.
    } else {
         //TODO: Imprimir a mensagem de encerrar o programa.
    }
}
}