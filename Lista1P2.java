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

    public static void questao7(){
        /*7. Escreva um programa que leia um número inteiro. Verificar por meio de condição se 
        o valor fornecido está na faixa entre 0 (zero) e 9 (nove). Caso o valor fornecido esteja 
        dentro da faixa, apresentar a mensagem “valor válido”. Caso contrário, apresentar a mensagem 
        “valor inválido”, em qualquer outro caso, informe "erro".*/
        
        Scanner input = new Scanner(System.in);
        int num; 

       System.out.print("Digite um número inteiro: ");
        
        if (input.hasNextInt()) {
            num = input.nextInt();
            if (num >= 0 && num <= 9) {
                System.out.println("VALOR VÁLIDO!");
            } else {
                System.out.println("VALOR INVÁLIDO!");
            }
        } else {
            System.out.println("ERRO");
            input.next();
        }
        
        input.close();

    }

    public static void questao8(){
        /*8. Escreva um programa que leia um número inteiro (variável CÓDIGO). Verificar se o código é igual 
        a 1, igual a 2 ou igual a 3. Caso não seja, apresentar a mensagem “Código inválido”. Ao ser 
        verificado o código e constatado que é um valor válido, o programa deve verificar cada código em 
        separado para determinar seu valor por extenso, ou seja, apresentar a mensagem “um”, ”dois” ou “três”. 
        (Utilizar o comando Switch).*/
        
        Scanner input = new Scanner(System.in);
       
        System.out.print("Digite o código (1, 2 ou 3): ");
        int codigo = input.nextInt();
        
        switch (codigo) {
            case 1:
                System.out.println("um");
                break;
            case 2:
                System.out.println("dois");
                break;
            case 3:
                System.out.println("três");
                break;
            default:
                System.out.println("Código inválido");
        }
        
        input.close();

    }

    public static void questao9(){
        /*9. Escreva um programa que leia três valores para os lados de um triângulo (variáveis A, B e C). 
        Verificar se cada lado é menor que a soma dos outros dois lados. Se sim, saber de A==B e se B==C, 
        sendo verdade o triângulo é equilátero; Se não, verificar de A==B ou se A==C ou se B==C, sendo verdade 
        o triângulo é isósceles; e caso contrário, o triângulo será escaleno. Caso os lados fornecidos não 
        caracterizarem um triângulo, avisar a ocorrência.*/
        
        Scanner input = new Scanner(System.in);
        float A, B, C;

        System.out.println("Informe o valor dos lados do triângulo: ");
        System.out.print("LADO A - ");
        A = input.nextFloat();
        System.out.print("LADO B - ");
        B = input.nextFloat();
        System.out.print("LADO C - ");
        C = input.nextFloat();

        if (A < B + C && B < A + C && C < A + B) {
            if (A==B && B==C) {
                System.out.println("É um triângulo equilátero!");
            }else if (A==B || A==C || B==C) {
                System.out.println("É um triângulo isósceles!");
            }else{
                System.out.println("É um triângulo escaleno!");
            }    
        }else{
            System.err.println("Não é triângulo...");
        }

    }

    public static void questao10(){
        /*10. Escrever um programa declarando três variáveis do tipo inteiro (a, b e c). Ler um valor maior que zero 
        para cada variável (se o valor digitado não é válido, mostrar mensagem e ler novamente). Exibe o menor valor 
        lido multiplicado pelo maior e o maior valor dividido pelo menor.*/
        
        Scanner input = new Scanner(System.in);
        int a, b, c;

        do {
            System.out.print("1º VALOR (maior que zero): ");
            a = input.nextInt();
            if (a <= 0) {
                System.out.println("VALOR INVÁLIDO! Digite um número maior que zero.");
            }
        } while (a <= 0);
        
        do {
            System.out.print("2º VALOR (maior que zero): ");
            b = input.nextInt();
            if (b <= 0) {
                System.out.println("VALOR INVÁLIDO! Digite um número maior que zero.");
            }
        } while (b <= 0);
        
        do {
            System.out.print("3º VALOR (maior que zero): ");
            c = input.nextInt();
            if (c <= 0) {
                System.out.println("VALOR INVÁLIDO! Digite um número maior que zero.");
            }
        } while (c <= 0);
        
        int menor = a;
        int maior = a;
        
        if (b < menor) menor = b;
        if (c < menor) menor = c;
        
        if (b > maior) maior = b;
        if (c > maior) maior = c;
        
        int multiplicacao = menor * maior;
        double divisao = (double) maior / menor;
        
        System.out.println("Menor valor: " + menor);
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor × Maior: " + multiplicacao);
        System.out.println("Maior ÷ Menor: " + divisao);

    }

    public static void questao11(){
        /*11. Faça um programa que leia um número inteiro e mostre uma mensagem na tela indicando se este número é 
        positivo ou negativo.*/
        
        Scanner input = new Scanner(System.in);
        int num;

        System.out.println("Informe um número inteiro: ");
        num = input.nextInt();

        if (num<0) {
            System.out.println("NÚMERO NEGATIVO");
        }else if (num>0) {
            System.out.println("NÚMERO POSITIVO");
        }else{
            
        }

    }

    public static void questao12(){
        /*12. Faça um programa que leia um número. Se positivo, armazene-o em A, se for negativo, em B. 
        No final mostrar o os número em um único print.*/
        
        Scanner input = new Scanner(System.in);
        int num, A, B;

        System.out.println("Informe um número inteiro: ");
        num = input.nextInt();

        if (num>0) {
            A = num;
            System.out.printf("NÚMERO POSITIVO - %d", A);
        }else if (num<0) {
            B = num;
            System.out.printf("NÚMERO NEGATIVO - %d", B);
        }else{
            System.out.println("NÚMERO NEUTRO");
        }

    }


    public static void main(String[] args) {
        questao12();
    }
}