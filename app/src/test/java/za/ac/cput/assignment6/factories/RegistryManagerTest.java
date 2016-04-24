package za.ac.cput.assignment6.factories;
import org.junit.Assert;
import org.junit.Test;

import za.ac.cput.assignment6.domain.RegistryManager;

/**
 * Created by Ryan Carstens 213133040.
 */

public class RegistryManagerTest {

    @Test
    public void testCreate() throws Exception
    {
        RegistryManager registryManager = RegistryManagerFactory.getRegistryManager("9004285201088", "Ray", "Ash", "rayza@gmail.com", "ray123");
        Assert.assertEquals(registryManager.getFirstName(),"Ray");
    }

    @Test
    public void testUpdate() throws Exception
    {
        RegistryManager registryManager = RegistryManagerFactory.getRegistryManager("9004285201088", "Ray", "Ash", "rayza@gmail.com", "ray123");
        RegistryManager updatedRegistryManager = new RegistryManager.Builder().copy(registryManager).firstName("Raynold").build();
        Assert.assertEquals(updatedRegistryManager.getFirstName(),"Raynold");
    }
}
