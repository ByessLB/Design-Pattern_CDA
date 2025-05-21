package afpa.fr.observer.test;

import java.util.ArrayList;
import java.util.List;

/**
 * <h3>Sujet (Magazine)</h3>
 * <p>Maintient une liste d'abonnés</p>
 * <br>
 * <p>fournit des méthodes pour s'abonner, se désabonner et publier un nouveau numéro</p>
 */
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

    /**
     * Méthode pour publier un nouveau numéro
     * @param numero
     */
    public void publierNouveauNumero(int numero) {
        for (Observer abonne : abonnes) {
            abonne.recevoirNotification(numero);
        }
    }
}
