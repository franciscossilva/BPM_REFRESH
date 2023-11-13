import java.util.Scanner;

public class VericarCaracteres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char caractere = 0;

        do {
                System.out.println("Digite um caractere ou zero para encerrar: ");
                String input = scanner.nextLine();

                if (input.length() != 1) {
                System.out.println("Por favor digite apenas um caractere");
                continue;
                }

                caractere = input.charAt(0);

                if (Character.isUpperCase(caractere)) {
                    System.out.println("É uma letra maiuscula: ");
                } else if (Character.isLowerCase(caractere)) {
                    System.out.println("É uma letra minuscula: ");
                } else if (Character.isDigit(caractere)) {
                    System.out.println("É um caractere especial");
                } else {
                    System.out.println("É um caractere especial: ");
                }

                } while (caractere != '0');

                scanner.close();

            }

    }