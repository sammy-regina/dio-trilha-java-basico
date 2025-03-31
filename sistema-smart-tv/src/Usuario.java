public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv Ligada: " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> Tv Ligada: " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status -> Tv Ligada: " + smartTv.ligada);

        smartTv.dimunuirVolume();
        smartTv.dimunuirVolume();
        smartTv.dimunuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume Atual: " + smartTv.volume);

        //mudando para canal específico
        smartTv.mudarCanal(13);
        System.out.println("Mudar canal para: " + smartTv.canal);
    }
    
}
