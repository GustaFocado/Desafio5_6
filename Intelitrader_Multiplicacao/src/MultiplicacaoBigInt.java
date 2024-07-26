import java.math.BigInteger;
import java.util.Scanner;

public class MultiplicacaoBigInt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número grande:");
        String numero1 = scanner.nextLine();

        System.out.println("Digite o segundo número grande:");
        String numero2 = scanner.nextLine();

        BigInteger bigInt1 = new BigInteger(numero1);
        BigInteger bigInt2 = new BigInteger(numero2);

        BigInteger resultado = bigInt1.multiply(bigInt2);

        System.out.println("Resultado da multiplicação:");
        System.out.println(resultado.toString());
    }
}
