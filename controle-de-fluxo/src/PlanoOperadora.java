public class PlanoOperadora {

    public static void main(String[] args) {
        int opcao = 2;

        switch (opcao) {
            case 1: {
                System.out.println("5Gb Youtube");
                break;
            }
            case 2: {
                System.out.println("WhatsApp e Instagram Grátis");
                break;
            }
            case 3: {
                System.out.println("200 minutos em ligações");
                break;
            }
            default:
                System.out.println("Opção Invalida!");
        }
    }

}
