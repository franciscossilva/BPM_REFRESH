import java.util.Scanner;

public class VerificarNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true){
        try {
            System.out.println("Digite um numero real: ");
            double numero = scanner.nextDouble();
            System.out.println(numero == (int) numero ? "É um numero inteiro" : "É um numero decimal");
              } catch (Exception e) {
            System.out.println("Erro, inserir um numero real ");
            scanner.next();
        }
            System.out.println("deseja fazer a operação novamente ? S ou N");
             String resposta = scanner.next().trim().toLowerCase();
            if (resposta.equals("N")) {
             break;
        }
    }
    scanner.close();
}
}
