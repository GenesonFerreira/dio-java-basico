import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
   public static void main(String[] args) {
       
       try {
        Scanner leitorScanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome: ");
        String nome = leitorScanner.nextLine();
        
        System.out.println("Digite seu sobrenome: ");
        String sobrenome = leitorScanner.nextLine();
        
        System.out.println("Digite sua idade: ");
        int idade = leitorScanner.nextInt();
        
        System.out.println("Digite sua altura: ");
        double altura = leitorScanner.nextDouble();
        
        System.out.println("Ola, me chamo " + nome.toUpperCase() +" " + sobrenome.toUpperCase());
        System.out.println("Tenho "+ idade + " anos");
        System.out.println("Minha altura é de "+ altura + " cm");
        
        leitorScanner.close();
        
        } 
        catch(InputMismatchException e){
            System.err.println("Os campos de idade e altura precisam ser numericos");
        }
    }
}
