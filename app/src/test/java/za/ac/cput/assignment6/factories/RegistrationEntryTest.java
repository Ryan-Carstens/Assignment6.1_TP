package za.ac.cput.assignment6.factories;
import org.junit.Assert;
import org.junit.Test;

import za.ac.cput.assignment6.domain.RegistrationEntry;

/**
 * Created by Ryan Carstens 213133040.
 */

public class RegistrationEntryTest {
    
    @Test
    public void testCreate() throws Exception
    {
        RegistrationEntry registrationEntry = RegistrationEntryFactory.getRegistrationEntry("9004275201088", "Male", "Navy");
        Assert.assertEquals(registrationEntry.getPlacementChoice(),"Navy");
    }

    @Test
    public void testUpdate() throws Exception
    {
        RegistrationEntry registrationEntry = RegistrationEntryFactory.getRegistrationEntry("9004275201088", "Male", "Navy");
        RegistrationEntry updatedRegistrationEntry = new RegistrationEntry.Builder().copy(registrationEntry).placementChoice("Army").build();
        Assert.assertEquals(updatedRegistrationEntry.getPlacementChoice(),"Army");
    }
}
