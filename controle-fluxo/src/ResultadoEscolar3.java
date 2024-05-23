public class ResultadoEscolar3 {
    public static void main(String[] args) {

        int nota = 4;  // Declaração da variável 'nota' com o valor 4
       
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";  
            /*  Primeiro operador ternário: Se 'nota' >= 7, 'resultado' será "Aprovado"
            Segundo operador ternário: Se 'nota' for >= 5 e < 7, 'resultado' será "Recuperação"
            Caso contrário, 'resultado' será "Reprovado"
            */
        
        //String resultado = nota >= 7 ? "Aprovado" : "Reprovado";  // Uso de operador ternário para determinar o 'resultado' baseado na 'nota'
            /* Se 'nota' for maior ou igual a 7, 'resultado' será "Aprovado", senão será "Reprovado"
            */
       
       System.out.println(resultado);  // Exibe o valor da variável 'resultado' no console
    }
}
