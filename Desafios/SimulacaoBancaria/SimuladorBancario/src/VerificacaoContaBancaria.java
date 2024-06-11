import java.util.Scanner;

public class VerificacaoContaBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numeroConta = scanner.nextLine();

        try {
            validarNumeroConta(numeroConta);
            System.out.println("Numero de conta valido.");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        scanner.close();
    }

    public static void validarNumeroConta(String numeroConta) {
        if (numeroConta.length() != 8) {
            throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
        }
    }
}