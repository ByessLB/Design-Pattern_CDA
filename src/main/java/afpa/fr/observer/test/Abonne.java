package afpa.fr.observer.test;

public class Abonne implements Observer {
    private String nom;

    public Abonne(String nom) {
        this.nom = nom;
    }

    /**
     * Méthode pour recevoir une notification
     */
    @Override
    public void recevoirNotification(int numero) {
        System.out.println(nom + " a reçu le magazine n° : " + numero);
    }

}
