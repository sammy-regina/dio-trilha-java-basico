import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        try{
            //criando o objeto scanner
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite o seu nome");
            String nome = scanner.next();

            System.out.println("Digite o seu sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Digite a sua idade");
            int idade = scanner.nextInt();

            System.out.println("Digite a sua altura");
            double altura = scanner.nextDouble();

            //imprimindo os dados obtidos pelo usuário
            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase() + ", tenho " + idade + " anos de idade e " + altura + "cm de altura");
            scanner.close();
            
        }
        catch(InputMismatchException e){
            System.err.println("Os campos idade e altura precisam ser numéricos, no campo altura deve se usar ponto para separar os cm, como na convenção de escrita americana");
        }

    }

}
