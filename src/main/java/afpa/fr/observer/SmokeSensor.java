package afpa.fr.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * <h3>Capteur de fumé</h3>
 */
public class SmokeSensor implements Sensor {
    private List<AlertObserver> observers = new ArrayList<>();

    @Override
    public void subscribe(AlertObserver observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(AlertObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for (AlertObserver observer : observers) {
            observer.update("Smoke detected!");
        }
    }

    @Override
    public void simulateDetectionEvent() {
        System.out.println("SmokeSensor: Smoke detected!");
        notifySubscribers();
    }
}
