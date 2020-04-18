package calculadora3;

import java.util.Scanner;

public class Calculadora3 {
    public static void main(String[] args) {
        final int FIM = 0;
        int operacao;
        double result;
        
        operacao = Menu();
        while (operacao != FIM){ // while para que o usuario possa entrar e sair da calculadora
            result = Calcula(operacao);
            operacao = Menu();
        }
   }
    
    public static double LeOperando(String msg) { //método
        double op;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print(msg);
        op = entrada.nextDouble();
        return op;
    }
    
    public static double Calcula(int operacao) { //método
        double op1, op2, result = 0;

            op1 = LeOperando("Entre com o operando 1: ");
            op2 = LeOperando("Entre com o operando 2: ");
            switch (operacao) {
                case 1:
                    result = op1 + op2;
                    System.out.println("Resultado = " + result);
                    break;
                case 2:
                    result = op1 - op2;
                    System.out.println("Resultado = " + result);
                    break;
                case 3: 
                    result = op1 * op2;
                    System.out.println("Resultado = " + result);
                    break;
                case 4: // calculando opção divisão 0
                    if (op2 != 0) {
                        result = op1 / op2;
                        System.out.println("Resultado = " + result);
                    }
                    else {
                        System.out.println("Erro: divisão por zero");
                    }
                    break;
            }
        return result;
    }
    
    public static int Menu() {
        int operacao;
        Scanner entrada = new Scanner(System.in);
        do {   // loop para garantir que o usuário digitte uma informação válida         
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("0 - Sair");
            System.out.print("Escolha a operação: ");
            operacao = entrada.nextInt();
            if ((operacao < 0) ||(operacao > 4 )){
            System.out.println("Erro!!! Operação inválida!!!");
            }
        } while ((operacao < 0) ||(operacao > 4 ));
        return operacao;
    }
}
