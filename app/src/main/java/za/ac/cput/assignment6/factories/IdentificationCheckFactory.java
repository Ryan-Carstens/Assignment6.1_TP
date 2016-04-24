package za.ac.cput.assignment6.factories;

import za.ac.cput.assignment6.domain.IdentificationCheck;

/**
 * Created by Ryan Carstens 213133040.
 */
public class IdentificationCheckFactory {
    public static IdentificationCheck getIdentificationCheck(String response){
        return new IdentificationCheck.Builder()
                .response(response)
                .build();
    }
}
