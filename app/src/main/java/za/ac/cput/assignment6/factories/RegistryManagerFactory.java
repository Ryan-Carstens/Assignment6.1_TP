package za.ac.cput.assignment6.factories;

import za.ac.cput.assignment6.domain.RegistryManager;

/**
 * Created by Ryan Carstens 213133040.
 */
public class RegistryManagerFactory {
    public static RegistryManager getRegistryManager(String southAfricanID, String firstName, String lastName, String email, String password){
        return new RegistryManager.Builder()
                .southAfricanID(southAfricanID)
                .firstName(firstName)
                .lastName(lastName)
                .email(email)
                .password(password)
                .build();
    }
}
