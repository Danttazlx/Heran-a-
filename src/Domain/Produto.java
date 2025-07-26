package Domain;

public class Produto {
    private String categoria;
    private double preco;
    private String sabor;

    Produto(String categoria, double preco,String sabor) {
        this.categoria = categoria;
        this.preco = preco;

        this.sabor = sabor;
    }


    public void imprime() {
        System.out.println("--------------------");
        System.out.println("Fast Food: " + categoria);
        System.out.println("sabor: " + sabor);
        System.out.println("preco: " + preco);
    }

}
