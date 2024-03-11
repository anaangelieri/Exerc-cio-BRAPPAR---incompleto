public class Quadrado extends Bidimensional{
    public Quadrado (String nome, int dimensao, double comprimento, double largura){
        super(nome, dimensao, comprimento, largura);
    }

    public double area() {
        return getComprimento() * getLargura();
    }

    public String toString() {
        return "Forma: "+ this.getNome() + "Dimensão: " + this.getDimensao() + 
    }
}
