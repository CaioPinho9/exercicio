import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise {

    public static void main(String[] args){

        /*
        Matricula
        System.out.println("-------------\n" +
                            "Hello World\n"  +
                            "-------------\n"+
                            "Nome: " + nome + "\n " +
                            "Número de Matrícula: " + matricula + "\n" +
                            "Telefone: 984348103" + "\n" +
                            "UNISUL\n" +
                            "Universidade do Sul de Santa Catarina\n" +
                            "Aluno: " + nome + "\n " +
                            "Curso: Sistemas de informação\n" +
                            "Matrícula: " + matricula);
 */

        /*
        Dólar
        double cotacaoDolar = 5.08;
        int quantidadeDolar = 0;
        double quantidadeReais;

        System.out.println("Informe a cotação do dólar");
        Scanner scanner = new Scanner(System.in);
        cotacaoDolar = scanner.nextDouble();

        System.out.println("Informe a quantidade do dólar");
        quantidadeDolar = scanner.nextInt();
        quantidadeReais = (quantidadeDolar*cotacaoDolar);
        System.out.println(quantidadeReais);
         */

        /*
        Soma de Quadrados de 4 números
        double[] numero = new double[4];
        double soma = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("1ºNúmero: ");
        numero[0] = scanner.nextDouble();
        System.out.print("2ºNúmero: ");
        numero[1] = scanner.nextDouble();
        System.out.print("3ºNúmero: ");
        numero[2] = scanner.nextDouble();
        System.out.print("4ºNúmero: ");
        numero[3] = scanner.nextDouble();

        for (double v : numero) {
            soma += Math.pow(v, 2);
        }
        System.out.println("A soma do quadrado desses números é " + soma);

         */

        /*
        Comissão de peças de roupa
        Scanner scanner = new Scanner(System.in);
        double[] valor = new double[10];
        double[] quantidade = new double[10];
        double comissao = 0;
        int quantidadeTotal = 0;
        System.out.print("Quantas peças diferentes? ");
        quantidadeTotal = scanner.nextInt();

        for (int i = 0; i<quantidadeTotal; i++) {
            int peçaAtual = i+1;
            System.out.print("Quantas da "+peçaAtual+ "ª peça? ");
            quantidade[i] = scanner.nextInt();
            System.out.print("Preço da "+peçaAtual+ "ª peça? ");
            valor[i] = scanner.nextInt();
        }

        for (int i = 0; i< valor.length; i++) {
            if (valor[i] != 0) {
                comissao += valor[i]*quantidade[i];
            }
        }
        comissao *= 0.05;
        DecimalFormat f = new DecimalFormat("##.00");
        System.out.println(f.format(comissao));
         */

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Número: ");
        double numero = scanner.nextDouble();
        numero -= 1;
        DecimalFormat f = new DecimalFormat("##.00");
        System.out.println("Antecessor:" + f.format(numero));

         */

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Base do Retângulo: ");
        double base = scanner.nextDouble();
        System.out.print("Altura do Retângulo: ");
        double altura = scanner.nextDouble();
        double area =  base*altura;
        System.out.println("Área do Retângulo: " + area);
         */

















    }
}
