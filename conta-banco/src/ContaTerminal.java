import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor digite o numero da sua conta: ");
        int numero = scanner.nextInt();
        System.out.println("Por favor digite o numero da sua Agencia: ");
        String agencia = scanner.next();
        System.out.println("Por favor digite seu Nome completo: ");
        scanner.nextLine();
        String nomeCliente = scanner.nextLine();
        System.out.println("Por favor digite seu saldo: ");
        double saldo = scanner.nextDouble();

        

        System.out.println("Olá "+nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de:" + saldo + " já está disponível para saque.");
    }
    
}
