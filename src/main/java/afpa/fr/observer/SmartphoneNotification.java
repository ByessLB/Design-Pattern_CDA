package afpa.fr.observer;

/**
 * <h3>Notification sur application mobile</h3>
 */
public class SmartphoneNotification implements AlertObserver {

    @Override
    public void update(String message) {
        System.out.println("SmarthponeNotification: Sending notification - " + message);
    }
}
