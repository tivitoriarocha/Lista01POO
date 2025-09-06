package Lista01VitoriaRocha; // vai ser modificado de acordo com o a pasta em que o seu arquivo foi criado.

import java.util.Scanner;

public class Lista1java {
    
    public static void questao1(){
        /*1.Faça um programa para calcular o estoque médio de uma peça, sendo que:
         * ESTOQUE MÉDIO = (QUANTIDADE_MÍNIMA + QUANTIDADE_MÁXIMA) / 2
        */
        Scanner input = new Scanner(System.in);
        int max, min;
        float estoqueMedio;

        System.out.println("Vamos calcular o estoque de peças\n".toUpperCase());

        System.out.print("Informe a quantidade mínima de peças: ");
        min = input.nextInt();

        System.out.print("Informe a quantidade máxima de peças: ");
        max = input.nextInt();

        // calculando o estoque
        estoqueMedio = ((min + max) / 2);

        // exibindo dados
        //System.out.printf("Estoque médio: %.2f", estoqueMedio);
        System.out.println("Estoque médio: " + estoqueMedio);
    }

    public static void questao2(){
        /*2.Faça um programa que:
            - Leia a cotação do dólar
            - Leia um valor em dólares
            - Converta esse valor para Real
            - Mostre o resultado
        */
        Scanner input = new Scanner(System.in);
        float cotacao, valor;
        //float conversao;

        System.out.println("Calculadora de dolar $\n".toUpperCase());

        System.out.print("Informe a cotação do dolar: ");
        cotacao = input.nextFloat();

        System.out.print("Informe o valor em dolares que deseja converter: ");
        valor = input.nextFloat();

        // calculando a conversão
        //conversao = (cotacao*valor);
        //Oq gasta menos memória, usando mais uma variável ou não?

        // exibindo dados
        System.out.printf("O valor em Reais é: R$%.2f", cotacao*valor);
        //System.out.println("Estoque médio: " + conversao);
    }

    public static void questao3(){
        /*3. Faça um programa para pagamento de comissão de vendedores de peças, levando-se em consideração que sua comissão será de 
        5% do total da venda e que você tem os seguintes dados:
            - Identificação do vendedor
            - Código da peça
            - Preço unitário da peça
            - Quantidade vendida*/

        Scanner input = new Scanner(System.in);
        int id, codigoPeca, quantVendida;
        float precoUni;

        System.out.println("Calculadora de comissão\n".toUpperCase());

        System.out.print("Informe sua Identificação de Vendedor: ");
        id = input.nextInt();

        System.out.print("Informe o código da peça vendida: ");
        codigoPeca = input.nextInt();

        System.out.print("Informe o preço unitário: ");
        precoUni = input.nextFloat();

        System.out.print("Informe a quantidade vendida: ");
        quantVendida = input.nextInt();

        //calculando a comissão e exibindo os dados
        System.out.printf("Venda total: R$%.2f | Comissão (5%%): R$%.2f para o vendedor %d%n", precoUni*quantVendida, (precoUni * quantVendida)* 0.05f, id);    
    }

    public static void questao4(){
        /*4. Ler quatro valores numéricos inteiros e apresentar o resultado dois a dois da adição e multiplicação entre os valores lidos,
        baseando-se na utilização do conceito de propriedade distributiva. Dica: se forem lidas as variáveis A, B, C e D, devem ser somados
        e multiplicados os valores de A com B, A com C e A com D; depois B com C, B com D e por último C com D. Note que para cada 
        operação serão utilizadas seis combinações. Assim sendo, devem ser realizadas doze operações de processamento, sendo seis para
        as adições e seis para as multiplicações.*/

        Scanner input = new Scanner(System.in);
        int a, b, c, d;
        int[] numeros = new int[4];

        System.out.println("PROPRIEDADE DISTRIBUTIVA - 4 VALORES\n".toUpperCase());

        System.out.println("Informe quatro números inteiros:\n");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();

        //teria sido mais fácil fazer um for para ler aqui
        //armazenando os números lidos
        numeros[0] = a;
        numeros[1] = b;
        numeros[2] = c;
        numeros[3] = d;

        System.out.println("\n=== RESULTADOS ===");

        //calculando e exibindo as somas e multiplicações
        for (int i = 0; i < 4; i++) { 
            for (int j = i + 1; j < 4; j++) {
                int soma = numeros[i] + numeros[j];
                int multiplicacao = numeros[i] * numeros[j];
            System.out.printf("%d + %d = %d\n", numeros[i], numeros[j], soma);
            System.out.printf("%d * %d = %d\n", numeros[i], numeros[j], multiplicacao);
            System.out.println("---");
            }
        }    
    }
    
    public static void questao5(){
        /*5. Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz 12 Km por litro.
         Para obter o cálculo, o usuário deve fornecer o tempo gasto na viagem e a velocidade média. Desta forma, será possível obter a 
         distância percorrida com a fórmula DISTANCIA = TEMPO * VELOCIDADE. Tendo o valor da distância, basta calcular a quantidade de litros 
         de combustível utilizada na viagem com a fórmula: LITROS_USADOS = DISTANCIA / 12. O programa deve apresentar os valores da velocidade 
         média, tempo gasto, a distância percorrida e a quantidade de litros utilizada na viagem. Dica: trabalhe com valores reais.*/

        Scanner input = new Scanner(System.in);
        float tempoViagem, velocidade, distancia, litrosUsados;

        System.out.println("Informe o tempo gasto na viagem em horas: ");
        tempoViagem = input.nextFloat();
        System.out.println("Informe a velocidade média durante a viagem: ");
        velocidade = input.nextFloat();

        distancia = tempoViagem * velocidade;
        litrosUsados = distancia/12;

        System.out.println("----Tabela de Combustível----");
        System.out.printf("Velocidade média: %.1f km/h\n", velocidade);
        System.out.printf("Tempo de viagem: %.1f horas\n", tempoViagem);
        System.out.printf("Distância percorrida: %.1f km\n", distancia);
        System.out.printf("Litros usados: %.1f litros\n", litrosUsados);
    }

    public static void questao6(){
        /*6. Ler uma temperatura em graus Celsius e apresentá-Ia convertida em graus Fahrenheit. A fórmula de conversão de temperatura a 
        ser utilizada é F = (9 * C + 160) / 5, em que a variável F representa é a temperatura em graus Fahrenheit e a variável C representa
        é a temperatura em graus Celsius.*/

        Scanner input = new Scanner(System.in);
        float celsius, fahrenheit;

        System.out.println("Informe a temperatura em graus Celsius: ");
        celsius = input.nextFloat();

        fahrenheit = (9 * celsius + 160)/5;

        System.out.printf("A temperatura em Fahrenheint é: %.2f", fahrenheit);
    }

    public static void questao7(){
        /*7. Ler uma temperatura em graus Fahrenheit e apresentá-Ia convertida em graus Celsius. A fórmula de conversão de temperatura a 
        ser utilizada é C = (F - 32) * 5 / 9, em que a variável F é a temperatura em graus Fahrenheit e a variável C é a temperatura em 
        graus Celsius.*/

        Scanner input = new Scanner(System.in);
        float celsius, fahrenheit;

        System.out.println("Informe a temperatura em graus Fahrenheit: ");
        fahrenheit = input.nextFloat();

        celsius = (fahrenheit - 32) * 5 /9;

        System.out.printf("A temperatura em graus Celsius é: %.2f", celsius);
    }

    public static void questao8(){
        /*8. Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula:
            V = 3.14159 R R * A Onde as variáveis: V, R e A representam respectivamente o volume, o raio e a altura.*/

        Scanner input = new Scanner(System.in);
        double volume, raio, altura;

        System.out.println("CALCULADORA DE VOLUME\n".toUpperCase());

        System.out.println("Informe, respectivamente: ");
        System.out.print("Raio da lata - ");
        raio = input.nextFloat();
        System.out.print("Altura da lata - ");
        altura = input.nextFloat();

        volume = (3.14159 * raio * raio * altura);

        System.out.printf("O volume da lata de óleo é: %.2f cm³", volume);
    }

    public static void questao9(){
        /*9. Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa pessoa 
        expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.*/

        Scanner input = new Scanner(System.in);
        int anos, meses, dias, idadeDias;

        System.out.println("CALCULADORA DE IDADE EM DIAS\n".toUpperCase());

        System.out.print("Informe sua idade em anos - ");
        anos = input.nextInt();
        System.out.print("Meses após seu aniversário - ");
        meses = input.nextInt();
        System.out.print("Dias que sobram - ");
        dias = input.nextInt();
        
        idadeDias = ((anos * 365) + (meses * 30) + dias);

        System.out.printf("\nA quantidade de dias vividos em dias são: %d", idadeDias);
    }

    public static void questao10(){
        /*10. Escrever um programa que leia dois números inteiros e mostre todos os relacionamentos de ordem existentes entre eles. 
        Os relacionamentos possíveis são: Igual, Não igual, Maior, Menor, Maior ou igual, Menor ou igual.*/

        Scanner input = new Scanner(System.in);
        int a, b;

        System.out.print("Primeiro número: ");
        a = input.nextInt();
        System.out.print("Segundo número: ");
        b = input.nextInt();
    
        System.out.println("\n---- Relacionamentos ---");
        System.out.printf("%d == %d -> %b%n", a, b, a == b);
        System.out.printf("%d != %d -> %b%n", a, b, a != b);
        System.out.printf("%d >  %d -> %b%n", a, b, a > b);
        System.out.printf("%d <  %d -> %b%n", a, b, a < b);
        System.out.printf("%d >= %d -> %b%n", a, b, a >= b);
        System.out.printf("%d <= %d -> %b%n", a, b, a <= b);
    }

    public static void main(String[] args) {
        questao10();
    }
}