package pack;

public class ContaBancaria {
    private String nomeTitular;
    private int numeroConta;
    private double saldo;

    public ContaBancaria(String titular, int numeroConta, double saldoInicial) {
        this.nomeTitular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    public ContaBancaria() {
        
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void exibirInformacoes() {

        System.out.println("Titular: " + nomeTitular);
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Saldo Inicial: R$ " + saldo);
    }
    
}