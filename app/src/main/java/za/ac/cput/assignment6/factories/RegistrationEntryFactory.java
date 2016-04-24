package za.ac.cput.assignment6.factories;

import za.ac.cput.assignment6.domain.RegistrationEntry;

/**
 * Created by Ryan Carstens 213133040.
 */
public class RegistrationEntryFactory {
    public static RegistrationEntry getRegistrationEntry(String southAfricanID, String gender, String placementChoice){
        return new RegistrationEntry.Builder()
                .southAfricanID(southAfricanID)
                .gender(gender)
                .placementChoice(placementChoice)
                .build();
    }
}
