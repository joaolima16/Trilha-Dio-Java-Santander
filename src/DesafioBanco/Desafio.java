package DesafioBanco;

import java.util.Scanner;

public class Desafio {

  public static void main(String[] args) {
    // Lendo os dados de Entrada:
    Scanner scanner = new Scanner(System.in);
    int numeroConta = scanner.nextInt();
    scanner.nextLine(); // Consome a quebra de linha após a entrada do número da conta
    String nomeTitular = scanner.nextLine();
    double saldo = scanner.nextDouble();

    //TODO: Criar uma instância de "ContaBancaria" com os valores de Entrada.
    ContaBancaria conta = new ContaBancaria(numeroConta,nomeTitular,saldo);
    
    //TODO: Imprimir as informações da conta usando o objeto criado no TODO acima.
      System.out.printf("Informacoes: \n Conta: %d \n Titular: %s \n Saldo: R$ %.1f ", numeroConta,nomeTitular,saldo);
  }
}

class ContaBancaria {
  int numero;
  String titular;
  double saldo;

  public ContaBancaria(int numero, String titular, double saldo) {
    this.numero = numero;
    this.titular = titular;
    this.saldo = saldo;
  }
}
