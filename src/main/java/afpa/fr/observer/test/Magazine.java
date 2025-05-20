package afpa.fr.observer.test;

import java.util.ArrayList;
import java.util.List;

// Sujet (Magazine)
public class Magazine {
    private List<Observer> abonnes = new ArrayList<>();

    /**
     * Méthode pour s'abonner
     * @param abonne
     */
    public void abonner(Observer abonne) {
        abonnes.add(abonne);
    }

    /**
     * Méthode pour se désabonner
     * @param abonne
     */
    public void desabonner(Observer abonne) {
        abonnes.remove(abonne);
    }

    public void publierNouveauNumero(int numero) {
        for (Observer abonne : abonnes) {
            abonne.recevoirNotification(numero);
        }
    }
}
