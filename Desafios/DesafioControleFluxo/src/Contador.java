import java.util.Scanner;
public class Contador {
    
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            // Tenta executar o método contar com os parâmetros fornecidos.
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            // Captura a exceção e imprime a mensagem de erro.
            System.out.println(exception.getMessage());
        }
        // Fecha o objeto Scanner para liberar recursos.
        terminal.close();
    }
    
    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Verifica se o primeiro parâmetro é maior que o segundo.
        if (parametroUm > parametroDois) {
            // exibe a mensagem personalizada se a condição for verdadeira.
            throw new ParametrosInvalidosException();
        } else {
            int contagem = parametroDois - parametroUm;
            for (int indice = 1; indice <= contagem; indice++) {
                System.out.println(indice);
            }
        }
    }
}
