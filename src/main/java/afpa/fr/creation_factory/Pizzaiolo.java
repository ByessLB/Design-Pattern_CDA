package afpa.fr.creation_factory;

public abstract class Pizzaiolo {

    // public static Pizza preparePizza(String type) {
    //     if ("Regina".equalsIgnoreCase(type)) return new Regina();
    //     else if ("Pepperoni".equalsIgnoreCase(type)) return new Pepperoni();
    //     else if ("Margherita".equalsIgnoreCase(type)) return new Margherita();
    //     else return null;
    // }

    public Pizza cree() {
        Pizza pizza = preparePizza();
        pizza.prepare();
        return pizza;
    }

    protected abstract Pizza preparePizza();
}
