import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicitando e lendo os dados do usuário
            System.out.print("Por favor, digite o número da Agência: ");
            String agencia = scanner.nextLine();

            System.out.print("Por favor, digite o número da Conta: ");
            int numero = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            System.out.print("Por favor, digite o seu Nome: ");
            String nomeCliente = scanner.nextLine();

            System.out.print("Por favor, digite o Saldo: ");
            double saldo = scanner.nextDouble();

            // Exibindo mensagem formatada com printf
            System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.%n",
                    nomeCliente, agencia, numero, saldo);
        } finally {
            scanner.close(); // Fecha o Scanner ao final da execução
        }
    }
}