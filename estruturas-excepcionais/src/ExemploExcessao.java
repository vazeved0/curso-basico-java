import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcessao {

    public static void main(String[] args) throws ParseException {
        // Number valor = Double.valueOf("a1.75");

        Number valor = NumberFormat.getInstance().parse("a1.75");
        System.out.println(valor);
    }

}
