import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class SobreMin {

    /*
     * TIPOS DE EXCECÕES
     * Que podem acontecer aqui:
     * - não informar o nome e sobrenome
     * - o valor da idade ter um caracter não numerico
     * - o valor da altura ter uma virgula ao invês de ponto(Padrão US)
     */

    public static void main(String[] args) {

        try {

            Scanner sc = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome:");
            String nome = sc.next();

            System.out.println("Digite seu sobrenome:");
            String sobrenome = sc.next();

            System.out.println("Digite sua idade:");
            int idade = sc.nextInt();

            System.out.println("Digite sua altura:");
            double altura = sc.nextDouble();

            // Imprimindo os dados obtidoos:
            System.out.println("Ola, me chamo " + nome + " " + sobrenome);
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Minha altura é " + altura);

        } catch (InputMismatchException e) {

            System.out.println("Os campos idade e altura precisam ser numericos");

        }
    }
}
