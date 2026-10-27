
package exercicios.exercicios10.questao05;
import java.io.IOException;

public class ServicoProcessamento {
    public void processarArquivo(String caminho)
            throws ProcessamentoDadosException {

        try {

            if (caminho == null || caminho.isBlank()) {
                throw new IOException(
                    "O caminho do arquivo nao foi informado."
                );
            }

            System.out.println("Processando arquivo: " + caminho);

            // simulando
            String dado = caminho.equals("dados_invalidos.txt")
                    ? "ABC" : "123";

            int numero = Integer.parseInt(dado);

            System.out.println(
                "Dado processado com sucesso: " + numero
            );

        } catch (IOException | NumberFormatException e) {

            throw new ProcessamentoDadosException(
                "Falha ao processar o arquivo: " + caminho,
                e
            );
        }
    }
}
