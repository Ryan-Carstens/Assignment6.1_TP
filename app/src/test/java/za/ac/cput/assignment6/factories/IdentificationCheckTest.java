package za.ac.cput.assignment6.factories;
import org.junit.Assert;
import org.junit.Test;

import za.ac.cput.assignment6.domain.IdentificationCheck;

/**
 * Created by Ryan Carstens 213133040.
 */

public class IdentificationCheckTest {
    
    @Test
    public void testCreate() throws Exception
    {
        IdentificationCheck identificationCheck = IdentificationCheckFactory.getIdentificationCheck(true);
        Assert.assertEquals(identificationCheck.getResponse(),true);
    }

    @Test
    public void testUpdate() throws Exception
    {
        IdentificationCheck identificationCheck = IdentificationCheckFactory.getIdentificationCheck(true);
        IdentificationCheck updatedIdentificationCheck = new IdentificationCheck.Builder().copy(identificationCheck).response(false).build();
        Assert.assertEquals(updatedIdentificationCheck.getResponse(),false);
    }
}
