package afpa.fr.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * <h3>Capteur de température</h3>
 */
public class TemperatureSensor implements Sensor {
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
            observer.update("High temperature detected!");
        }
    }

    @Override
    public void simulateDetectionEvent() {
        System.out.println("TemperatureSensor: High temperature detected!");
        notifySubscribers();
    }
}
