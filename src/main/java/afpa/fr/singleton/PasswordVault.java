package afpa.fr.singleton;

import java.util.HashMap;

public class PasswordVault {
    /**
     * Instance unique de la classe
     */
    private static PasswordVault instance;
    private HashMap<String, String> passwordMap;

    // Constructeur privé pour empêcher l'instanciation directe
    private PasswordVault() {
        passwordMap = new HashMap<>();
    }

    /**
     * Retourne l'instance unique. Si l'instance n'existe pas, elle est créée
     * @return PasswordVault
     */
    public static PasswordVault getInstance() {
        if (instance == null) {
            instance = new PasswordVault();
            System.out.println("instance créée");
        }
        return instance;
    }

    /**
     * Ajouter un mot de passe pour un service
     * @param service String
     * @param password String
     */
    public void addPassword(String service, String password) {
        passwordMap.put(service, password);
    }

    /**
     * Récupérer un mot de passe pour un service
     * @param service String
     * @return String
     */
    public String getPassword(String service) {
        return passwordMap.get(service);
    }

    /**
     * affiche le service et son mot de passe
     */
    public void showMap() {
        for (String key : passwordMap.keySet()) {
            System.out.println(key + " = " + passwordMap.get(key));
        }
    }
}
