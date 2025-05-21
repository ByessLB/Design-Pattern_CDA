package afpa.fr.factory;

public class ReginaFactory extends Pizzaiolo {

    @Override
    protected Pizza preparePizza() {
        return new Regina();
    }
}