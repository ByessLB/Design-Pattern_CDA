package afpa.fr.observer;

/**
 * <h3>Interface de Capteur (observer)</h3>
 * Définit les méthodes à implémenter dans les observers
 */
public interface Sensor {
    /**
     * Méthode d'inscription domotique
     * @param observer
     */
    void subscribe(AlertObserver observer);
    /**
     * Méthode de désinscription domotique
     * @param observer
     */
    void unsubscribe(AlertObserver observer);
    /**
     * Méthode de notification de détection
     */
    void notifySubscribers();
    /**
     * Méthode de simulation de notification de détection
     */
    void simulateDetectionEvent();
}
