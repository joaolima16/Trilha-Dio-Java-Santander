import java.util.Scanner;

import Entities.ContaBanco;

public class App{
        public static void main(String[] args) {
            int numConta;
            String agencia,nomeCliente;
            double saldo;
            Scanner sc = new Scanner(System.in);
            System.out.println("Bem vindo a agência bancária");
            System.out.println("Digite o numero da conta");
            numConta = sc.nextInt();
            System.out.println("Digite a agência");
            agencia = sc.next();
            System.out.println("Digite o nome do cliente");
            nomeCliente = sc.next();
            System.out.println("Digite o saldo");
            saldo = sc.nextDouble();
            ContaBanco conta = new ContaBanco(numConta,agencia,nomeCliente,saldo);
            System.out.printf("Olá: %s, obrigado por criar uma conta em nosso banco, sua agência é %s,conta: %d, e seu saldo: %.2f, estão disponíveis", nomeCliente, agencia, numConta, saldo);

        }
}