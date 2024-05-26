//comando 'FOR'
/* permite que uma variavel contadora seja testada e 
incrementada a cada interação, sendo essas infomações 
definidas na chamada do comando. */

public class ExemploFor {
    public static void main(String[] args) throws Exception {
        
        for ( int carneirinhos = 0; carneirinhos <= 20; carneirinhos ++ ){
            System.out.println("contando carneirinhos " + carneirinhos);
        } 

        System.out.println("Joao dormiu");
        
    }
}
