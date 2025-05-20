package afpa.fr.observer.test;

public class Main {
    public static void main(String[] args) {
        Magazine magazine = new Magazine();
        Abonne abonne1 = new Abonne("George");
        Abonne abonne2 = new Abonne("Giselle");

        magazine.abonner(abonne1);
        magazine.abonner(abonne2);

        magazine.publierNouveauNumero(1);

        magazine.desabonner(abonne1);

        magazine.publierNouveauNumero(2);
    }
}
