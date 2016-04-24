package za.ac.cput.assignment6.factories;

import za.ac.cput.assignment6.domain.Recruit;

/**
 * Created by Ryan Carstens 213133040.
 */

public class RecruitFactory {
    public static Recruit getRecruit(String southAfricanID, String firstName, String lastName){
        return new Recruit.Builder()
                .southAfricanID(southAfricanID)
                .firstName(firstName)
                .lastName(lastName)
                .build();
    }
}
