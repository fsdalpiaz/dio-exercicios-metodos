package dio.exercicios;

public class Calculadora {
    public static void soma(double x, double y){

        double resultado = x + y;

        System.out.println("O resultado da soma de " + x + " e " + y + " é: " + resultado);
    }

    public static void subtracao(double x, double y){

        double resultado = x - y;

        System.out.println("O resultado da subtracao de " + x + " e " + y + " é: " + resultado);
    }

    public static void multiplicacao(double x, double y){

        double resultado = x * y;

        System.out.println("O resultado da multiplicacao de " + x + " e " + y + " é: " + resultado);
    }

    public static void divisao(double x, double y){

        double resultado = x / y;

        System.out.println("O resultado da divisao de " + x + " e " + y + " é: " + resultado);
    }


}
