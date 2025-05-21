package afpa.fr.factory;

public class PepperoniFactory extends Pizzaiolo {
    @Override
    protected Pizza preparePizza() {
        return new Pepperoni();
    }
}
