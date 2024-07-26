import java.util.Base64;

public class Base64App {

    public static String encode(String texto) {
        return Base64.getEncoder().encodeToString(texto.getBytes());
    }

    public static String decode(String texto) {
        return new String(Base64.getDecoder().decode(texto));
    }

    public static void main(String[] args) {
        String texto = "Exemplo";
        String codifica = encode(texto);
        String descodifica = decode(codifica);
        System.out.println("Codifica: " + codifica);
        System.out.println("Descodifica: " +descodifica);
    }
}
