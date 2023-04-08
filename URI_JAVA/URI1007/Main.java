/* 
 
PROBLEMA - URI1007

Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo 
produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

Entrada:
O arquivo de entrada contém 4 valores inteiros.

Saída:
Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme exemplo abaixo, com um espaço em 
branco antes e depois da igualdade.



*/

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int D = in.nextInt();
        System.out.println("DIFERENCA = "+((A*B)-(C*D)));

    }
}