/* 
 
PROBLEMA - URI1010

Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.
Entrada

O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, respectivamente dois inteiros e um valor com 2 casas decimais.
Saída

A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espaço após os dois pontos e um espaço após o "R$". O valor deverá ser apresentado com 2 casas após o ponto.

*/

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        int idPc1 = in.nextInt();
        int quantPc1 = in.nextInt();
        double vlrPc1 = in.nextDouble();
        int idPc2 = in.nextInt();
        int quantPc2 = in.nextInt();
        double vlrPc2 = in.nextDouble();
        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", (vlrPc1 * quantPc1)+(vlrPc2 * quantPc2)));
    }
}