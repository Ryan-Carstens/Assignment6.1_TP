package za.ac.cput.assignment6.factories;

import za.ac.cput.assignment6.domain.DetailsCheck;

/**
 * Created by Ryan Carstens 213133040.
 */
public class DetailsCheckFactory {

    public static DetailsCheck getDetailsCheck(String response){
        return new DetailsCheck.Builder()
                .response(response)
                .build();
    }
}
