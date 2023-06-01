public class Metodo {
    private String nome;
    private int fome;
    private int idade;
    private int saude;

    public Metodo(String nome, int fome, int idade, int saude) {
        this.nome = nome;
        this.fome = fome;
        this.idade = idade;
        this.saude = saude;
    }

    public String getNome() {
        return nome;
    }

    public int getFome() {
        return fome;
    }

    public int getIdade() {
        return idade;
    }

    public int getSaude() {
        return saude;
    }

    public void alterarNome(String nome) {
        this.nome = nome;
    }

    public void alterarFome(int fome) {
        this.fome = fome;
    }

    public void alterarSaude(int saude) {
        this.saude = saude;
    }

    public void alterarIdade(int idade) {
        this.idade = idade;
    }

    public String calcularHumor() {
        if (fome <= 5 && saude >= 7) {
            return "Feliz :)";
        } else if (fome <= 5 && saude < 7) {
            return "Neutro :/";
        } else {
            return "Triste :(";
        }
    }
}
