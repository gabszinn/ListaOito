import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Canal: " + tv.getCanal());
        System.out.println("Volume: " + tv.getVolume());
        
        boolean continuar = true;
        while (continuar) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Alterar canal");
            System.out.println("2 - Aumentar volume");
            System.out.println("3 - Diminuir volume");
            System.out.println("0 - Sair");
            int opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("Digite o número do canal de 1 a 100:");
                    int canal = scanner.nextInt();
                    tv.setCanal(canal);
                    break;
                case 2:
                    tv.aumentarVolume();
                    break;
                case 3:
                    tv.diminuirVolume();
                    break;
                case 0:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
            
            System.out.println("Canal: " + tv.getCanal());
            System.out.println("Volume: " + tv.getVolume());
        }
        
        scanner.close();
    }
}
