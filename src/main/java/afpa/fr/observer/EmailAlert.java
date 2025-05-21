package afpa.fr.observer;

/**
 * <h3>Envoi d'email automatisé</h3>
 */
public class EmailAlert implements AlertObserver {
    @Override
    public void update(String message) {
        System.out.println("EmailAlert: Sending email - " + message);
    }
}
