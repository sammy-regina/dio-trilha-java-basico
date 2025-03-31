public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    //Criando métodos para manipolar os estados da tv
    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume ++;
        System.out.println("Aumentando volume para: " + volume);
    }

    public void dimunuirVolume(){
        volume --;
        System.out.println("Diminuindo volume para: " + volume);
    }

    //mudando canal de 1 em 1
    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    //mudando canal para canal específico
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    
}
