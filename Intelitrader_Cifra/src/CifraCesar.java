public class CifraCesar {

    public static String criptografar(String texto, int shift) {
        StringBuilder resultado = new StringBuilder();
        for (char c : texto.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                resultado.append((char) ((c - base + shift) % 26 + base));
            } else {
                resultado.append(c);
            }
        }
        return resultado.toString();
    }

    public static String descriptografar(String texto, int shift) {
        return criptografar(texto, 26 - shift);
    }

    public static void main(String[] args) {
        String texto = "example text";
        int shift = 4;
        String criptografado = criptografar(texto, shift);
        String descriptografado = descriptografar(criptografado, shift);
        System.out.println("Criptografado: " + criptografado);
        System.out.println("Descriptografado: " + descriptografado);
    }
}
