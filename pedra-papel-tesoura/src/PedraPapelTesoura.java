import java.util.Scanner;
import java.util.Random;

public class PedraPapelTesoura {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        // Numerod e jogadores
        System.out.println("Informe a quantidade de rodadas:");
        int N = sc.nextInt();
        String jogador1 = "", computador = "";

        for (int i = 0; i < N; i++) {

            System.out.println("Digite o numero de sua escolha:");
            System.out.println("1 = PEDRA");
            System.out.println("2 = PAPEL");
            System.out.println("3 = TESOURA");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    jogador1 = "pedra";
                    break;
                case 2:
                    jogador1 = "papel";
                    break;
                case 3:
                    jogador1 = "tesoura";
                    break;
                default:
                    System.out.println("Opção invalida!");
            }

            computador = escolhaComputador();

            System.out.println("Jogador = " + jogador1);
            System.out.println("Computador = " + computador);

            if (jogador1.equalsIgnoreCase("pedra") && computador.equalsIgnoreCase("pedra"))
                System.out.println("Ambos perderam");
            else if (jogador1.equalsIgnoreCase("papel") && computador.equalsIgnoreCase("papel"))
                System.out.println("Ambos venceram");
            else if (jogador1.equalsIgnoreCase("pedra") && computador.equalsIgnoreCase("papel"))
                System.out.println("Computador venceu");
            else if (jogador1.equalsIgnoreCase("papel") && computador.equalsIgnoreCase("tesoura"))
                System.out.println("Computador venceu");
            else if (jogador1.equalsIgnoreCase("tesoura") && computador.equalsIgnoreCase("papel"))
                System.out.println("Jogador venceu");
            else if (computador.equalsIgnoreCase("pedra") && jogador1.equalsIgnoreCase("papel"))
                System.out.println("Jogador venceu");
            else if (computador.equalsIgnoreCase("tesoura") && jogador1.equalsIgnoreCase("pedra"))
                System.out.println("Jogador venceu");
            else if (jogador1.equalsIgnoreCase("tesoura") && computador.equalsIgnoreCase("pedra"))
                System.out.println("Computador venceu");
            else
                System.out.println("Ambos perderam");
        }
    }

    public static String escolhaComputador() {
        Random r = new Random();
        String escolhaComputador = "";

        switch (r.nextInt(1, 4)) {
            case 1:
                escolhaComputador = "pedra";
                break;
            case 2:
                escolhaComputador = "papel";
                break;
            case 3:
                escolhaComputador = "tesoura";
                break;

        }
        return escolhaComputador;
    }
}
