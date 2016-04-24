package za.ac.cput.assignment6.factories;
import org.junit.Assert;
import org.junit.Test;

import za.ac.cput.assignment6.domain.ContractNavy;
import za.ac.cput.assignment6.domain.Contract;
/**
 * Created by Ryan Carstens 213133040.
 */

public class ContractTest {

    @Test
    public void testContract() throws Exception
    {
        Contract contractNavy = new ContractNavy();
        Assert.assertSame(contractNavy.contractType("navy"),"Contract Navy");
    }
}
