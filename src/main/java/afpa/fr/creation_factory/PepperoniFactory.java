package afpa.fr.creation_factory;

public class PepperoniFactory extends Pizzaiolo {
    @Override
    protected Pizza preparePizza() {
        return new Pepperoni();
    }
}
