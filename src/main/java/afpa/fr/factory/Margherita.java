package afpa.fr.factory;

public class Margherita implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Margherita : \n Base tomate, mozzarela, jambon");
    }
}
