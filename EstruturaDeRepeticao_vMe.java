package com.minhaempresa.exemplo;
import java.util.Scanner;

public class EstruturaDeRepeticao_vMe {
    /*
    Autor: Marcos Cavalcante Marques
    Implementação: Michel de Brito, 18-01-2023
    Observações:
        Implementei um while para o usuário selecionar o loop
        que quer executar enquanto ele quiser continuar.
     */
    public static void main (String [] args) {
    /*  For, Sintaxe:
        for ( <inicio> ; <condicao> ; <incremento>) {
            <comando1>
            <comando2>
        }
     */
        Scanner teclado = new Scanner(System.in);
        int iOpcao = 0;
        int a;
        int i;

        String sMsgOpcoes = "Digite a opção de Loop a exibir:\n" +
                "* Considerando que, inicialmente,  a=5 e i=0 ... \n" +
                "1 para for (i = 0; i < a ; i++) \n" +
                "2 para for (i = 10; i >= a ; i--) \n" +
                "3 para for (i = 0; i <= a;) \n" +
                "4 para for (i = 0; i < 3 ; i++) \n" +
                "5 para for (; ; ) \n" +
                "6 para while (a != 0) \n" +
                "7 para do {...} while (a > 1000) \n" +
                "99 para Outros \n" +
                "-1 para Sair.";

        while (iOpcao != -1) { // inicio o Grande while

            // Reiniciar variáveis para os Loops:
            a = 5;
            i = 0;

            System.out.println( sMsgOpcoes );
            iOpcao = teclado.nextInt();

            if (iOpcao == 1) {
                System.out.println("for (i = 0; i < a ; i++)");
                for (i = 0; i < a; i++) {
                    System.out.println("O valor i é " + i);
                }
            }

            if (iOpcao == 2) {
                System.out.println("for (i = 10; i >= a ; i--)");
                for (i = 10; i >= a; i--) {
                    System.out.println("O valor i é " + i);
                }
            }

            if (iOpcao == 3) {
                System.out.println("for (i = 0; i <= a;)");
                for (i = 0; i <= a; ) {
                    System.out.println("O valor i é " + i);
                    i++;
                }
            }

            if (iOpcao == 4) {
                System.out.println("for (i = 0; i < 3 ; i++)");
                for (i = 0; i < 3; i++) {
                    System.out.println("O valor i é " + Math.random());
                }
            }

            if (iOpcao == 5) {
                System.out.println("for (; ; )");
                for (; ; ) {
                    i++;
                    if (i > 9) {
                        System.out.println("i vale " + i);
                        break;
                    }
                }
            }

            /*  While, Sintaxe:
                while (<condicao verdadeira>) {
                    <comando1>
                    <comando2>
                }
            */

            if (iOpcao == 6) {
                System.out.println("while (a != 0)");
                // a = 5;
                while (a != 0) {
                    System.out.println("a vale " + a);
                    a--;
                }
            }

            if (iOpcao == 99) {
                System.out.println("while (a != 100) // if (a < 40) continue // if (a == 50) break");
                while (a != 100) {
                    a++;
                    if (a < 40) {
                        continue;
                    }
                    System.out.println("a vale " + a);
                    if (a == 50) {
                        System.out.println("Loop interrompido com a valendo " + a);
                        break;
                    }
                }

                System.out.println("if (a == 50) ... while (a < 100) break");
                if (a == 50) {
                    while (a < 100) {
                        if (a++ >= 70) {
                            System.out.println("a vale " + a);
                            break;
                        }
                    }
                }
            }

            /*  Do while, Sintaxe:
                do {
                    <comando1>
                    <comando2>
                } while (<condicao verdadeira>)
            */

            if (iOpcao == 7) {
                System.out.println("do { ... } while (a > 1000)");
                // a = 5;
                do {
                    System.out.println("a vale " + a);
                } while (a > 1000); //a nunca será maior que 1.000 porém vai executar uma vez.
            }

            if (iOpcao != -1 ) {
                System.out.println("Digite \n0 para CONTINUAR ou -1 para FINALIZAR");
                iOpcao = teclado.nextInt();
            }
            if (iOpcao == -1 ) {
                System.out.println("---------FIM---------");
            }

        } // Fim do Grande while


    }
}
