
package exercicios.exercicios10.questao05;

public class Main {
    public static void main(String[] args) {

        ServicoProcessamento servico =
                new ServicoProcessamento();

        String[] arquivos = {
            "",
            "dados_invalidos.txt",
            "dados_validos.txt"
        };

        for (String arquivo : arquivos) {

            try {
                servico.processarArquivo(arquivo);

            } catch (ProcessamentoDadosException e) {

                System.out.println(
                    "Erro principal: " + e.getMessage()
                );

                System.out.println(
                    "Causa original: "
                    + e.getCause().getMessage()
                );
            }

        }
    }
}
