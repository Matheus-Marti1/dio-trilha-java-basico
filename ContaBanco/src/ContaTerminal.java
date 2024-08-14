import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Olá! Para começar, digite o seu nome: ");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Digite o número da conta: ");
        int numConta = scanner.nextInt();
        
        System.out.println("Digite o número da agência: ");
        String numAgencia = scanner.next();
        
        System.out.println("Digite o seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numAgencia + ", conta " + numConta + " e seu saldo " + saldo + " já está disponível para saque.");
        
        scanner.close();
    }
}
