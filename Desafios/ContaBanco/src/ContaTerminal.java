import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        
        Scanner scanner = new Scanner(System.in);

        /*
         *  O uso do try & finally é uma boa prática para 
         * garantir que o recurso Scanner seja fechado, mesmo se ocorrer 
         * uma exceção. Por isso a ultilização
         */

        try {
            System.out.println("Olá! Bem-vindo ao banco da DIO");  

            System.out.print("Para começarmos o cadastro, digite seu nome: ");
            nomeCliente = scanner.nextLine();

            System.out.print("Cadastre o nome da sua agência: ");
            agencia = scanner.nextLine();

            System.out.print("Cadastre o número da sua conta sem o hifén (-): ");
            numero = scanner.nextInt();

            System.out.print("Cadastre o seu saldo: ");
            saldo = scanner.nextDouble();

            System.out.println("Cadastro finalizado!");
        } finally { // Uso de finally' para garantir que o Scanner seja fechado
            scanner.close();
        }
        System.out.println(
            "Olá Sr(a) " + nomeCliente + ", obrigado por cadastrar sua conta em nosso banco. Sua agência é " + agencia + ", conta número " + numero + " e seu saldo é de R$ " + saldo + " e já está disponível para saque."
        );
    }
}
