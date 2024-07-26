import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class IntersecaoArquivos {

    public static void main(String[] args) {
        String arquivo1 = "caminho/do/primeiro/arquivo.txt";
        String arquivo2 = "caminho/do/segundo/arquivo.txt";
        String arquivoIntersecao = "caminho/do/arquivo/intersecao.txt";

        try {
            Set<String> linhasArquivo1 = lerLinhasArquivo(arquivo1);
            Set<String> linhasArquivo2 = lerLinhasArquivo(arquivo2);
            linhasArquivo1.retainAll(linhasArquivo2);
            escreverLinhasArquivo(arquivoIntersecao, linhasArquivo1);
            System.out.println("Arquivo de interseção gerado com sucesso.");
        } catch (IOException e) {
            System.err.println("Erro ao processar os arquivos: " + e.getMessage());
        }
    }

    private static Set<String> lerLinhasArquivo(String caminhoArquivo) throws IOException {
        Set<String> linhas = new HashSet<>();
        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                linhas.add(linha);
            }
        }
        return linhas;
    }

    private static void escreverLinhasArquivo(String caminhoArquivo, Set<String> linhas) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoArquivo))) {
            for (String linha : linhas) {
                bw.write(linha);
                bw.newLine();
            }
        }
    }
}
