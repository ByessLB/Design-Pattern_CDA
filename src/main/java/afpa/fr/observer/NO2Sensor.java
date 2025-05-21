package afpa.fr.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * <h3>Capteur de dioxide d'azote</h3>
 */
public class NO2Sensor implements Sensor {
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
            observer.update("High NO2 levels detected!");
        }
    }

    @Override
    public void simulateDetectionEvent() {
        System.out.println("NO2Sensor: High NO2 levels detected!");
        notifySubscribers();
    }
}
