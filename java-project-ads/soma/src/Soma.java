import java.util.Scanner;

public class Soma {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int numero1 = scanner.nextInt("digite um número: ");
        int numero2  = scanner.nextInt("Digite mais um");
        int soma = numero1+numero2;

        System.out.println("O resultado da soma é: " + soma);
    }
}
