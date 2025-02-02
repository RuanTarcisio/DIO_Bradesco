package pack;

public interface Banco{

    public ContaBancaria criarConta();
    public Double verificarSaldo(ContaBancaria conta);

}