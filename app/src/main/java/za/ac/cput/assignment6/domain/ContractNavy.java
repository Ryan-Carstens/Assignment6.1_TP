package za.ac.cput.assignment6.domain;

/**
 * Created by Ryan Carstens 213133040.
 */
public class ContractNavy extends Contract {

    @Override
    public String contractType(String type)
    {
        if(type.equalsIgnoreCase("Navy"))
        {
            return "Contract Navy";
        }
        else
        {
            return nextContract.contractType(type);
        }
    }
}

