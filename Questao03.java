import java.util.Scanner;

public class Main {
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                System.out.println("Digite o seu nome: ");
                String nome = input.nextLine();

                System.out.println("Agora digite o seu sobrenome: ");
                String sobrenome = input.nextLine();

                if (sobrenome.equalsIgnoreCase("Wayne")) {
                    System.out.println("Acesso liberado, Sr. Wayne");
                } else if (sobrenome.equalsIgnoreCase("Kent")) {
                    System.out.println("Saí daí, mané!");
                } else if (nome.equalsIgnoreCase("Diana")) {
                    System.out.println("Bem-vinda, Princesa de Themyscara");
                } else {
                    System.out.println("Cai fora!");
                }
            }

}