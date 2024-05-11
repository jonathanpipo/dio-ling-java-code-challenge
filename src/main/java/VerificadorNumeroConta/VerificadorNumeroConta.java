package VerificadorNumeroConta;

import java.util.Scanner;

public class VerificadorNumeroConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            String numeroConta = scanner.next();
            if (verificarNumeroConta(numeroConta)) {
                System.out.println("Numero de conta valido.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static boolean verificarNumeroConta(String numeroConta) throws IllegalArgumentException {
        if (numeroConta.length() == 8) {
            return true;
        }
        throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
    }
}