package Lista01VitoriaRocha; 

//System.out.println("Vamos calcular o estoque de peças\n".toUpperCase());

import java.util.Scanner;

public class Lista1P2 {
    
    public static void questao1(){
        /*1. Ler dois valores inteiros para as variáveis A e B, efetuar a troca dos valores de modo que a variável A passe a possuir 
        o valor da variável B, e a variável B passe a possuir o valor da variável A. Apresentar os valores antes e depois da troca.*/
        
        Scanner input = new Scanner(System.in);
        int A, B, troca;

        System.out.println("Informe dois números inteiros: ");
        A = input.nextInt();
        B = input.nextInt();
        System.out.println("--- Tabela de Números ---\n");
        System.out.printf(" Números %d e %d\n", A, B);

        troca = A;
        A = B;
        B = troca;

        System.out.printf(" Números depois da troca %d e %d\n", A, B);
    }

    public static void questao2(){
        /*2. Escreva um programa que leia um número inteiro e exiba o seu módulo.
            O módulo de um número x é:

            x, se x é maior ou igual a zero.
            x * (-1), se x é menor que zero.*/
        
        Scanner input = new Scanner(System.in);
        int num;
        
        System.out.println("Informe um número inteiro: ");
        num = input.nextInt();

        if (num>=0) {
            System.out.printf("O môdulo de %d, é: %d\n", num, num);
        }else if (num<0) {
            System.out.printf("O môdulo de %d, é: %d\n", num, (num*(-1)));
        }
    }

    public static void questao3(){
        /*3. Escreva um programa que leia 5 números inteiros e imprima na tela os valores em ordem crescente e decrescente.*/
        
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.println("Informe 5 números inteiros");
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + "º número: ");
            numeros[i] = input.nextInt();
        }

        boolean trocado;
        int temp;
    
        for (int i = 0; i < 4; i++) {
            trocado = false;
            int j = 0;
        
            while (j < 4 - i) {
                if (numeros[j] > numeros[j + 1]) {
                    temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                    trocado = true;
                }
                j++;
            }
        
            if (!trocado) {
            break;
            }
        }
    
        System.out.println("\nOrdem CRESCENTE:");
        for (int i = 0; i < 5; i++) {
            System.out.print(numeros[i] + " ");
        }
        
        //Mesma lógica do crescente
        for (int i = 0; i < 4; i++) {
            trocado = false;
            int j = 0;
            
            while (j < 4 - i) {
                if (numeros[j] < numeros[j + 1]) { 
                    temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                    trocado = true;
                }
                j++;
            }
            
            if (!trocado){ 
            break;
            }
        }
        
        System.out.println("\nOrdem DECRESCENTE:");
        for (int i = 0; i < 5; i++) {
            System.out.print(numeros[i] + " ");
        }

    }

    public static void questao4(){
        /*4. Escreva um programa que leia dois números e apresente a diferença do maior para o menor.*/
        
        Scanner input = new Scanner(System.in);
        float num1, num2;

        System.out.println("Informe dois números: ");
        System.out.print("1° Número: ");
        num1 = input.nextFloat();
        System.out.print("2° Número: ");
        num2 = input.nextFloat();

        if (num1 > num2) {
           System.out.println("Diferença: \n");
           System.out.printf("%.2f - %.2f = %.2f \n", num1, num2, (num1-num2)); 
        } else if (num1 < num2) {
            System.out.println("Diferença: \n");
            System.out.printf("%.2f - %.2f = %.2f \n", num2, num1, (num2-num1));
        }else {
            System.out.println("São iguais, a diferença é nula!");
        }
    }

    public static void questao5(){
        /*5. Escreva um programa que leia quatro notas escolares de um aluno e apresentar uma mensagem que o aluno foi aprovado se o 
        valor da média escolar for maior ou igual a 7. Se o valor da média for menor que 7, solicitar a nota do recuperação, somar com o 
        valor da média e obter a nova média. Se a nova média for maior ou igual a 7, apresentar uma mensagem informando que o aluno foi 
        aprovado na recuperação. Se o aluno não foi aprovado, apresentar uma mensagem informando a condição de reprovado. Apresentar junto 
        com as mensagens o valor da média do aluno.*/

        Scanner input = new Scanner(System.in);
        double nota1, nota2, nota3, nota4;

        System.out.println("Digite as 4 notas do aluno:");
        nota1 = input.nextDouble();    
        nota2 = input.nextDouble();     
        nota3 = input.nextDouble();
        nota4 = input.nextDouble();
    
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
    
        if (media >= 7) {
            System.out.printf("APROVADO! Média: %.1f", media);
        } else {
            System.out.printf("Média: %.1f - Precisa de recuperação%n", media);
            System.out.print("Digite a nota da recuperação: ");
            double recuperacao = input.nextDouble();
        
            double novaMedia = (media + recuperacao) / 2;
        
            if (novaMedia >= 7) {
            System.out.printf("APROVADO na recuperação! Nova média: %.1f", novaMedia);
            } else {
                System.out.printf("REPROVADO! Média final: %.1f", novaMedia);
            }
        }
        
    }

    public static void questao6(){
        /*6. Escreva um programa que leia dois números e exiba mensagem informando o valor do maior número e o valor do menor número. 
        Se os dois números forem iguais, o programa deve exibir mensagem informando este fato.*/
        
        Scanner input = new Scanner(System.in);
        float num1, num2;

        System.out.println("Informe dois números: ");
        System.out.print("1° Número: ");
        num1 = input.nextFloat();
        System.out.print("2° Número: ");
        num2 = input.nextFloat();

        if (num1 > num2) {
           System.out.println("MAIOR número: ");
           System.out.printf("%.2f\n", num1); 
           System.out.println("MENOR número: ");
           System.out.printf("%.2f\n", num2); 
        } else if (num1 < num2) {
            System.out.println("MAIOR número: ");
            System.out.printf("%.2f\n", num2); 
            System.out.println("MENOR número: ");
            System.out.printf("%.2f\n", num1);
        }else {
            System.out.println("São iguais!");
        }

    }


    public static void main(String[] args) {
        questao6();
    }
}