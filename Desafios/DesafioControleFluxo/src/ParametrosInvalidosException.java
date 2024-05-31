/*
 * Esta é a exceção lançada exclusivamente quando o segundo parâmetro é menor ou igual ao primeiro.
 */
public class ParametrosInvalidosException extends Exception {
    
    public ParametrosInvalidosException() {

        //mensagem de erro específica.
        super("O segundo parâmetro deve ser maior que o primeiro");
    }
}
