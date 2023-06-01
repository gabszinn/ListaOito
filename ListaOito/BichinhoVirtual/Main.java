import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Olá, sou o Tamagushi, seu bichinho virtual. Quer saber como estou?");

        Scanner scanner = new Scanner(System.in);
        String resposta = scanner.nextLine();

        if (resposta.equalsIgnoreCase("sim")) {
            Metodo bichinhoAtributos = new Metodo("Daniel", 2, 8, 10);

            System.out.println("Nome: " + bichinhoAtributos.getNome());
            System.out.println("Idade: " + bichinhoAtributos.getIdade());
            System.out.println("Fome: " + bichinhoAtributos.getFome());
            System.out.println("Saúde: " + bichinhoAtributos.getSaude());
            System.out.println("Humor: " + bichinhoAtributos.calcularHumor());
        } else {
            System.out.println("Okay, então até a próxima!");
            scanner.close();
        }
    }
}
