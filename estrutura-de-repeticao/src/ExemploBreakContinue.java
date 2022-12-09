public class ExemploBreakContinue {

    public static void main(String[] args) {

        for (int numero = 1; numero <= 10; numero++) {

            if (numero == 2) {
                System.out.println("vai pular o 2 e continuar");
                continue;
            }

            if (numero == 7)
                break;
            System.out.println("passou " + numero + " vez");
        }

        System.out.println("Encontrou o BREAK e saiu do FOR");
    }
}
