public class ExemploBreakContinue {
    public static void main(String[] args) {
        
        for ( int numero = 1; numero <=5; numero++){
            if (numero == 3) {
                System.out.println("numero é igual a " + numero);
                //break; // o comando break ele vai parar exatamente no numero da condição do 'if'
                continue; // o comando continue vai continuar mostrando os numeros, menos o da condição 'if', no codigo, ele esta mostrando por causa do comando 'sout', que eu pedi para mostrar na tela
            }
            System.out.println(numero);
        }
        



    }
}
