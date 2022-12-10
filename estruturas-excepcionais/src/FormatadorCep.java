public class FormatadorCep {

    public static void main(String[] args) {
        try {

            String cepFormatado = formatarCep("16200001");
            System.out.println(cepFormatado);

        } catch (CepInvalidoException e) {
            // TODO Auto-generated catch block
            System.out.println("O CEP esta com mais de 8 digitos");
        }

    }

    /**
     * Metodo criado para retornar um CEP formatado
     */
    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8)
            throw new CepInvalidoException();

        cep = (cep.substring(0, 2) + "." + (cep.substring(2, 5) + "-" + (cep.substring(5, 8))));

        return cep;
    }
}
