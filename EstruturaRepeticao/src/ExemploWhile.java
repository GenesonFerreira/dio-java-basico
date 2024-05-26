import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0) {
            double valorDoce = valorAleatorio();
            
            if (valorDoce > mesada) {
                valorDoce = mesada;
            }

            System.out.println("Doce do valor: " + valorDoce + " Adionado no carrinho");
            mesada = mesada - valorDoce;
        }

            System.out.println("mesada: " + mesada);
            System.out.println("Joaozinho gastou sua mesada com doce");
    }
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(1, 5);
    }
}
