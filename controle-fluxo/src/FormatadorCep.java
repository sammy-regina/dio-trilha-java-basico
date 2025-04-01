public class FormatadorCep {

    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23765064"); // Passa uma String
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("Erro: CEP inválido - " + e.getMessage()); // Imprime a mensagem da exceção
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8) {
            throw new CepInvalidoException("O CEP deve conter 8 dígitos."); // Adiciona uma mensagem à exceção
        }

        return cep.substring(0, 5) + "-" + cep.substring(5, 8); // Formata o CEP corretamente
    }
}

// Classe para representar a exceção de CEP inválido
class CepInvalidoException extends Exception {
    public CepInvalidoException(String message) {
        super(message);
    }
}