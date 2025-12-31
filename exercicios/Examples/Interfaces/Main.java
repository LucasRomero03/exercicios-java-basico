package Examples.Interfaces;

public class Main {
    public static void main(String[] args){
        Pix meropix = new Pix(1,"mero");

        efetuarPagamento(meropix);
        efetuarPagamento(new CartaoCredito(2,"meroCredito",100,300));
        efetuarPagamento(new CartaoDebito(3,"meroDebito",150));

        efetuarPagamento1(meropix,450.00);

        efetuarPagamento1(new CCredito(2,"meroCredito",100),450.00);

        efetuarPagamento1(new CDebito(3,"meroDebito",150),450.00);



        // no primeiro casso vemos apesar de termos dado um new Smartphone que implementa
        // as duas interfaces ele só reconehceu como music por causa do aldo esquerdo da igualdade
        //podemos usar casting ou dar um new direto no método.
        //MusicPlayer musicPlayer = new Smartphone();
//        runVideo(musicPlayer);
//        runMusic(musicPlayer);
//        System.out.println(musicPlayer.getClass().toString());
//        System.out.println("1".getClass().toString());
        //Classe anonima gerada
//        MusicPlayer musicPlayer = new MusicPlayer() {
//            @Override
//            public void playMusic() {
//
//            }
//
//            @Override
//            public void stopMusic() {
//
//            }
//
//            @Override
//            public void pauseMusic() {
//
//            }
//        };
    }

    public static void runVideo( VideoPLayer videoPLayer){
        videoPLayer.playVideo();
    }public static void runMusic(MusicPlayer musicPlayer){
        musicPlayer.playMusic();
    }

    public static void efetuarPagamento(FormaPagamento formaPagamento){
        formaPagamento.pagar(formaPagamento);
    }
    //Forma correta
    public static void efetuarPagamento1(FormaPagamento formaPagamento, Double valor){
        formaPagamento.pagar(valor);
    }
}
