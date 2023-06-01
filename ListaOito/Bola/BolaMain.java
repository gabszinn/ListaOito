public class BolaMain {
    public static void main(String[] args) {
        BolaAtributos minhaBola = new BolaAtributos();
        
        minhaBola.setCor("Azul");
        minhaBola.setCircunferencia(10.0);
        minhaBola.setMaterial("Borracha");
        
        minhaBola.mostraCor(); 
        
        minhaBola.trocaCor("Verde");
        minhaBola.mostraCor();
    }
}