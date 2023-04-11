import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double num1 = input.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = input.nextDouble();

        System.out.println("Selecione a operação:");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Potência");
        System.out.println("6 - Raiz quadrada");
        System.out.println("7 - Raiz cúbica");

        int op = input.nextInt();
        double result = 0;

        switch(op) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                result = num1 / num2;
                break;
            case 5:
                result = Math.pow(num1, num2);
                break;
            case 6:
                result = Math.sqrt(num1);
                break;
            case 7:
                result = Math.cbrt(num1);
                break;
            default:
                System.out.println("Operação inválida");
        }

        System.out.println("O resultado é: " + result);
    }
}