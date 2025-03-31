import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //exibir as mensagens para o usuário
        System.out.println("Por favor, digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o número da agência: ");
        String agência = scanner.next();

        System.out.println("Digite o seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite o seu sobrenome: ");
        String sobrenomeCliente = scanner.next();

        System.out.println("Digite o saldo da conta (use ponto como separador decimal):  ");
        double saldo = scanner.nextDouble();

        System.out.println("Conta criada com sucesso!");

        System.out.print("Olá " + nomeCliente + " " + sobrenomeCliente + ", obrigada por criar uma conta em nosso banco, sua agência é " + agência + ", conta " + numeroConta + " e seu saldo de R$ " + saldo + " ja está disponível para saque.");

        scanner.close();

    }
}
