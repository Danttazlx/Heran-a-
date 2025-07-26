package TestMain;

import Domain.Pizza;
import Domain.Sobremesa;

public class HerancaTest {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("Pizza",40.00, "Calabresa Com Queijo");
        pizza.imprime();

        Sobremesa sobremesa = new Sobremesa("sobremesa", 20.00,"bolo de Chocolate");
        sobremesa.imprime();
    }


}
