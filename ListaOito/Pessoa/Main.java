public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 10, 70.0, 111.5);
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Peso: " + pessoa.getPeso());
        System.out.println("Altura: " + pessoa.getAltura());

        pessoa.envelhecer();
        pessoa.engordar(5.0);
        pessoa.emagrecer(3.0);
        pessoa.crescer(2.0);
        System.out.println("Nova idade: " + pessoa.getIdade());
        System.out.println("Novo peso: " + pessoa.getPeso());
        System.out.println("Nova altura: " + pessoa.getAltura());
    }
}
