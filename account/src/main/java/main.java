public class main {
    public static void main(String[] args) {

        Banco banco = new BancoImpl("Bradesco");
        ContaBancaria conta = new ContaBancaria();
        conta = banco.criarConta();


    }
}