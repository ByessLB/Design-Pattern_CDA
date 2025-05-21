package afpa.fr.observer;

/**
 * <h3>Appel direct des secours</h3>
 */
public class EmergencyCall implements AlertObserver {
    @Override
    public void update(String message) {
        System.out.println("EmergencyCall: Calling emergency services - " + message);
    }
}
