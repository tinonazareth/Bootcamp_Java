public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        
        System.out.println("TV Ligada? " + smartTv.tvLigada);
        System.out.println("Canal Atual: " + smartTv.canalAtual);
        System.out.println("Volume Atual: " + smartTv.volumeAtual);

        smartTv.ligar();
        System.out.println("TV Ligada? " + smartTv.tvLigada);
        smartTv.desligar();
        System.out.println("Novo status - TV Ligada? " + smartTv.tvLigada);

        System.out.println("Volume Atual: " + smartTv.canalAtual);
        smartTv.mudarCanal(13);
        System.out.println("Volume Atual: " + smartTv.canalAtual);

        smartTv.diminuirVolume();
        System.out.println("Volume Atual: " + smartTv.volumeAtual);
        smartTv.aumentarVolume();
        System.out.println("Novo status - Volume Atual: " + smartTv.volumeAtual);
    }
}     
    