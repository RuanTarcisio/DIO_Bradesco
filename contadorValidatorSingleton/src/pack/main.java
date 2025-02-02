package pack;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int parametro1;
        int parametro2;
        Scanner scanner = new Scanner(System.in);
        ContadorSingleton contador = ContadorSingleton.getInstancia();
        try {
            System.out.println("=== Digite o 1º parametro: ===");
            parametro1 = scanner.nextInt();
            System.out.println("=== Digite o 2º parametro: ===");
            parametro2 = scanner.nextInt();
            contador.contar(parametro1, parametro2);
        }catch (ParametrosInvalidosException exc){
            System.err.println("\n\n1ª Parametro maior do que o 2ª.");
        }
        catch (Exception e) {
            System.err.println("\n\nValor informado é inválido");
        }

    }
}
