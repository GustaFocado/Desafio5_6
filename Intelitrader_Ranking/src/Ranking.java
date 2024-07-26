import java.util.HashMap;
import java.util.Map;

public class Ranking {

    public static Map<Character, Integer> countCharFrequency(String texto) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : texto.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        return freq;
    }

    public static void main(String[] args) {
        String texto = "Exemplo";
        Map<Character, Integer> frequency = countCharFrequency(texto);
        for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
