package recursividade.utilizacao;

import recursividade.algoritmos.TorreDeHanoi;

/**
 * @author Actual code:
 * Carlos Urbano<carlos.urbano@ipleiria.pt>
 * Catarina Reis<catarina.reis@ipleiria.pt>
 * Marco Ferreira<marco.ferreira@ipleiria.pt>
 * João Ramos<joao.f.ramos@ipleiria.pt>
 * Original code: José Magno<jose.magno@ipleiria.pt>
 */
public class MainRecursividade {

    public static void main(String[] args) {
        new TorreDeHanoi().executar(3, 'A', 'B', 'C');
    }
}
