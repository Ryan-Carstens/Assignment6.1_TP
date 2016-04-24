package za.ac.cput.assignment6.domain;

/**
 * Created by Ryan Carstens 213133040.
 */
public class ContractArmy extends Contract{

    @Override
    public String contractType(String type)
    {
        if(type.equalsIgnoreCase("Army"))
        {
            return "Contract Army";
        }
        else
        {
            return nextContract.contractType(type);
        }
    }
}
