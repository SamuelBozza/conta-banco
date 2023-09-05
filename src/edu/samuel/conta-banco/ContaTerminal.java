import java.io.InputStream;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println(
            "------------------------------------------" + "\n" +
            "----------------Bem vindo-----------------" + "\n" +
            "----------------Ao Banco------------------" + "\n" +
            "----------------Santander!----------------" + "\n" +
            "------------------------------------------"
        );

        System.out.println("Por favor, insira o número da Agência: ");
        int numero = scanner.nextInt();
        
        System.out.println("Por favor, agora nos diga qual a Agência: ");
        String agencia = scanner.next();

        scanner.nextLine();

        System.out.println("Certo, agora preciso do seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Por gentileza, insira seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("------------------------------------------");

        System.out.println(
            "Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque!"
        );
    }
}
