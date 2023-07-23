import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                System.out.print("Digite um número Par para Raiz Cúbica ou Ímpar para raiz quadrada: ");
                double numero = input.nextDouble();

                if (numero % 2 == 0) {
                    double raizCubica = Math.cbrt(numero);
                    System.out.println("A Raiz cúbica de " + numero + " = " + raizCubica);
                } else {
                    double raizQuadrada = Math.sqrt(numero);
                    System.out.println("A Raiz quadrada de " + numero + " = " + raizQuadrada);
                }

                input.close();
            }

}