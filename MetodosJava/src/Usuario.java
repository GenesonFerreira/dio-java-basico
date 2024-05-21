public class Usuario{
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada: " + smartTv.ligada);
        System.out.println("Canal padrao da TV: "+ smartTv.canal);
        System.out.println("Volume Padrao da TV: " + smartTv.volume);
        
        smartTv.ligar(); // metodo que vai ligar a TV
        smartTv.aumentarVolume(); // metodo que vai fazer a verificação se a tv esta ligada e se sim, aumenta o volume em +1
        smartTv.aumentarVolume();// metodo que vai fazer a verificação se a tv esta ligada e se sim, aumenta o volume em +1
        smartTv.aumentarCanal();// metodo que vai fazer a verificação se a tv esta ligada e se sim, aumenta o canal em +1
        smartTv.mudarCanal(15);// metodo que vai fazer a verificação se a tv esta ligada e se sim, muda o canal para o numero declarado
        smartTv.mudarCanal(99);// metodo que vai fazer a verificação se a tv esta ligada e se sim, muda o canal para o numero declarado
        smartTv.diminuirCanal();// metodo que vai fazer a verificação se a tv esta ligada e se sim, diminui o canal em -1
        smartTv.diminuirCanal();// metodo que vai fazer a verificação se a tv esta ligada e se sim, diminui o canal em -1
        smartTv.diminuirVolume();// metodo que vai fazer a verificação se a tv esta ligada e se sim, diminui o volume em -1
        smartTv.desligar();// metodo que vai desligar a TV
        smartTv.aumentarVolume();// metodo que vai fazer a verificação se a tv esta ligada e se nao, nao faz nada

    }


}
