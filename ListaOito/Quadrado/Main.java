public class Main {
    public static void main(String[] args) {
        Quadrado meuQuadrado = new Quadrado();
        
        meuQuadrado.setLado(5.0);
        
        double lado = meuQuadrado.retornarValorLado();
        System.out.println("O valor do lado é: " + lado); 
        
        double area = meuQuadrado.calcularArea();
        System.out.println("A área do quadrado é: " + area); 
        
        meuQuadrado.mudarValorLado(7.0);
        
        lado = meuQuadrado.getLado();
        System.out.println("O novo valor do lado é: " + lado); 
        
        area = meuQuadrado.calcularArea();
        System.out.println("A nova área do quadrado é: " + area); 
    }
}
