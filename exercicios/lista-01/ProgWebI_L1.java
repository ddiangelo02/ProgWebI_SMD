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
import java.util.Arrays;

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
                case 1 -> exercicio01();

                case 2 -> exercicio02();

                case 3 -> exercicio03();

                case 4 -> exercicio04();

                case 5 -> exercicio05();

                case 6 -> exercicio06();

                case 7 -> exercicio07();

                case 8 -> exercicio08();

                case 9 -> exercicio09();
                
                case 10 -> exercicio10();

                case 11 -> exercicio11();

                case 12 -> exercicio12();

                case 13 -> exercicio13();

                case 14 -> exercicio14();

                case 15 -> exercicio15();

                case 16 -> exercicio16();

                case 17 -> exercicio17();

                case 18 -> exercicio18();

                case 19 -> exercicio19();

                case 20 -> exercicio20();

                case 21 -> exercicio21();

                case 22 -> exercicio22();

                case 23 -> exercicio23();
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
        //scanner.close();
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
        //scanner.close();
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

    /**
     * Q12: Faça um programa na linguagem Java que peça uma nota pelo teclado de
     * 0 a 10. Mostre uma mensagem, no console, caso o valor seja inválido (nota
     * menor que 0 ou maior 10) e continue pedindo notas até que o usuário
     * informe um valor válido
     */
    public static void exercicio12() {
        float num;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira uma nota de 0 a 10: ");
        num = scanner.nextFloat();

        while (num < 0 || num > 10) {
            System.out.println("Número inválido! Por favor, insira uma nota de 0 a 10.");
            num = scanner.nextFloat();
        }
        System.out.printf("A nota inserida é: %.1f", num);
        //scanner.close();
    }

    /**
     * Q13: Numa eleição existem três candidatos. Faça um programa na linguagem
     * Java que peça o número total de eleitores pelo teclado. Peça para cada
     * eleitor vota pelo teclado e, ao final, mostre no console o número de
     * votos de cada candidato.
     */
    public static void exercicio13() {
        int votosC1 = 0, votosC2 = 0, votosC3 = 0, voto, qtEleitores, votosBranco = 0, votosNulo = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a quantidade de eleitores: ");
        qtEleitores = scanner.nextInt();

        for (int i = 1; i <= qtEleitores; i++) {
            System.out.println("~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~");
            System.out.printf("Eleitor nº%d, insira seu voto: \n", i);
            System.out.println("~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~");

            System.out.println("[1] Candidato 1");
            System.out.println("[2] Candidato 2");
            System.out.println("[3] Candidato 3");
            System.out.println("[0] Voto em branco");

            voto = scanner.nextInt();

            switch (voto) {
                case 1 ->
                    votosC1++;

                case 2 ->
                    votosC2++;

                case 3 ->
                    votosC3++;

                case 0 ->
                    votosBranco++;

                default ->
                    votosNulo++;
            }
        }
        System.out.println("\n~-~-~-~-~-~-~-~-~-~-~-~");
        System.out.println("Resultado das Eleições");
        System.out.println("~-~-~-~-~-~-~-~-~-~-~-~\n");

        System.out.printf("Candidato 1: %d votos\n", votosC1);
        System.out.printf("Candidato 2: %d votos\n", votosC2);
        System.out.printf("Candidato 3: %d votos\n", votosC3);
        System.out.printf("Votos brancos e nulos: %d votos\n", votosBranco + votosNulo);
        //scanner.close();
    }

    /**
     * Q14: Faça um programa na linguagem Java que receba, pelo teclado, 10
     * números inteiros maior que 1, verifique se cada número fornecido é primo
     * ou não e mostre no console uma mensagem de número primo ou de número não
     * primo. Um número é primo quando é divisível apenas por 1 e por ele mesmo.
     */
    public static void exercicio14() {
        int numero;
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.print("Insira os números para validação: ");
            numero = scanner.nextInt();

            if (numero <= 0) {
                System.out.println("Insira um número válido!");
                i--;
            } else {
                verificaPrimo(numero);
            }
        }
    }

    public static boolean verificaPrimo(int numero) {
        if (numero <= 1) {
            System.out.printf("O número %d não é primo!\n\n", numero);
            return false;
        }
        for (int i = 2; i <= (numero / 2); i++) {
            if (numero % i == 0) {
                System.out.printf("O número %d não é primo!\n\n", numero);
                return false;
            }
        }
        System.out.printf("O número %d é primo!\n\n", numero);
        return true;
    }

    /**
     * Q15: Faça um programa na linguagem Java que mostre, no console, os
     * primeiros 10 termos da sequência de Fibonacci: 0-1-1-2-3-5-8-13-21-34-...
     */
    public static void exercicio15() {
        int soma = 0, num1 = 0, num2 = 1;

        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\n", soma);

            num1 = num2;
            num2 = soma;
            soma = (num1 + num2);
        }
    }

    /**
     * Q16: Faça um programa na linguagem Java que dado um número inteiro
     * positivo lido pelo teclado, calcule o fatorial do número e mostre o
     * resultado no console.
     */
    public static void exercicio16() {
        int numero, resultado = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um número: ");
        numero = scanner.nextInt();

        for (int i = numero; i > 1; i--) {
            resultado *= i;
        }
        System.out.printf("O fatorial de %d é %d", numero, resultado);
    }

    /**
     * Q17: Faça um programa na linguagem Java que preencha, por meio do
     * teclado, um vetor de 5 números inteiros e mostre-os no console.
     */
    public static void exercicio17() {
        int[] vetor = new int[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Insira um número: ");
            vetor[i] = scanner.nextInt();
        }
        /**
         * for (int item : vetor) { // System.out.printf("\nO item é %d", item);
         * }
         */
        System.out.print("Os números no vetor são: ");
        System.out.println(Arrays.toString(vetor));
        //scanner.close();
    }

    /**
     * Q18: Faça um programa na linguagem Java que preencha, por meio do
     * teclado, um vetor de 10 números reais e mostre-os no console na ordem
     * inversa.
     */
    public static void exercicio18() {
        Scanner scanner = new Scanner(System.in);
        float[] vetor = new float[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Insira o número: ");
            vetor[i] = scanner.nextFloat();
        }
        for (int i = 9; i >= 0; i--) {
            System.out.printf("%.1f \n", vetor[i]);
        }
        //scanner.close();
    }

    /**
     * Q19: Faça um programa na linguagem Java que preencha por meio do teclado
     * um vetor de 5 números inteiros e, depois, mostre no console a soma dos 5
     * números, a multiplicação entre os 5 números e os 5 números.
     */
    public static void exercicio19() {
        Scanner scanner = new Scanner(System.in);
        int soma = 0, multi = 1;
        int[] vetor = new int[5];

        System.out.println("Insira os 5 números a serem calculados: ");
        for (int i = 0; i < 5; i++) {
            vetor[i] = scanner.nextInt();
            soma += vetor[i];
            multi *= vetor[i];
        }

        System.out.printf("A soma dos números inseridos é %d. \n", soma);
        System.out.printf("A multiplicação dos números inseridos é %d. \n", multi);
        System.out.println("Os números inseridos são:");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%d ", vetor[i]);
        }
        //scanner.close();
    }

    /**
     * Q20: Faça um programa na linguagem Java que receba, pelo teclado, 20
     * números inteiros e armazene-os em um vetor. Armazene os números pares no
     * vetor denominado “par” e os números ímpares no vetor “ímpar”. Mostre no
     * console os três vetores.
     */
    public static void exercicio20() {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[20];
        int tamPar = 0, tamImpar = 0;
        int j = 0, k = 0;

        System.out.println("Insira os números: ");
        for (int i = 0; i < 20; i++) {
            vetor[i] = scanner.nextInt();

            if (vetor[i] % 2 == 0) {
                tamPar++;
            } else {
                tamImpar++;
            }
        }

        int[] par = new int[tamPar];
        int[] impar = new int[tamImpar];
        System.out.println("\n\nVetor normal: ");
        for (int item : vetor) {
            System.out.printf("%d ", item);

            if (item % 2 == 0) {
                par[j] = item;
                j++;
            } else {
                impar[k] = item;
                k++;
            }
        }

        System.out.println("\n\nVetor par: ");
        for (int item : par) {
            System.out.printf("%d ", item);
        }

        System.out.println("\n\nVetor ímpar: ");
        for (int item : impar) {
            System.out.printf("%d ", item);
        }
    }

    /**
     * Q21: Faça um programa na linguagem Java que receba, pelo teclado, 2
     * Strings e informe, pelo console, o conteúdo delas seguido do seu
     * comprimento. Mostre também, no console, se as duas Strings possuem o
     * mesmo comprimento e são iguais ou diferentes no conteúdo.
     */
    public static void exercicio21() {
        Scanner scanner = new Scanner(System.in);
        String string1;
        String string2;

        System.out.println("Insira o conteúdo da String 1: ");
        string1 = scanner.nextLine();

        System.out.println("Insira o conteúdo da String 2: ");
        string2 = scanner.nextLine();

        System.out.printf("String 1: %s (%d caracteres)\n", string1, string1.length());
        System.out.printf("String 2: %s (%d caracteres)\n", string2, string2.length());

        if (string1.length() == string2.length()) {
            System.out.println("O tamanho das strings é IGUAL!");
        } else {
            System.out.println("O tamanho das String é DIFERENTE!");
        }

        if (string1.equals(string2)) {
            System.out.println("O conteúdo das strings é IGUAL!");
        } else {
            System.out.println("O conteúdo das strings é DIFERENTE!");
        }
        //scanner.close();
    }

    /**
     * Q22: Reverso do número. Faça um programa na linguagem Java que mostre, no
     * console, o reverso de um número inteiro informado pelo teclado. Por
     * exemplo: 127 <-> 721.
     */
    public static void exercicio22() {
        Scanner scanner = new Scanner(System.in);
        int num, numInv = 0, digito;

        System.out.print("Insira um número: ");
        num = scanner.nextInt();
        int numInicial = num;
        while (num != 0) {
            digito = num % 10;
            numInv = numInv * 10 + digito;
            num /= 10;
        }

        System.out.printf("%d <--> %d", numInicial, numInv);
        //scanner.close();
    }

    /**
     * Q23: . Calculadora básica. Faça um programa na linguagem Java que,
     * recebidos pelo teclado dois valores numéricos e a operação desejada
     * (soma, subtração, multiplicação ou divisão) mostre, no console, o
     * resultado do cálculo.
     */
    public static void exercicio23() {
        Scanner scanner = new Scanner(System.in);
        float num1, num2, resultado;
        String operacao;

        System.out.print("Insira a operação do seu cálculo (soma, subtração, multiplicação, divisão): ");
        operacao = scanner.nextLine().toUpperCase();

        System.out.print("Insira o primeiro valor: ");
        num1 = scanner.nextFloat();
        System.out.print("Insira o segundo valor: ");
        num2 = scanner.nextFloat();

        switch (operacao) {
            case "SOMA" -> {
                resultado = num1 + num2;
                System.out.printf("O resultado é: %.1f", resultado);
            }

            case "SUBTRAÇÃO" -> {
                resultado = num1 - num2;
                System.out.printf("O resultado é: %.1f", resultado);
            }

            case "MULTIPLICAÇÃO" -> {
                resultado = num1 * num2;
                System.out.printf("O resultado é: %.1f", resultado);
            }

            case "DIVISÃO" -> {
                resultado = num1 / num2;
                System.out.printf("O resultado é: %.1f", resultado);
            }

            default ->
                System.out.println("Operação Inválida! Tente novamente!");
        }
    }
    //scanner.close();
}
