package afpa.fr.facade.test;

/**
 * Sous-système représentant un CPU
 */
public class CPU {
    /**
     * Méthode permettant le démarrage du CPU
     */
    public void start() {
        System.out.println("CPU démarré");
    }

    /**
     * Méthode représentant l'exécution d'instruction par le CPU
     */
    public void execute() {
        System.out.println("CPU exécute les instructions");
    }

    /**
     * Méthode permettant l'arrêt du CPU
     */
    public void stop() {
        System.out.println("CPU arrêté");
    }
}
