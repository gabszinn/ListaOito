public class Quadrado {
    private double lado;
    
    public void mudarValorLado(double novoLado) {
        lado = novoLado;
    }
    
    public double retornarValorLado() {
        return lado;
    }
    
    public double calcularArea() {
        return lado * lado;
    }
    
    public double getLado() {
        return lado;
    }
    
    public void setLado(double lado) {
        this.lado = lado;
    }
}
