import java.util.InputMismatchException;
import java.util.Scanner;


public class MenorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
                try {
                System.out.println("Digite os tres numeros:");
                int numero01 = scanner.nextInt();
                int numero02 = scanner.nextInt();
                int numero03 = scanner.nextInt();


                int numeroMenor = Math.min(Math.min(numero01, numero02), numero03);
                System.out.println(" O menor numero digitado entre eles é: " + numeroMenor);


                System.out.println("deseja fazer a operação novamente ? S ou N");
                String resposta = scanner.next().trim().toLowerCase();
                if (resposta.equals("N")) {
                    break;
                }
                }catch(InputMismatchException e){
                    System.out.println(" Invalido. Certifique de digitar 3 numeros validos");
                    scanner.nextInt();
                }

            }
            scanner.close();
        }
    }
