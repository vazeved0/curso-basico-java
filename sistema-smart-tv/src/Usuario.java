public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv tv = new SmartTv();

        tv.aumentarVolume();

        System.out.println("TV ligada: " + tv.ligada);
        System.out.println("Volume Atual: " + tv.volume);
        System.out.println("Canal Atual: " + tv.canal);

        tv.ligar();
        System.out.println("TV ligada: " + tv.ligada);

        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume();
        System.out.println("Volume Atual: " + tv.volume);

        tv.trocarCanal(13);
        System.out.println("Canal Atual: " + tv.canal);

        tv.trocarCanalMais();
        tv.trocarCanalMais();
        System.out.println("Canal Atual: " + tv.canal);

        tv.ligar();
        System.out.println("TV ligada: " + tv.ligada);

    }
}
