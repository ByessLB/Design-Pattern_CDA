package afpa.fr.creational_singleton;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        PasswordVault vault1 = PasswordVault.getInstance();
        PasswordVault vault2 = PasswordVault.getInstance();
        PasswordVault vault3 = PasswordVault.getInstance();

        vault1.addPassword("Netflix", "ChouxALaCreme");
        vault2.addPassword("Amazon Prime", "CremeBrulee");
        vault3.addPassword("Canal", "CrepeDentelle");

        System.out.println(Objects.toString(vault1));
        System.out.println(Objects.toString(vault2));
        System.out.println(Objects.toString(vault3));

        System.out.println(Objects.toIdentityString(vault1));

        vault3.showMap();
    }
}
