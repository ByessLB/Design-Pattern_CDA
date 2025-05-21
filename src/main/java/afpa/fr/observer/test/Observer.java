package afpa.fr.observer.test;

/**
 * <h3>Interface Observer</h3>
 * Définit une méthode que tous les observateurs doivent implémenter
 */
public interface Observer {
    /**
     * Méthode que renvoie une notification
     * @param numero
     */
    void recevoirNotification(int numero);
}
