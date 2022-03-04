package dio.exercicios;

public class Main {

    public static void main(String[] args) {

        //Calculadora
        System.out.println("Exercícios calculadora: ");
        Calculadora.soma(5,6);
        Calculadora.divisao(15, 3);
        Calculadora.subtracao(5, 3);
        Calculadora.multiplicacao(3,5);

        //Hora do dia
        System.out.println("Hora do dia: ");
        Mensagem.obterMensagem(7);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(20);

        //Emprestimo
        System.out.println("Emprestimos: ");
        Emprestimo.calcular(5000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(5000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(5000, 5);

        //área dos quadrilateros
        System.out.println("Calculando a área dos quadrilateros com sobrecarga");

        Sobrecarga.areaQuadrilatero(5);
        Sobrecarga.areaQuadrilatero(5,6);
        Sobrecarga.areaQuadrilatero(5, 6, 7);

    }
}
