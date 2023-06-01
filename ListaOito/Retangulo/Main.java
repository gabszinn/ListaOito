
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Metodo retanguloMetodo = new Metodo();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe um lado:");
        retanguloMetodo.setLadoA(scanner.nextDouble());
        
        System.out.print("Informe o outro lado:");
        retanguloMetodo.setLadoB(scanner.nextDouble());

        double area = retanguloMetodo.calcularArea();
        double perimetro = retanguloMetodo.calcularPerimetro();
        
        System.out.print("A quantidade de pisos é: " + area);
        System.out.print("A quantidade de rodapés é: " + perimetro);
        
        scanner.close();
    }
}
