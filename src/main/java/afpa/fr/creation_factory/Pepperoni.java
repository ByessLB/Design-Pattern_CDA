package afpa.fr.creation_factory;

public class Pepperoni implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Pepperoni : \nBase tomate, mozzarela, pepperoni");
    }
}
