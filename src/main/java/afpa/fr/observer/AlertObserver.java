package afpa.fr.observer;

/**
 * <h3>Interface Observer</h3>
 * Définit une méthode à implémenter dans les observers
 */
public interface AlertObserver {
    /**
     * Méthode qui renvoi un message d'alert
     * @param message
     */
    void update(String message);
}
