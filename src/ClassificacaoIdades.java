import java.util.InputMismatchException;
import java.util.Scanner;

public class ClassificacaoIdades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) ;
        try {
            System.out.println("Digite a idade do participante: ");
            int idade = scanner.nextInt();

            String categorizar = classificarIdade(idade);
            System.out.println("Categoria: " + categorizar);
             } catch (InputMismatchException e) {
            System.out.println("Por favor digite somente idades: ");
            scanner.nextLine();

             }
            System.out.println("deseja fazer a operação novamente ? S ou N");
             String resposta = scanner.next();
             if (resposta.equalsIgnoreCase("N")) ;
                 continuar = false;
                }
            }
            System.out.println("Valeu");
                 scanner.closer();
}



    public static String classificarIdade(int idade);
    if (idade <=12){
        return"Criança";
        }else if (idade>= 13 && <=17){
        return"Adolecente";
        }else if(idade>= 18 && 59){
        return"Adulto";
        }else if (idade>=60){
        return"idoso";
        }else {
        return "Idade nao se enquadra"
        }
        }
        }