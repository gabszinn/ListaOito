public class TV {
    private int canal;
    private int volume;

    public TV() {
        canal = 1;
        volume = 50;
    }

    public int getCanal() {
        return canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setCanal(int canal) {
        if (canal >= 1 && canal <= 100) {
            this.canal = canal;
        } else {
            System.out.println("Canal inválido.");
        }
    }

    public void aumentarVolume() {
        if (volume < 100) {
            volume++;
        } else {
            System.out.println("Volume máximo alcançado.");
        }
    }

    public void diminuirVolume() {
        if (volume > 0) {
            volume--;
        } else {
            System.out.println("Volume mínimo alcançado.");
        }
    }
}
