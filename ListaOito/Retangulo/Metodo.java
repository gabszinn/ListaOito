public class Metodo {
    private double ladoUm;
    private double ladoDois;

    public double getLadoA() {
        return ladoUm;
    }

    public void setLadoA(double ladoUm) {
        this.ladoUm = ladoUm;
    }

    public double getLadoB() {
        return ladoDois;
    }

    public void setLadoB(double ladoDois) {
        this.ladoDois = ladoDois;
    }

    public double calcularArea() {
        return ladoUm * ladoDois;
    }

    public double calcularPerimetro() {
        return 2 * (ladoUm + ladoDois);
    }
}
