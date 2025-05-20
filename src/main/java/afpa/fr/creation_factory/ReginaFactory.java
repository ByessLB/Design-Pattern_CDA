package afpa.fr.creation_factory;

public class ReginaFactory extends Pizzaiolo {

    @Override
    protected Pizza preparePizza() {
        return new Regina();
    }
}