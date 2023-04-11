import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a temperatura que deseja converter: ");
        double temp = input.nextDouble();
        System.out.print("Digite a escala (F, C ou K): ");
        String escala = input.next();

        double resultado = 0;

        switch (escala) {
            case "F":
            case "f":
                resultado = (temp - 32) * 5 / 9;
                System.out.println(temp + "°F é equivalente a " + resultado + "°C ou " + (resultado + 273.15) + "K");
                break;
            case "C":
            case "c":
                resultado = temp * 9 / 5 + 32;
                System.out.println(temp + "°C é equivalente a " + resultado + "°F ou " + (temp + 273.15) + "K");
                break;
            case "K":
            case "k":
                resultado = temp - 273.15;
                System.out.println(temp + "K é equivalente a " + resultado + "°C ou " + (resultado * 9 / 5 + 32) + "°F");
                break;
            default:
                System.out.println("Desculpe, escala inválida!");
                break;
        }
    }
}