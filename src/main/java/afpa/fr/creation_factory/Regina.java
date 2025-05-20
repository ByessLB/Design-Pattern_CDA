package afpa.fr.creation_factory;

public class Regina implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Regina : \nBase tomate, mozzarela, jambon, champignon");
    }
    
}
