package afpa.fr.observer;

/**
 * <h3>Déclenchement d'une alarme</h3>
 */
public class AlarmTrigger implements AlertObserver {
    @Override
    public void update(String message) {
        System.out.println("AlarmTrigger: Triggering alarm - " + message);
    }
}
