package afpa.fr.factory;

public abstract class Pizzaiolo {

    public Pizza cree() {
        Pizza pizza = preparePizza();
        pizza.prepare();
        return pizza;
    }

    protected abstract Pizza preparePizza();
}
