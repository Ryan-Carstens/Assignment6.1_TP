package za.ac.cput.assignment6.factories;
import org.junit.Assert;
import org.junit.Test;

import za.ac.cput.assignment6.domain.Recruit;

/**
 * Created by Ryan Carstens 213133040.
 */

public class RecruitTest {
    
    @Test
    public void testCreate() throws Exception
    {
        Recruit recruit = RecruitFactory.getRecruit("9004275201088", "Rob", "Ash");
        Assert.assertEquals(recruit.getFirstName(),"Rob");
    }

    @Test
    public void testUpdate() throws Exception
    {
        Recruit recruit = RecruitFactory.getRecruit("9004275201088", "Rob", "Ash");
        Recruit updatedRecruit = new Recruit.Builder().copy(recruit).firstName("Robbie").build();
        Assert.assertEquals(updatedRecruit.getFirstName(),"Robbie");
    }
}
