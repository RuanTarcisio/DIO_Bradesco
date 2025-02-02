public class ContadorSingleton {
    private static ContadorSingleton instancia;


    private ContadorSingleton() {}

    public static ContadorSingleton getInstancia() {
        if (instancia == null) {
            instancia = new ContadorSingleton();
        }
        return instancia;
    }


    public static void contar(int parametro1, int parametro2)throws ParametrosInvalidosException {

        if(parametro1 > parametro2){
            throw new ParametrosInvalidosException("1º parâmetro maior que o 2ª");
        }
        else if(parametro1 == parametro2)
            System.out.println(1);
        else{
            int ndx = parametro2 - parametro1;
            for (int i = 1; i <= ndx ; i++) {
                System.out.println(i);
            }
        }
    }
}
