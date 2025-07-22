package recursividade.algoritmos;

public class TorreDeHanoi {

    public static void executar(int n, char origem, char auxiliar, char destino) {
        if(n == 1){
            System.out.printf("Move disco 1 de %c para %c\n", origem, destino);
        } else {
            executar(n-1, origem, destino, auxiliar);
            System.out.printf("Move disco %d de %c para %c\n", n, origem,destino);
            executar(n-1, auxiliar, origem, destino);
        }

    }

}
