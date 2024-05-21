public class SmartTv {
    
    boolean ligada = false;
    int canal = 1;
    int volume = 15;


    // metodo para ligar e desligar
    public void ligar(){
     System.out.println("Você ligou a TV");
        ligada = true;
    }
    public void desligar(){
        System.out.println("Você desligou a TV");
        ligada = false;
    }


    // metodo para aumentar e diminuir volume
    public void aumentarVolume(){
        if (ligada) {
            //volume = volume + 1;
            volume++;
            System.out.println("Você aumentou o volume da TV " + volume);
        } else
        System.out.println("Tv desligada");
    }

    public void diminuirVolume(){
        if (ligada) {
            //volume = volume - 1;
            volume--;
            System.out.println("Você diminuiu o volume da TV: " + volume);
        } else
        System.out.println("Tv desligada");
    }


    //metodo para aumentar, diminuir e trocar canal
    public void aumentarCanal(){
        if (ligada) {   
            //canal = canal + 1;
            canal++;
            System.out.println("Você aumentou o canal da TV para: " + canal);
        } else
        System.out.println("Tv desligada");

    }

    public void diminuirCanal(){
        if (ligada) {   
        //canal = canal + 1;
        canal--;
        System.out.println("Você diminuiu o canal da TV para: " + canal);
        } else
        System.out.println("Tv desligada");
    }

    public void mudarCanal(int novoCanal){
        if (ligada) {   
            canal = novoCanal;
            System.out.println("Você mudou o canal da TV para: " + canal);
        } else
        System.out.println("Tv desligada");

    }
}
