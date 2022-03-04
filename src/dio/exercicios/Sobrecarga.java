package dio.exercicios;

public class Sobrecarga {

    public static void areaQuadrilatero(double ladoQuad){

        double area = ladoQuad * ladoQuad;

        System.out.println("A área do quadrado é "+ area +" u.m.");
    }
    public static void areaQuadrilatero(double ladoB, double ladoH){

        double area = ladoB * ladoH;

        System.out.println("A área do quadrado é "+ area +" u.m.");
    }
    public static void areaQuadrilatero(double baseMaior, double baseMenor, double altura){

        double area = ((baseMaior + baseMenor) * altura) / 2;

        System.out.println("A área do quadrado é "+ area +" u.m.");
    }

}
