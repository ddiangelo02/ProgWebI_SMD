/**
 * PROGRAMAÇÃO PARA WEB I - LISTA DE EXERCÍCIOS SOBRE JAVA BÁSICO
 * DISCENTE: DAILANE DE SOUZA FLORENCIO
 * MATRÍCULA: 538120
 */
// Importação do pacote
package com.mycompany.progwebi.e1;

// Importação de classe
import java.util.Scanner;
import java.lang.Math;

// Classe principal
public class ProgWebI_L1 {

    // Método principal
    public static void main(String[] args) {

        int opcao;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("MENU DE EXERCÍCIOS");
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.print("Insira o número do exercício: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    exercicio01();
                    break;

                case 2:
                    exercicio02();
                    break;

                case 3:
                    exercicio03();
                    break;

                case 4:
                    exercicio04();
                    break;

                case 5:
                    exercicio05();
                    break;

                case 6:
                    exercicio06();
                    break;

                case 7:
                    exercicio07();
                    break;

                case 8:
                    exercicio08();
                    break;

                case 9:
                    exercicio09();
                    break;
                case 10:
                    exercicio10();
                    break;

                case 11:
                    exercicio11();
                    break;
            }

            System.out.println("\nPrograma encerrado!\n\n");

        } while (opcao != -1);

        scanner.close();
    }

    /**
     * Q1: Faça um programa na linguagem Java que mostre a mensagem “Alô mundo!”
     * na tela
     */
    public static void exercicio01() {
        System.out.println("Alô mundo!");
    }

    /**
     * Q2: Faça um programa na linguagem Java que peça um número pelo teclado e
     * então mostre a mensagem no console “O número informado foi [número].”
     */
    public static void exercicio02() {
        // Declaração de variáveis
        Scanner scanner = new Scanner(System.in); // Scanner = aguarda pela entrada do usuário
        int numero;

        System.out.println("Informe um número: ");
        numero = scanner.nextInt(); // Lê o próximo inteiro inserido pelo usuário

        System.out.println("O número informado foi " + numero);
        //scanner.close();
    }

    /**
     * Q3: Faça um programa na linguagem Java que receba 3 notas pelo teclado,
     * calcule e mostre a média aritmética no console.
     */
    public static void exercicio03() {
        float n1, n2, n3, media;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira as notas do aluno:");
        n1 = scanner.nextFloat();
        n2 = scanner.nextFloat();
        n3 = scanner.nextFloat();

        media = ((n1 + n2 + n3) / 3);
        System.out.printf("A média do aluno é %.1f", media);
    }

    /**
     * Q4: 4. Faça um programa na linguagem Java que receba um número em metros
     * pelo teclado, converta em centímetros e mostre o resultado no console.
     */
    public static void exercicio04() {
        Scanner scanner = new Scanner(System.in);
        float metros, cm;

        System.out.println("Insira o tamanho em metros:");
        metros = scanner.nextFloat();

        cm = (metros * 100);
        System.out.printf("O tamanho em centímetros é %.0f", cm);
    }

    /**
     * Q5: 5. Faça um programa na linguagem Java que calcule e mostre, no
     * console, a área de um círculo. Sabe-se que a fórmula da área de um
     * círculo é A = πr2
     */
    public static void exercicio05() {
        float raio, area;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o raio do círculo: ");
        raio = scanner.nextFloat();

        area = (float) Math.PI * (raio * raio); // Math.PI é uma constante. O valor não pode ser alterado.
        // area = Math.PI * Math.pow(raio, 2); // Math.pow = função para elevar ao expoente

        System.out.printf("A área do círculo com raio %.1f é %f", raio, area);
        //scanner.close();
    }

    /**
     * Q6: Faça um programa na linguagem Java que pergunte, pelo teclado, o
     * preço de três produtos e informe, no console, qual produto você deve
     * comprar, sabendo que a decisão de comprar um produto é sempre pelo mais
     * barato.
     */
    public static void exercicio06() {
        float p1, p2, p3, menor;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o preço dos três produtos: ");
        p1 = scanner.nextFloat();
        p2 = scanner.nextFloat();
        p3 = scanner.nextFloat();

        if (p1 < p2 && p1 < p3) { // Verificando se p1 É o menor!
            menor = p1;
        } else if (p2 < p3) { // Se chegou aqui, p1 NÃO é o menor de todos!
            menor = p2;
        } else { // Se chegou aqui, p2 também NÃO é o menor!
            menor = p3;
        }

        System.out.printf("O menor preço é o R$%.2f", menor);
        //scanner.close();
    }

    /**
     * Q7: Faça um programa na linguagem Java que receba N notas de um discente
     * pelo teclado, calcule e mostre no console a média aritmética. Informe
     * também no console se o discente foi aprovado (média superior ou igual a
     * 7) ou reprovado.
     */
    public static void exercicio07() {
        int qtNotas;
        float nota, totalNotas = 0, media;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira a quatidade de notas: ");
        qtNotas = scanner.nextInt();

        for (int i = 1; i <= qtNotas; i++) {
            System.out.printf("Insira a nota %d:", i);
            nota = scanner.nextFloat();
            totalNotas += nota;
        }
        media = totalNotas / qtNotas;
        if (media >= 7) {
            System.out.println("Você foi aprovado!");
        } else {
            System.out.println("Você foi reprovado.");
        }
        //scanner.close();
    }

    /**
     * Q8: Faça um programa na linguagem Java que para calcular a média final
     * (MF) de um discente entre duas notas, recebidas pelo teclado, de um
     * discente e mostrar sua situação, que pode ser: a. aprovado (MF >= 7), se
     * (MF >= 4) e (MF < 7) o discente fará uma AF;
     * b. aprovado também se (AF >= 4) e ((MF + AF) / 2 >= 5); e c. reprovado
     * nos demais casos. Se o discente precisar da AF, informe pelo teclado a
     * nota da AF e mostre também, no console, a MF com ou sem AF e o resultado
     * final. A MF quando o discente precisar de AF é calculada pela fórmula
     * ((MF + AF)/ 2).
     */
    public static void exercicio08() {
        float n1, n2, MF, notaAF;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira as notas do discente: ");
        n1 = scanner.nextFloat();
        n2 = scanner.nextFloat();
        MF = (n1 + n2) / 2;

        if (MF >= 7) {
            System.out.printf("O discente está aprovado! A média final do discente é: %.1f", MF);
        } else if (MF >= 4) {
            System.out.printf("O discente está de AF. A média final do discente é: %.1f\n", MF);
            System.out.print("Insira a nota da AF: ");
            notaAF = scanner.nextFloat();
            calculaAF(notaAF, MF);
        } else {
            System.out.printf("O discente está reprovado. A média final do discente é: %.1f", MF);
        }
        //scanner.close();
    }

    public static float calculaAF(float notaAF, float MF) {
        float RF;
        RF = (notaAF + MF) / 2;
        if (RF >= 5) {
            System.out.printf("O aluno foi aprovado na AF. \nO resultado final da nota é: %.1f", RF);
        } else {
            System.out.printf("O aluno foi reprovado na AF. \nO resultado final da nota é: %.1f", RF);
        }
        return RF;
    }

    /**
     * Q9: Faça um programa na linguagem Java que receba três números pelo
     * teclado e mostre, no console, o maior deles.
     */
    public static void exercicio09() {
        float n1, n2, n3, maior;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira os três números:");
        n1 = scanner.nextFloat();
        n2 = scanner.nextFloat();
        n3 = scanner.nextFloat();

        if (n1 > n2 && n1 > n3) {
            maior = n1;
        } else if (n2 > n3) {
            maior = n2;
        } else {
            maior = n3;
        }
        System.out.printf("O maior número dentre os escolhidos é: %.1f", maior);
        //scanner.close();
    }

    /**
     * Q10: Faça um programa na linguagem Java que receba um número inteiro pelo
     * teclado e mostre, no console, se o número inteiro é par ou ímpar.
     */
    public static void exercicio10() {
        int num;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o número: ");
        num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.printf("O número %d é par!", num);
        } else {
            System.out.printf("O número %d é ímpar!", num);
        }
        //scanner.close();
    }

    /**
     * Q11: Faça um programa na linguagem Java que mostre, no console, a tabuada
     * de multiplicação de um número inteiro entre 0 e 10. O programa só pode
     * receber, pelo teclado, números inteiros de 0 a 10 e utilize, na
     * resolução, a estrutura de repetição for.
     */
    public static void exercicio11() {
        int num;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um número de 0 a 10: ");
        num = scanner.nextInt();

        if (num < 0 || num > 10) {
            System.out.printf("Numero Inválido! Insira um número de 0 a 10.");
        } else {
            System.out.printf("\nTabuada do %d\n\n", num);
            for (int i = 0; i <= 10; i++) {
                System.out.printf("%d x %d = %d\n", num, i, (num * i));
            }
        }
        //scanner.close();   
    }

}
