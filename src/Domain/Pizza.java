package Domain;

public class Pizza extends Produto {

    private boolean borda;

    public Pizza(String categoria, double preco, String sabor, boolean borda) {
        super(categoria, preco, sabor);
        this.borda = borda;

    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.print("Bordar: " + this.borda + "\n");
        System.out.println("------------");
    }

}

