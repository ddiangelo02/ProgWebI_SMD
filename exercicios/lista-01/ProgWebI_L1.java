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
                case 1: exercicio01();
                        break;

                case 2: exercicio02();
                        break;

                case 3: exercicio03();
                        break;

                case 4: exercicio04();
                        break;

                case 5: exercicio05();
                        break;

                case 6: exercicio06();
                        break;
            }

            System.out.println("\nPrograma encerrado!\n\n");
        
        } while (opcao != -1);
        
        scanner.close();
    }
    
    /**
     * Q1: Faça um programa na linguagem Java que mostre a mensagem “Alô mundo!” na tela
     */
    public static void exercicio01() {
        System.out.println("Alô mundo!");
    }
    
    /**
     * Q2: Faça um programa na linguagem Java que peça um número pelo teclado e então mostre a mensagem no
console “O número informado foi [número].”
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
     * Q3: Faça um programa na linguagem Java que receba 3 notas pelo teclado, calcule e
 * mostre a média aritmética no console.
     */
    public static void exercicio03() {
        float n1, n2, n3, media;
        
         Scanner scanner = new Scanner (System.in);
        
        System.out.println("Insira as notas do aluno:");
        n1 = scanner.nextFloat();
        n2 = scanner.nextFloat();
        n3 = scanner.nextFloat();
        
        media = ((n1 + n2 + n3)/3);
        System.out.printf("A média do aluno é %.1f", media);
    }
    
    /**
     * Q4: 4. Faça um programa na linguagem Java que receba um número em metros pelo teclado, converta em
centímetros e mostre o resultado no console.
     */
    public static void exercicio04 (){
        Scanner scanner = new Scanner (System.in);
        float metros, cm;
 
        System.out.println("Insira o tamanho em metros:");
        metros = scanner.nextFloat();
       
        cm = (metros*100);
        System.out.printf("O tamanho em centímetros é %.0f", cm);
    }
    
    /**
     * Q5: 5. Faça um programa na linguagem Java que calcule e mostre, no console, a área de um círculo. Sabe-se
que a fórmula da área de um círculo é A = πr2
     */
    public static void exercicio05() {
        float raio, area;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o raio do círculo: ");
        raio = scanner.nextFloat();
        
        area = (float)Math.PI * (raio * raio); // Math.PI é uma constante. O valor não pode ser alterado.
        // area = Math.PI * Math.pow(raio, 2); // Math.pow = função para elevar ao expoente
        
        System.out.printf("A área do círculo com raio %.1f é %f", raio, area);
        //scanner.close();
    }
    
    /**
     * Q6: Faça um programa na linguagem Java que pergunte, pelo teclado, o preço de três produtos e informe, no
console, qual produto você deve comprar, sabendo que a decisão de comprar um produto é sempre pelo
mais barato.
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
    
}