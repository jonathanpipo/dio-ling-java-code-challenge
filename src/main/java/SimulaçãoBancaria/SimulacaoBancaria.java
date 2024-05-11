package SimulaçãoBancaria;

import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    double valorDeposito = scanner.nextDouble();
                    saldo += valorDeposito;
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    double valorSacado = scanner.nextDouble();
                    if (valorSacado > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo -= valorSacado;
                        System.out.println("Saldo atual: " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;
                    break;
                default:
                    break;
            }
        }
    }
}