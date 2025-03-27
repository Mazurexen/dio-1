import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(java.util.Locale.US);
        
        System.out.println("Por favor, digite o número da sua conta: ");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite o número da sua agência: ");
        int agencia = scanner.nextInt();

        System.out.println("Por favor, digite o seu nome: ");
        String nome = scanner.next();

        System.out.println("Por favor, digite o seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Por favor, digite o seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá, " + nome + " " + sobrenome + "! Obrigado por abrir sua conta no nosso banco!");
        System.out.println("Sua agência é: " + agencia);
        System.out.println("Sua conta é: " + conta);
        System.out.println("Seu saldo é: " + saldo + " reais");
        System.out.println("Obrigado por escolher o nosso banco!");
        scanner.close();
    }
}
