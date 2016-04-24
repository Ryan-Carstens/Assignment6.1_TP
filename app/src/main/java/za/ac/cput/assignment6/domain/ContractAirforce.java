package za.ac.cput.assignment6.domain;

/**
 * Created by Ryan Carstens 213133040.
 */
public class ContractAirforce extends Contract {

    @Override
    public String contractType(String type)
    {
        if(type.equalsIgnoreCase("Airforce"))
        {
            return "Contract Airforce";
        }
        else
        {
            return nextContract.contractType(type);
        }
    }
}
