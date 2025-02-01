import java.util.InputMismatchException;
import java.util.Scanner;

public class BancoImpl implements Banco {

    public BancoImpl() {
    }



    @Override
    public ContaBancaria criarConta() {

        Scanner scanner = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();

        try {
            System.out.println("=== Criar Conta Bancária ===");

            System.out.print("Digite o nome do titular: ");
            String titular = scanner.nextLine();

            System.out.print("Digite o número da conta: ");
            int numeroConta = scanner.nextInt();

            System.out.print("Digite o saldo inicial: R$ ");
            double saldoInicial = scanner.nextDouble();

            conta = new ContaBancaria(titular, numeroConta, saldoInicial);

        } catch (InputMismatchException e) {

            throw new InputMismatchException("Erro: Entrada inválida. Por favor, digite os valores corretos.");
        } catch (Exception e) {
            throw new RuntimeException("Ocorreu um erro inesperado: " + e.getMessage());
        }
        System.out.println("\nConta criada com sucesso!");
        conta.exibirInformacoes();
        return conta;
    }

    @Override
    public Double verificarSaldo(ContaBancaria conta) {
        return conta.getSaldo();
    }

}
