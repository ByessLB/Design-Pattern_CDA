package afpa.fr.factory;

public class Main {
    public static void main(String[] args) {
        ReginaFactory regina = new ReginaFactory();
        regina.cree();

        PepperoniFactory pepperoni = new PepperoniFactory();
        pepperoni.cree();
    }
}
