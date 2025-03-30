
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        // Pedir dados dos usuarios 
        System.out.println("Por favor, digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        System.out.println("Por favor, digite o número da agência: ");
        String numeroAgencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente:");
        String nomeCliente = scanner.nextLine(); 

        System.out.println("Por favor, digite o saldo da conta: ");
        double saldo = scanner.nextDouble();
        scanner.nextLine(); //Limpar o buffer do scanner

        //Exibir os dados na tela
        System.out.println("\n Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + "seu saldo é " + saldo + " já está disponével para saque.");




    }
}
