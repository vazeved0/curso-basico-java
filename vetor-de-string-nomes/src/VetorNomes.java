import java.util.Scanner;

public class VetorNomes {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[30];

        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + "° Digite o Nome: ");
            nomes[i] = sc.nextLine();
        }

        // imprimindo o terceiro nome da lista
        System.out.println(nomes[2]);

        // imprimindo o setimo nome da lista
        System.out.println(nomes[6]);

        // imprimindo o nono nome da lista
        System.out.println(nomes[8]);

    }

}
