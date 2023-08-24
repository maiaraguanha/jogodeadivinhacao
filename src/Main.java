import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);
        int tentativas = 0;

        System.out.println(numeroGerado);

        while (tentativas < 5) {
            System.out.println(tentativas + " Tente advinhar o número de 0 a 100: ");
            int numeroDigitado = leitura.nextInt();
            tentativas++;


             if (numeroDigitado == numeroGerado) {
                 System.out.println("Parabéns, você acertou em " + tentativas + " tentativa(s)!");
                 break;
             } else if (numeroDigitado < numeroGerado) {
                 System.out.println("O número digitado é menor que o número gerado.");
             } else {
                 System.out.println("O número digitado é maior que o número gerado.");
             }
        }

        if (tentativas == 5) {
            System.out.println("Você não conseguiu adivinhar o número em 5 tentativas. O número era " + numeroGerado);
        }

    }
}