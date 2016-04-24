package za.ac.cput.assignment6.factories;
import org.junit.Assert;
import org.junit.Test;

import za.ac.cput.assignment6.domain.DetailsCheck;

/**
 * Created by Ryan Carstens 213133040.
 */
public class DetailsCheckTest {

    @Test
    public void testCreate() throws Exception
    {
        DetailsCheck detailsCheck = DetailsCheckFactory.getDetailsCheck("true");
        Assert.assertEquals(detailsCheck.getResponse(),"true");
    }

    @Test
    public void testUpdate() throws Exception
    {
        DetailsCheck detailsCheck = DetailsCheckFactory.getDetailsCheck("true");
        DetailsCheck updatedDetailsCheck = new DetailsCheck.Builder().copy(detailsCheck).response("false").build();
        Assert.assertEquals(updatedDetailsCheck.getResponse(),"false");
    }

}
