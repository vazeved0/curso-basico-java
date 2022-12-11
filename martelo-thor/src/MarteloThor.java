import java.util.Scanner;

class MarteloThor {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantas pessoas vão tentar?");
        int pessoas = leitor.nextInt();
        String nome;
        int N;

        for (int i = 0; i < pessoas; i++) {

            System.out.println("Informe o nome da " + (i + 1) + "° pessoa: ");
            nome = leitor.next();
            System.out.println("Informe a força em Newtons utilziada: ");
            N = leitor.nextInt();

            if (nome.equals("Thor"))
                System.out.println("Levantou");
            else
                System.out.println("Não foi dessa vez " + nome);
        }

    }

}
